//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package modbus;

import com.serotonin.modbus4j.exception.ModbusInitException;
import com.serotonin.modbus4j.exception.ModbusTransportException;
import com.serotonin.modbus4j.msg.ModbusRequest;
import com.serotonin.modbus4j.msg.ModbusResponse;
import com.serotonin.modbus4j.serial.SerialMaster;
import com.serotonin.modbus4j.serial.SerialPortWrapper;
import com.serotonin.modbus4j.serial.SerialWaitingRoomKeyFactory;
import com.serotonin.modbus4j.serial.rtu.*;
import com.serotonin.modbus4j.sero.ShouldNeverHappenException;
import com.serotonin.modbus4j.sero.messaging.MessageControl;
import com.serotonin.modbus4j.sero.messaging.RequestHandler;
import com.serotonin.modbus4j.sero.messaging.StreamTransport;
import java.io.IOException;

public class RtuMaster extends SerialMaster {
    private MessageControl conn;

    public RtuMaster(SerialPortWrapper wrapper) {
        super(wrapper);
    }

    public void init() throws ModbusInitException {
        super.init();
        RtuMessageParser rtuMessageParser = new RtuMessageParser(true);
        this.conn = this.getMessageControl();

        try {
            this.conn.start(this.transport, rtuMessageParser, (RequestHandler)null, new SerialWaitingRoomKeyFactory());
            if (this.getePoll() == null) {
                ((StreamTransport)this.transport).start("Modbus 1111RTU master");
            }
        } catch (IOException var3) {
            throw new ModbusInitException(var3);
        }

        this.initialized = true;
    }

    public void destroy() {
        this.closeMessageControl(this.conn);
        super.close();
        this.initialized = false;
    }

    public ModbusResponse sendImpl(ModbusRequest request) throws ModbusTransportException {
        RtuMessageRequest rtuRequest = new RtuMessageRequest(request);

        try {
            RtuMessageResponse rtuResponse = (RtuMessageResponse)this.conn.send(rtuRequest);
            ModbusResponse var4;
            if (rtuResponse == null) {
                var4 = null;
                return var4;
            } else {
                var4 = rtuResponse.getModbusResponse();
                return var4;
            }
        } catch (Exception var8) {
            throw new ModbusTransportException(var8, request.getSlaveId());
        } finally {
            ;
        }
    }

    public static long computeMessageFrameSpacing(SerialPortWrapper wrapper) {
        if (wrapper.getBaudRate() > 19200) {
            return 1750000L;
        } else {
            float charTime = computeCharacterTime(wrapper);
            return (long)(charTime * 3.5F);
        }
    }

    public static long computeCharacterSpacing(SerialPortWrapper wrapper) {
        if (wrapper.getBaudRate() > 19200) {
            return 750000L;
        } else {
            float charTime = computeCharacterTime(wrapper);
            return (long)(charTime * 1.5F);
        }
    }

    public static float computeCharacterTime(SerialPortWrapper wrapper) {
        float charBits = (float)wrapper.getDataBits();
        switch(wrapper.getStopBits()) {
            case 1:
                break;
            case 2:
                charBits += 2.0F;
                break;
            case 3:
                ++charBits;
                break;
            default:
                throw new ShouldNeverHappenException("Unknown stop bit size: " + wrapper.getStopBits());
        }

        if (wrapper.getParity() > 0) {
            ++charBits;
        }

        return charBits / (float)wrapper.getBaudRate() * 1.0E9F;
    }
}

package modbus;

import java.util.Arrays;



import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.serotonin.modbus4j.exception.ModbusTransportException;
import com.serotonin.modbus4j.msg.ReadDiscreteInputsRequest;
import com.serotonin.modbus4j.msg.ReadDiscreteInputsResponse;
import com.serotonin.modbus4j.msg.ReadHoldingRegistersRequest;
import com.serotonin.modbus4j.msg.ReadHoldingRegistersResponse;
import com.serotonin.modbus4j.msg.WriteRegistersRequest;
import com.serotonin.modbus4j.msg.WriteRegistersResponse;
import com.serotonin.modbus4j.serial.SerialPortWrapper;
/**
 * Created by wangbl on 2018/7/17.
 */
/**
 * 通过串口解析MODBUS协议
 * @author cl2
 *
 * java使用modbus4j示例如下，特别注意：
 * 如果想轮询去读数据，需要for循环调readHoldingRegistersTest(master,SLAVE_ADDRESS,0,100);
 * 并且serialParameters.setStopBits(1); 修改为serialParameters.setStopBits(2);
 */
public class ModBus4jTest {
    //设定MODBUS网络上从站地址
    private final static int SLAVE_ADDRESS = 1;
    // 串行波特率
    private final static int BAUD_RATE = 9600;

    public static void main(String[] args) {
        // 设定MODBUS通讯的串行口
        String commPortId = "COM1";
        // 设定端口波特率
        int baudRate = 9600;
        int flowControlIn = 0;
        int flowControlOut = 0;
        // 设定成数据位是8位
        int dataBits = 8;
        // 设定为1个停止位
        int stopBits = 1;
        // 设定成无奇偶校验
        int parity = 0;

        TestSerialPortWrapper wrapper = new TestSerialPortWrapper(commPortId, baudRate, flowControlIn, flowControlOut, dataBits, stopBits, parity);
        // 创建ModbusFactory工厂实例
        ModbusFactory modbusFactory = new ModbusFactory();
        // 创建ModbusMaster实例
        ModbusMaster master = modbusFactory.createRtuMaster(wrapper);

        // 初始化
        try {
            master.init();
            //readHoldingRegistersTest(master,SLAVE_ADDRESS,0,100);
            readDiscreteInputTest(master,1,0,10);
           // writeRegistersTest(master,3, 0, new short[]{0x31,0xb,0xc,0xd,0xe,0x9, 0x8, 0x7, 0x6} );
            readHoldingRegistersTest(master,1,0,10);
        } catch (ModbusInitException e) {
            e.printStackTrace();
        } finally {
            master.destroy();
        }

    }

    /**
     * 读开关量型的输入信号
     * @param master 主站
     * @param slaveId 从站地址
     * @param start 起始偏移量
     * @param len 待读的开关量的个数
     */
    private static void readDiscreteInputTest(ModbusMaster master, int slaveId, int start, int len) {
        try {
            ReadDiscreteInputsRequest request = new ReadDiscreteInputsRequest(slaveId, start, len);
            ReadDiscreteInputsResponse response = (ReadDiscreteInputsResponse) master.send(request);
            if (response.isException())
                System.out.println("Exception response: message=" + response.getExceptionMessage());
            else
                System.out.println(Arrays.toString(response.getBooleanData()));
        }
        catch (ModbusTransportException e) {
            e.printStackTrace();
        }
    }



    /**
     * 读保持寄存器上的内容
     * @param master 主站
     * @param slaveId 从站地址
     * @param start 起始地址的偏移量
     * @param len 待读寄存器的个数
     */
    private static void readHoldingRegistersTest(ModbusMaster master,
                                                 int slaveId, int start, int len) {
        try {
            ReadHoldingRegistersRequest request = new ReadHoldingRegistersRequest(
                    slaveId, start, len);
            ReadHoldingRegistersResponse response = (ReadHoldingRegistersResponse) master
                    .send(request);
            if (response.isException()) {
                System.out.println("Exception response: message="
                        + response.getExceptionMessage());
            } else {
                System.out.println(Arrays.toString(response.getShortData()));
                short[] list = response.getShortData();
                for(int i = 0; i < list.length; i++){
                    System.out.print(list[i] + " ");
                }
            }
        } catch (ModbusTransportException e) {
            e.printStackTrace();
        }
    }



    /**
     * 批量写数据到保持寄存器
     * @param master 主站
     * @param slaveId 从站地址
     * @param start 起始地址的偏移量
     * @param values 待写数据
     */
    public static void writeRegistersTest(ModbusMaster master, int slaveId, int start, short[] values) {
        try {
            WriteRegistersRequest request = new WriteRegistersRequest(slaveId, start, values);
            WriteRegistersResponse response = (WriteRegistersResponse) master.send(request);
            if (response.isException()){
                System.out.println("Exception response: message=" + response.getExceptionMessage());
            }
            else {
                System.out.println("Success");
            }
        }
        catch (ModbusTransportException e) {
            e.printStackTrace();
        }
    }
    public static void writeRegistersTest1(ModbusMaster master, int slaveId, int start, short[] values) {
        try {
            WriteRegistersRequest request = new WriteRegistersRequest(slaveId, start, values);
            WriteRegistersResponse response = (WriteRegistersResponse) master.send(request);
            if (response.isException())
                System.out.println("Exception response: message=" + response.getExceptionMessage());
            else
                System.out.println("Success");
        }
        catch (ModbusTransportException e) {
            e.printStackTrace();
        }
    }
}

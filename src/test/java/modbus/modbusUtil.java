package modbus;


//import com.serotonin.io.serial.SerialParameters;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusTransportException;
import com.serotonin.modbus4j.msg.*;

import java.util.Arrays;

/**
 * Created by zuoyue on 2018/7/17.
 */
public class modbusUtil {
//    /**
//     * 查询Function 为Input Status的寄存器
//     *
//     * @param ip
//     * @param address
//     * @param slaveId
//     * @return
//     */
//
//
//    public static int readDigitalInput(String ip, int port, int address, int slaveId) {
//        int data = 0;
//
//        try {
//            InetAddress addr = InetAddress.getByName(ip);
//
//            // 建立连接
//            TCPMasterConnection con = new TCPMasterConnection(addr);
//
//            con.setPort(port);
//
//            con.connect();
//
//            // 第一个参数是寄存器的地址，第二个参数时读取多少个
//            ReadInputDiscretesRequest req = new ReadInputDiscretesRequest(address, 1);
//
//            // 这里设置的Slave Id, 读取的时候这个很重要
//            req.setUnitID(slaveId);
//
//            ModbusTCPTransaction trans = new ModbusTCPTransaction(con);
//
//            trans.setRequest(req);
//
//            // 执行查询
//            trans.execute();
//
//            // 得到结果
//            ReadInputDiscretesResponse res = (ReadInputDiscretesResponse) trans.getResponse();
//            System.out.println(res);
//            if(res.getDiscretes().getBit(0)){
//                data = 1;
//            }
//            // 关闭连接
//            con.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return data;
//    }
//
//    public static int readInputRegister(String ip, int port, int address,
//                                        int slaveId) {
//        int data = 0;
//
//        try {
//            InetAddress addr = InetAddress.getByName(ip);
//            TCPMasterConnection con = new TCPMasterConnection(addr);
//
//            //Modbus.DEFAULT_PORT;
//            con.setPort(port);
//            con.connect();
//
//            //这里重点说明下，这个地址和数量一定要对应起来
//            ReadInputRegistersRequest req = new ReadInputRegistersRequest(address, 1);
//
//            //这个SlaveId一定要正确
//            req.setUnitID(slaveId);
//
//            ModbusTCPTransaction trans = new ModbusTCPTransaction(con);
//
//            trans.setRequest(req);
//
//            trans.execute();
//
//            ReadInputRegistersResponse res = (ReadInputRegistersResponse) trans.getResponse();
//
//            data = res.getRegisterValue(0);
//
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return data;
//    }
//
//
//    public static int readDigitalOutput(String ip, int port, int address,
//                                        int slaveId) {
//        int data = 0;
//        try {
//            InetAddress addr = InetAddress.getByName(ip);
//
//            TCPMasterConnection con = new TCPMasterConnection(addr);
//            con.setPort(port);
//            con.connect();
//
//            ReadCoilsRequest req = new ReadCoilsRequest(address, 1);
//
//            req.setUnitID(slaveId);
//
//            ModbusTCPTransaction trans = new ModbusTCPTransaction(con);
//
//            trans.setRequest(req);
//
//            trans.execute();
//
//            ReadCoilsResponse res = ((ReadCoilsResponse) trans.getResponse());
//
//            if(res.getCoils().getBit(0)){
//                data = 1;
//            }
//
//            con.close();
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//        return data;
//    }
//
//    public static int readRegister(String ip, int port, int address,
//                                   int slaveId) {
//        int data = 0;
//        try {
//            InetAddress addr = InetAddress.getByName(ip);
//
//            TCPMasterConnection con = new TCPMasterConnection(addr);
//
//            con.setPort(port);
//            con.connect();
//            ReadMultipleRegistersRequest req = new ReadMultipleRegistersRequest(address, 1);
//            req.setUnitID(slaveId);
//
//            ModbusTCPTransaction trans = new ModbusTCPTransaction(con);
//
//            trans.setRequest(req);
//
//            trans.execute();
//
//            ReadMultipleRegistersResponse res = (ReadMultipleRegistersResponse) trans.getResponse();
//
//            data = res.getRegisterValue(0);
//
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return data;
//    }
//
//    /**
//     * 写入数据到真机，数据类型是RE
//     *
//     * @param ip
//     * @param port
//     * @param slaveId
//     * @param address
//     * @param value
//     */
//    public static void writeRegister(String ip, int port, int slaveId,
//                                     int address, int value) {
//
//        try {
//            InetAddress addr = InetAddress.getByName(ip);
//
//            TCPMasterConnection connection = new TCPMasterConnection(addr);
//            connection.setPort(port);
//            connection.connect();
//
//            ModbusTCPTransaction trans = new ModbusTCPTransaction(connection);
//
//            UnityRegister register = new UnityRegister(value);
//
//            WriteSingleRegisterRequest req = new WriteSingleRegisterRequest(
//                    address, register);
//
//            req.setUnitID(slaveId);
//            trans.setRequest(req);
//
//            System.out.println("ModbusSlave: FC" + req.getFunctionCode()
//                    + " ref=" + req.getReference() + " value="
//                    + register.getValue());
//            trans.execute();
//
//            connection.close();
//        } catch (Exception ex) {
//            System.out.println("Error in code");
//            ex.printStackTrace();
//        }
//    }
//
//    /**
//     * 写入数据到真机的DO类型的寄存器上面
//     *
//     * @param ip
//     * @param port
//     * @param slaveId
//     * @param address
//     * @param value
//     */
//    public static void writeDigitalOutput(String ip, int port, int slaveId,
//                                          int address, int value) {
//
//        try {
//            InetAddress addr = InetAddress.getByName(ip);
//
//            TCPMasterConnection connection = new TCPMasterConnection(addr);
//            connection.setPort(port);
//            connection.connect();
//
//            ModbusTCPTransaction trans = new ModbusTCPTransaction(connection);
//
//            boolean val = true;
//
//            if (value == 0) {
//                val = false;
//            }
//
//            WriteCoilRequest req = new WriteCoilRequest(address, val);
//
//            req.setUnitID(slaveId);
//            trans.setRequest(req);
//
//            trans.execute();
//            connection.close();
//        } catch (Exception ex) {
//            System.out.println("writeDigitalOutput Error in code");
//            ex.printStackTrace();
//        }
//    }
//
//
//    @RequestMapping(value="/modbusdata")
//    public int modbusdata(String ip,int port,int address,int slaveId) throws Exception{
////        int port = 502;//Modbus.DEFAULT_PORT;
//        TCPMasterConnection con = null; // the connection
//        ModbusTCPTransaction trans = null; // the transaction
//        ReadInputRegistersRequest req = null; // the request
//        ReadInputRegistersResponse res = null; // the response
//        InetAddress addr= InetAddress.getByName(ip);
//        con = new TCPMasterConnection(addr);
//        con.setPort(port);
//        con.connect();
//        // 0 表示<span style="color: #000000;">寄存器的起始地址</span>
//        // 3 表示要<span style="color: #000000;">读取的数量</span>
//            req = new ReadInputRegistersRequest(address, 1);
//            // 此处1表示之前在Modbus Slave中选中的Function:Input Status(1x)
//            req.setUnitID(slaveId);
//            trans = new ModbusTCPTransaction(con);
//            trans.setRetries(5);
//            trans.setRequest(req);
//            int k = 0;
//            trans.execute();
//            res = (ReadInputRegistersResponse) trans.getResponse();
//            System.out.println("Digital Inputs Status=" + res.getRegisterValue(0));
//            int value = res.getRegisterValue(0);
//            k++;
//        con.close();
//        return value;
//    }




    public static void main(String[] args) throws Exception {
       /* SerialParameters serialParameters = new SerialParameters();
        //设定MODBUS通讯的串行口
        serialParameters.setCommPortId("COM1");
        //设定成无奇偶校验
        serialParameters.setParity(0);
        //设定成数据位是8位
        serialParameters.setDataBits(8);
        //设定为1个停止位
        serialParameters.setStopBits(1);
        serialParameters.setPortOwnerName("Numb nuts");
        //串行口上的波特率
        serialParameters.setBaudRate(9600);
        ModbusFactory modbusFactory = new ModbusFactory();*/
        /*ModbusMaster master = modbusFactory.createRtuMaster(serialParameters);
        try {
            master.init();
            readDiscreteInputTest(master,3,0,10);
            writeRegistersTest(master,3, 0, new short[]{0x31,0xb,0xc,0xd,0xe,0x9, 0x8, 0x7, 0x6} );
            readHoldingRegistersTest(master,3,0,10);
        }
        finally {
            master.destroy();
        }*/
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


    private static void readHoldingRegistersTest(ModbusMaster master, int slaveId, int start, int len) {
        try {
            ReadHoldingRegistersRequest request = new ReadHoldingRegistersRequest(slaveId, start, len);
            ReadHoldingRegistersResponse response = (ReadHoldingRegistersResponse) master.send(request);
            if (response.isException())
                System.out.println("Exception response: message=" + response.getExceptionMessage());
            else
                System.out.println(Arrays.toString(response.getShortData()));
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
     */

    public static void writeRegistersTest(ModbusMaster master, int slaveId, int start, short[] values) {
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
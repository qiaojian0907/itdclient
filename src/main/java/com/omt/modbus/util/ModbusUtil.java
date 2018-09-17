package com.omt.modbus.util;

import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusTransportException;
import com.serotonin.modbus4j.ip.IpParameters;
import com.serotonin.modbus4j.msg.*;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.*;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ModbusUtil {

    /*public static void main(String[] args) throws Exception {
        *//*String commPortId = "COM5";
        int baudRate = 2400;
        int flowControlIn = 0;
        int flowControlOut = 0;
        int dataBits = 8;
        int stopBits = 1;
        int parity = 0;

        SerialPortWrapperImpl wrapper = new SerialPortWrapperImpl(commPortId, baudRate, flowControlIn, flowControlOut, dataBits, stopBits, parity);
        IpParameters ipParameters = new IpParameters();
        ipParameters.setHost("127.0.0.1");   //设备ip地址
        ipParameters.setPort(502);
        com.serotonin.modbus4j.ModbusFactory modbusFactory = new ModbusFactory();

        ModbusMaster master = modbusFactory.createRtuMaster(wrapper);  //RTU
        //ModbusMaster master = modbusFactory.createTcpMaster(ipParameters, false);   //TCP

        try{
            master.init();
            int slaveId = 2;        //设备ID

            //readDiscreteInputTest(master, slaveId, 0, 100);   /////读状态数据32
            readHoldingRegistersTest(master, slaveId, 0, 100);  ////读电压电流数据  ----//64
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            master.destroy();
        }*//*

    }*/

    @RequestMapping(value = "/getModbusData")
    public static JSONObject getModbusData(){
        Map<String,Object> resultMap = new HashMap<String,Object>();

        String hold = "220,220,220,220,220,220,5,6";
        String coil = "true,true,true,true,true,true,true,true,false,false,false,false,false,false,false,false,false,true,false,false,true,false,false,false,false";

        resultMap.put("hold",hold);
        resultMap.put("coil",coil);

        JSONObject json = JSONObject.fromObject(resultMap);
        System.out.println("json---"+json);

        Map map = JSONObject.fromObject(json);
        System.out.println(map.get("coil"));
        return json;
    }


    /**
     * @Function 02
     * @param master
     * @param slaveId
     * @param start
     * @param len
     */
    public static String readDiscreteInput(ModbusMaster master, int slaveId, int start, int len) {
        try {
            ReadDiscreteInputsRequest request = new ReadDiscreteInputsRequest(slaveId, start, len);
            ReadDiscreteInputsResponse response = (ReadDiscreteInputsResponse) master.send(request);

            if (response.isException())
                System.out.println("Exception response: message=" + response.getExceptionMessage());
            else
                System.out.println(Arrays.toString(response.getBooleanData()));
            return Arrays.toString(response.getBooleanData());
        }
        catch (ModbusTransportException e) {
            e.printStackTrace();
            return "None";
        }
    }

    /**
     * Function 03
     * @param master
     * @param slaveId
     * @param start
     * @param len
     */
    public static String readHoldingRegistersTest(ModbusMaster master, int slaveId, int start, int len) {
        try {
            ReadHoldingRegistersRequest request = new ReadHoldingRegistersRequest(slaveId, start, len);
            ReadHoldingRegistersResponse response = (ReadHoldingRegistersResponse) master.send(request);

            if (response.isException())
                System.out.println("Exception response: message=" + response.getExceptionMessage());
            else
                System.out.println("功能码:3--" + Arrays.toString(response.getShortData()));
            return Arrays.toString(response.getShortData());
        }
        catch (ModbusTransportException e) {
            e.printStackTrace();
        }
        return "none";
    }

    /**
     * 批量写数据到保持寄存器
     * @param master 主站
     * @param slaveId 从站地址
     * @param start 起始地址的偏移量
     * @param values 待写数据
     */
    public static void writeRegisters(ModbusMaster master, int slaveId, int start, short[] values) {
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

    /**
     * 写单个值
     * @param master
     * @param slaveId
     * @param start
     * @param value
     * @return
     */
    public static boolean writeCoil(ModbusMaster master, int slaveId, int start, boolean value){
        boolean flag = true;
        try {
            WriteCoilRequest request = new WriteCoilRequest(slaveId, start, value);
            WriteCoilResponse response = (WriteCoilResponse)master.send(request);
            if (response.isException()){
                flag = false;
                System.out.println("Exception response: message=" + response.getExceptionMessage());
            }
            else {
                System.out.println("Success");
                flag = true;
            }
        } catch (ModbusTransportException e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }

    /**
     * 写多个值
     * @param master
     * @param slaveId
     * @param start
     * @param values
     * @return
     */
    public static boolean writeCoils(ModbusMaster master, int slaveId, int start, boolean[] values){
        boolean flag = true;
        try {
            WriteCoilsRequest request = new WriteCoilsRequest(slaveId, start, values);
            WriteCoilsResponse response = (WriteCoilsResponse)master.send(request);
            if (response.isException()){
                System.out.println("Exception response: message=" + response.getExceptionMessage());
                flag = false;
            }
            else {
                System.out.println("Success");
                flag = true;
            }
        } catch (ModbusTransportException e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }

    /**
     * 获取客户端ip
     * @return
     */
    public static String getHostIp(){
        try{
            Enumeration<NetworkInterface> allNetInterfaces = NetworkInterface.getNetworkInterfaces();
            while (allNetInterfaces.hasMoreElements()){
                NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
                Enumeration<InetAddress> addresses = netInterface.getInetAddresses();
                while (addresses.hasMoreElements()){
                    InetAddress ip = (InetAddress) addresses.nextElement();
                    if (ip != null
                            && ip instanceof Inet4Address
                            && !ip.isLoopbackAddress() //loopback地址即本机地址，IPv4的loopback范围是127.0.0.0 ~ 127.255.255.255
                            && ip.getHostAddress().indexOf(":")==-1){
                        //System.out.println("本机的IP = " + ip.getHostAddress());
                        return ip.getHostAddress();
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取客户端mac地址
     * @return
     * @throws SocketException
     */
    public static String  getLocalMac() throws SocketException, UnknownHostException {
        InetAddress ia = InetAddress.getLocalHost();
        //获取网卡，获取地址
        byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();
        //System.out.println("mac数组长度："+mac.length);
        StringBuffer sb = new StringBuffer("");
        for(int i=0; i<mac.length; i++) {
            if(i!=0) {
                sb.append("-");
            }
            //字节转换为整数
            int temp = mac[i]&0xff;
            String str = Integer.toHexString(temp);
            //System.out.println("每8位:"+str);
            if(str.length()==1) {
                sb.append("0"+str);
            }else {
                sb.append(str);
            }
        }
        //System.out.println("本机MAC地址:"+sb.toString().toUpperCase());
        return sb.toString().toUpperCase();
    }

    /**
     * 截取掉第一位和最后一位
     * @param str
     * @return
     */
    public static String subStrFirstAndLast(String str){
        String returnStr = str.substring(1,str.length()-1);
        return returnStr;
    }
}

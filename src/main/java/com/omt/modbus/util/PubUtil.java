package com.omt.modbus.util;

import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.ip.IpParameters;

/**
 * 公共工具类
 * Created by QiaoJian on 2018/8/23.
 */
public class PubUtil {

    /**
     * 获取modbus master工厂
     * @return
     */
    public static ModbusMaster getRtuMaster() {
        String commPortId = "COM6";
        int baudRate = 9600;
        int flowControlIn = 0;
        int flowControlOut = 0;
        int dataBits = 8;
        int stopBits = 1;
        int parity = 0;
        SerialPortWrapperImpl wrapper = new SerialPortWrapperImpl(commPortId, baudRate, dataBits, stopBits, parity, flowControlIn, flowControlOut);
        IpParameters ipParameters = new IpParameters();
        ipParameters.setPort(502);
        ModbusFactory modbusFactory = new ModbusFactory();

        ModbusMaster master = modbusFactory.createRtuMaster(wrapper);
        return master;
        //ModbusMaster master = modbusFactory.createTcpMaster(ipParameters, false);
        /*SerialParameters serialParameters = new SerialParameters();
        // 设定MODBUS通讯的串行口
        serialParameters.setCommPortId("COM5");
        // 设置端口波特率
        serialParameters.setBaudRate(9600);
        //硬件之间输入流应答控制
        serialParameters.setFlowControlIn(0);
        //硬件之间输出流应答控制
        serialParameters.setFlowControlOut(0);
        //设定数据位的位数  RTU:8位    ASCII:7位
        serialParameters.setDataBits(8);
        //奇偶校验位  无校验：0 奇校验：1 偶校验：2
        serialParameters.setParity(0);
        //停止位的位数，如果无奇偶校验为2，有奇偶校验为1
        serialParameters.setStopBits(1);
        // 设置端口名称
        serialParameters.setPortOwnerName("RTU");
        // 创建ModbusMaster工厂实例
        return new ModbusFactory().createRtuMaster(serialParameters);*/
    }


    /**
     * 10进制转二进制 补齐8位 输出字符串数组
     * @param m
     * @return
     */
    public static String[] getArray(String m){
        int n = Integer.parseInt(m);
        String str = "";
        while(n!=0){
            str = n%2+str;
            n = n/2;
        }
        if(str.length()<=8){
            int len = 8-str.length();
            for(int i=0;i<len;i++){
                str = "0"+str;
            }
        }
        String[] strs = new String[8];
        for(int i = 0; i< str.length(); i++){
            strs[i] = str.substring(i,i+1);
        }
        return strs;
    }

    /**
     * 10进制转二进制 补齐8位 倒序输出字符串数组
     * @param m
     * @return
     */
    public static String[] getArrayReverse(String m){
        int n = Integer.parseInt(m);
        String str = "";
        while(n!=0){
            str = n%2+str;
            n = n/2;
        }
        if(str.length()<=8){
            int len = 8-str.length();
            for(int i=0;i<len;i++){
                str = "0"+str;
            }
        }
        int length=str.length();
        char[] array=str.toCharArray();
        for(int i=0;i<length/2;i++){
            array[i]=str.charAt(length-1-i);
            array[length-1-i]=str.charAt(i);
        }
        String s = new String(array);
        String[] strs = new String[8];
        for(int i = 0; i< s.length(); i++){
            strs[i] = s.substring(i,i+1);
        }
        return strs;
    }
}

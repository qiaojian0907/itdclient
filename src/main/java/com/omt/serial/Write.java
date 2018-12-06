package com.omt.serial;

import gnu.io.SerialPort;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by QiaoJian on 2018/10/29.
 */
@RestController
public class Write {
    public static String hexStr =  "0123456789ABCDEF";
    public static String[] binaryArray =
            {"0000","0001","0010","0011",
                    "0100","0101","0110","0111",
                    "1000","1001","1010","1011",
                    "1100","1101","1110","1111"};

    @RequestMapping(value = "/getSerialData")
    public JSONObject getSerialData(){
        Map resultMap = new HashMap();
        JSONObject json = null;

        SerialPort serialPort = null;                  //打开的端
        try {
            //打开串口
            serialPort = SerialTool.openPort("COM3", 9600);
            byte[] bs = hex2byte("AABB06AACC71");//自检命令
            //byte[] bs = hex2byte("AABB01AACC76");
            //写入数组
            SerialTool.sendToPort(serialPort, bs);

            //byte[] retbs = SerialTool.readFromPort(serialPort);
            String str = SerialTool.readFromPort(serialPort);
            System.out.println("str--"+str);
            String[] strs = str.split(",");
            String status = strs[5];    //状态字
            String num1 = strs[6];
            String num2 = strs[7];
            String num = "";

            //卡数获取
            if("00".equals(num1)){
                if("0".equals(num2.substring(0,1))){
                    num = num2.substring(1,2);
                }else{
                    num = num2;
                }
            }else{
                if("0".equals(num1.substring(0,1))){
                    num = num1.substring(1,2)+num2;
                }else{
                    num = num1+num2;
                }
            }

            resultMap.put("num",num);
            resultMap.put("status",status);

            json = JSONObject.fromObject(resultMap);


            System.out.println("num----"+num);

            System.out.println("status----"+status);
            System.out.println(bytes2BinStr(parseHexStr2Byte(status)));

        } catch (SerialPortParameterFailure | NotASerialPort | NoSuchPort | PortInUse | SendDataToSerialPortFailure | SerialPortOutputStreamCloseFailure e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ReadDataFromSerialPortFailure readDataFromSerialPortFailure) {
            readDataFromSerialPortFailure.printStackTrace();
        } catch (SerialPortInputStreamCloseFailure serialPortInputStreamCloseFailure) {
            serialPortInputStreamCloseFailure.printStackTrace();
        } finally {
            //关闭串口
            SerialTool.closePort(serialPort);
            return json;
        }
    }

    /**
     * 十六进制转byte
     * @param hex
     * @return
     */
    public static byte[] hex2byte(String hex) {
        String hex1 = hex.replace(" ", "");
        char[] hex2char = hex1.toCharArray();
        byte[] bytes = new byte[hex1.length() / 2];
        byte temp;
        for (int p = 0; p < bytes.length; p++) {
            temp = (byte) (hexStr.indexOf(hex2char[2 * p]) * 16);
            temp += hexStr.indexOf(hex2char[2 * p + 1]);
            bytes[p] = (byte) (temp & 0xff);
        }
        return bytes;
    }

    /**
     *
     * @return 二进制数组转换为二进制字符串   2-2
     */
    public static String bytes2BinStr(byte[] bArray){

        String outStr = "";
        int pos = 0;
        for(byte b:bArray){
            //高四位
            pos = (b&0xF0)>>4;
            outStr+=binaryArray[pos];
            //低四位
            pos=b&0x0F;
            outStr+=binaryArray[pos];
        }
        return outStr;
    }

    /**
     * @description 将16进制转换为二进制
     *
     * @param hexStr
     * @return
     */
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }
}



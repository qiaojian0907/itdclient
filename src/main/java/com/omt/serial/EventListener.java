package com.omt.serial;

import gnu.io.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.TooManyListenersException;

/**
 * Created by QiaoJian on 2018/10/29.
 */
public class EventListener implements SerialPortEventListener {
    //1.定义变量
    SerialPort serialPort = null;
    InputStream inputStream = null;//输入流
    Thread readThread = null;
    //2.构造函数：
    //实现初始化动作：获取串口COM21、打开串口、获取串口输入流对象、为串口添加事件监听对象

    public EventListener() throws NoSuchPortException, PortInUseException {
        try {
            //获取串口、打开窗串口、获取串口的输入流。
            serialPort = SerialTool.openPort("COM3", 9600);
            inputStream = serialPort.getInputStream();
            //向串口添加事件监听对象。
            serialPort.addEventListener(this);
            //设置当端口有可用数据时触发事件，此设置必不可少。
            serialPort.notifyOnDataAvailable(true);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TooManyListenersException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SerialPortParameterFailure e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NotASerialPort e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchPort e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (PortInUse e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            //	SerialTool.closePort(serialPort);
        }
    }

    //重写继承的监听器方法
    public void serialEvent(SerialPortEvent event) {
        //定义用于缓存读入数据的数组
        byte[] cache = new byte[1024];
        //记录已经到达串口COM21且未被读取的数据的字节（Byte）数。
        int availableBytes = 0;

        //如果是数据可用的时间发送，则进行数据的读写
        if(event.getEventType() == SerialPortEvent.DATA_AVAILABLE){
            try {
                availableBytes = inputStream.available();
                while(availableBytes > 0){
                    inputStream.read(cache);
                    for(int i = 0; i < cache.length && i < availableBytes; i++){
                        //解码并输出数据
                        System.out.print((char)cache[i]);
                    }
                    availableBytes = inputStream.available();
                }
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /*public static void main(String[] args) throws NoSuchPortException, PortInUseException {
        new EventListener();
    }*/

}

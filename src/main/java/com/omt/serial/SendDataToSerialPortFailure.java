package com.omt.serial;

/**
 * Created by QiaoJian on 2018/10/29.
 */
public class SendDataToSerialPortFailure extends Exception {
    private static final long serialVersionUID = 1L;

    public SendDataToSerialPortFailure() {}

    @Override
    public String toString() {
        return "设置串口参数失败！打开串口操作未完成！";
    }
}

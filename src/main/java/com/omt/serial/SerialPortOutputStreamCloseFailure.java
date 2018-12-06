package com.omt.serial;

/**
 * Created by QiaoJian on 2018/10/29.
 */
public class SerialPortOutputStreamCloseFailure extends Exception {
    private static final long serialVersionUID = 1L;

    public SerialPortOutputStreamCloseFailure() {}

    @Override
    public String toString() {
        return "关闭串口对象的输出流出错！";
    }
}

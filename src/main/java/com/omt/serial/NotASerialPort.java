package com.omt.serial;

/**
 * Created by QiaoJian on 2018/10/29.
 */
public class NotASerialPort extends Exception {
    private static final long serialVersionUID = 1L;

    public NotASerialPort() {}

    @Override
    public String toString() {
        return "端口指向设备不是串口类型！";
    }
}

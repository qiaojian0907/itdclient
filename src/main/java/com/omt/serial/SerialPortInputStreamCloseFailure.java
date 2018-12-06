package com.omt.serial;

/**
 * Created by QiaoJian on 2018/10/29.
 */
public class SerialPortInputStreamCloseFailure extends Exception {
    private static final long serialVersionUID = 1L;

    public SerialPortInputStreamCloseFailure() {}

    @Override
    public String toString() {
        return "关闭串口对象输入流出错！";
    }
}

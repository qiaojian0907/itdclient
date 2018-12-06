package com.omt.serial;

/**
 * Created by QiaoJian on 2018/10/29.
 */
public class SerialPortParameterFailure extends Exception{
    private static final long serialVersionUID = 1L;

    public SerialPortParameterFailure() {}

    @Override
    public String toString() {
        return "向串口发送数据失败！";
    }

}

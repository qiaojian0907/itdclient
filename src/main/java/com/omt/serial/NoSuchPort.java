package com.omt.serial;

/**
 * Created by QiaoJian on 2018/10/29.
 */
public class NoSuchPort extends Exception {
    private static final long serialVersionUID = 1L;

    public NoSuchPort() {}

    @Override
    public String toString() {
        return "没有该端口对应的串口设备！";
    }
}

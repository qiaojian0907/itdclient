package com.omt.serial;

/**
 * Created by QiaoJian on 2018/10/29.
 */
public class TooManyListeners extends Exception {
    private static final long serialVersionUID = 1L;

    public TooManyListeners() {}

    @Override
    public String toString() {
        return "监听类对象过多！";
    }
}

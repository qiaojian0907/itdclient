package com.omt.Rest.tool;

/**
 * Created by QiaoJian on 2018/11/5.
 */
public enum  ResultCode {

    /**登录成功 */
    SUCCESS("0000", "操作成功"),

    /** 没有登录 */
    NOT_LOGIN("0001", "操作失败"),

    /** 发生异常 */
    EXCEPTION("0003", "发生异常"),

    /** 系统错误 */
    SYS_ERROR("0004", "系统错误"),

    /** 参数错误 */
    PARAMS_ERROR("0005", "参数错误 "),

    /** 太频繁的调用 */
    TOO_FREQUENT("0006", "频繁调用"),

    /** 未知的错误 */
    UNKNOWN_ERROR("0007", "未知错误");

    private ResultCode(String value, String msg){
        this.val = value;
        this.msg = msg;
    }

    public String val() {
        return val;
    }

    public String msg() {
        return msg;
    }

    private String val;
    private String msg;

}

package com.omt.common.opLog;

/**
 * Created by wangbl on 2017/2/15.
 */
public class OPLogDto {
    String login_no=""; //操作工号
    String url="";      //访问的url地址
    String ip="";       //访问ip
    String opDetails="";//操作明细，通过代码表和具体的功能名称对应
    String param="";    //操作参数
    String opDate="";   //操作时间

    public String getLogin_no() {
        return login_no;
    }

    public void setLogin_no(String login_no) {
        this.login_no = login_no;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOpDetails() {
        return opDetails;
    }

    public void setOpDetails(String opDetails) {
        this.opDetails = opDetails;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getOpDate() {
        return opDate;
    }

    public void setOpDate(String opDate) {
        this.opDate = opDate;
    }
}

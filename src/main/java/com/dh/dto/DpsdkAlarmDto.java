package com.dh.dto;

/**
 * Created by QiaoJian on 2018/10/11.
 * 对应表 omt_inf_dpsdkalarm_info
 */
public class DpsdkAlarmDto {
    String ip = ""; //IP
    String alarm_type = ""; //报警类型
    String alarm_date = "";//报警时间
    String alarm_event = "";//事件 1 产生  2 消失
    String devId = "";//设备id
    String chanelId = "";//通道号
    String dealWith = "";//处理状态
    String status = "";//上传状态

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAlarm_type() {
        return alarm_type;
    }

    public void setAlarm_type(String alarm_type) {
        this.alarm_type = alarm_type;
    }

    public String getAlarm_date() {
        return alarm_date;
    }

    public void setAlarm_date(String alarm_date) {
        this.alarm_date = alarm_date;
    }

    public String getAlarm_event() {
        return alarm_event;
    }

    public void setAlarm_event(String alarm_event) {
        this.alarm_event = alarm_event;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getChanelId() {
        return chanelId;
    }

    public void setChanelId(String chanelId) {
        this.chanelId = chanelId;
    }

    public String getDealWith() {
        return dealWith;
    }

    public void setDealWith(String dealWith) {
        this.dealWith = dealWith;
    }
}

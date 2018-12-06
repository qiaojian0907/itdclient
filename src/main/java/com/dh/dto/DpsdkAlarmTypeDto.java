package com.dh.dto;

/**
 * Created by QiaoJian on 2018/10/11.
 * 对应表 omt_inf_dpsdkalarmtype_info
 */
public class DpsdkAlarmTypeDto {
    String alarm_type = "";  //报警类型
    String alarm_value = ""; //值
    String alarm_name = "";  //报警名称

    public String getAlarm_type() {
        return alarm_type;
    }

    public void setAlarm_type(String alarm_type) {
        this.alarm_type = alarm_type;
    }

    public String getAlarm_value() {
        return alarm_value;
    }

    public void setAlarm_value(String alarm_value) {
        this.alarm_value = alarm_value;
    }

    public String getAlarm_name() {
        return alarm_name;
    }

    public void setAlarm_name(String alarm_name) {
        this.alarm_name = alarm_name;
    }
}

package com.omt.modbus.dto;

/**
 * Created by QiaoJian on 2018/8/21.
 */
public class ModbusLogDto {
    String login_time = "";         //登录时间
    String login_no = "";           //工号
    String logout_time  = "";       //退出时间
    String date = "";               //日期
    String temp = "";               //温度
    String humidity = "";           //湿度
    String trouble_time = "";       //故障时间
    String trouble_name = "";       //故障名称
    String resume_time = "";        //恢复时间
    String equipment_name = "";     //设备名称
    String status = "";             //状态
    String car_24 = "";             //24H/辆
    String car_12 = "";             //12H/辆

    public String getLogin_time() {
        return login_time;
    }

    public void setLogin_time(String login_time) {
        this.login_time = login_time;
    }

    public String getLogin_no() {
        return login_no;
    }

    public void setLogin_no(String login_no) {
        this.login_no = login_no;
    }

    public String getLogout_time() {
        return logout_time;
    }

    public void setLogout_time(String logout_time) {
        this.logout_time = logout_time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTrouble_time() {
        return trouble_time;
    }

    public void setTrouble_time(String trouble_time) {
        this.trouble_time = trouble_time;
    }

    public String getTrouble_name() {
        return trouble_name;
    }

    public void setTrouble_name(String trouble_name) {
        this.trouble_name = trouble_name;
    }

    public String getResume_time() {
        return resume_time;
    }

    public void setResume_time(String resume_time) {
        this.resume_time = resume_time;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCar_24() {
        return car_24;
    }

    public void setCar_24(String car_24) {
        this.car_24 = car_24;
    }

    public String getCar_12() {
        return car_12;
    }

    public void setCar_12(String car_12) {
        this.car_12 = car_12;
    }
}

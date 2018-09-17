package com.omt.modbus.dto;

/**
 * Created by QiaoJian on 2018/8/21.
 */
public class ModbusENVDto {
    String temp = "";           //温度
    String humidity = "";       //湿度
    String co2 = "";            //二氧化碳
    String pm25 = "";           //pm2.5
    String pm10 = "";           //pm10
    String noise = "";          //噪音

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

    public String getCo2() {
        return co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }
}

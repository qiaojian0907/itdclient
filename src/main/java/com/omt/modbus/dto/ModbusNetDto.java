package com.omt.modbus.dto;

/**
 * Created by QiaoJian on 2018/8/21.
 */
public class ModbusNetDto {

    String gateway = "";    //网关
    String dv1 = "";        //摄像机1
    String dv2 = "";        //摄像机2
    String dv3 = "";        //摄像机3
    String vdm = "";        //字符叠加器
    String weight = "";     //计重
    String display = "";    //费显

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getDv1() {
        return dv1;
    }

    public void setDv1(String dv1) {
        this.dv1 = dv1;
    }

    public String getDv2() {
        return dv2;
    }

    public void setDv2(String dv2) {
        this.dv2 = dv2;
    }

    public String getDv3() {
        return dv3;
    }

    public void setDv3(String dv3) {
        this.dv3 = dv3;
    }

    public String getVdm() {
        return vdm;
    }

    public void setVdm(String vdm) {
        this.vdm = vdm;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}

package com.omt.informationManagement.dto;

/**
 * Created by zuopyue on 2018/8/24.
 */
public class EquipmentDataDto {
    //设备基本信息
    String ip  = "";//设备ip
    String hostid = "";//设备id
    String host = "";//设备名称
    String name = "";//设备数据名称
    String description = "";//监控项名称
    String value = "";//监控项值
    String itemid = "";//监控项id
    String statusvalue = "";//是否告警，0正常，1告警
    String descriptionStatus = "";//告警描述
    String statustime = "";//告警时间
    String itemstatus = "";//告警状态
    String itemvalue = "";//告警名称

    public String getItemstatus() {
        return itemstatus;
    }

    public void setItemstatus(String itemstatus) {
        this.itemstatus = itemstatus;
    }

    public String getItemvalue() {
        return itemvalue;
    }

    public void setItemvalue(String itemvalue) {
        this.itemvalue = itemvalue;
    }

    public String getStatustime() {
        return statustime;
    }

    public void setStatustime(String statustime) {
        this.statustime = statustime;
    }

    public String getStatusvalue() {
        return statusvalue;
    }

    public void setStatusvalue(String statusvalue) {
        this.statusvalue = statusvalue;
    }

    public String getDescriptionStatus() {
        return descriptionStatus;
    }

    public void setDescriptionStatus(String descriptionStatus) {
        this.descriptionStatus = descriptionStatus;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostid() {
        return hostid;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

}

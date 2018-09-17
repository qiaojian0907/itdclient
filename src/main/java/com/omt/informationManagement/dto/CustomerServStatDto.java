package com.omt.informationManagement.dto;

import com.omt.common.page.BaseDto;

public class CustomerServStatDto extends BaseDto {
    //设备信息
    String id = "";
    String equipment_type = "";
    String equipment_name = "";
    String equipment_model = "";
    String equipment_status = "";
    String equipment_address = "";
    String address_code = "";
    String count ="";       //列数
    String time ="";        //时间
    String oper_date ="";  //维修时间

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getOper_date() {
        return oper_date;
    }

    public void setOper_date(String oper_date) {
        this.oper_date = oper_date;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEquipment_type() {
        return equipment_type;
    }

    public void setEquipment_type(String equipment_type) {
        this.equipment_type = equipment_type;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public String getEquipment_model() {
        return equipment_model;
    }

    public void setEquipment_model(String equipment_model) {
        this.equipment_model = equipment_model;
    }

    public String getEquipment_status() {
        return equipment_status;
    }

    public void setEquipment_status(String equipment_status) {
        this.equipment_status = equipment_status;
    }

    public String getEquipment_address() {
        return equipment_address;
    }

    public void setEquipment_address(String equipment_address) {
        this.equipment_address = equipment_address;
    }

    public String getAddress_code() {
        return address_code;
    }

    public void setAddress_code(String address_code) {
        this.address_code = address_code;
    }
}

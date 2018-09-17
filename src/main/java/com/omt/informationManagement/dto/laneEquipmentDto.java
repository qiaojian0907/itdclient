package com.omt.informationManagement.dto;

/**
 * Created by zuoyue on 2018/6/19.
 */
public class laneEquipmentDto {
    //组织节点
    String org_id = "";
    String org_code = "";
    String org_name = "";
    String dparent_id = "";
    String address_orgcode = "";//收费站节点代码
    String longitude = "";//收费站经度
    String latitude = "";//收费站维度

    //设备信息
    String id = "";
    String equipment_type = "";
    String equipment_name = "";
    String equipment_model = "";
    String equipment_status = "";
    String equipment_address = "";
    String address_code = "";

    //样式
    String lcons_name = "";
    String lcons_css = "";
    String bg_name = "";
    String bg_css = "";
    String bg_spancss = "";
    String bg_spanname = "";

    String name = "";
    //车道设备统计
    String num = "";
    String equipment_ip = "";

    String equipment_no = "";

    public String getEquipment_no() {
        return equipment_no;
    }

    public void setEquipment_no(String equipment_no) {
        this.equipment_no = equipment_no;
    }

    public String getEquipment_ip() {
        return equipment_ip;
    }

    public void setEquipment_ip(String equipment_ip) {
        this.equipment_ip = equipment_ip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress_code() {
        return address_code;
    }

    public void setAddress_code(String address_code) {
        this.address_code = address_code;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAddress_orgcode() {
        return address_orgcode;
    }

    public void setAddress_orgcode(String address_orgcode) {
        this.address_orgcode = address_orgcode;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBg_spancss() {
        return bg_spancss;
    }

    public void setBg_spancss(String bg_spancss) {
        this.bg_spancss = bg_spancss;
    }

    public String getBg_spanname() {
        return bg_spanname;
    }

    public void setBg_spanname(String bg_spanname) {
        this.bg_spanname = bg_spanname;
    }

    public String getLcons_name() {
        return lcons_name;
    }

    public void setLcons_name(String lcons_name) {
        this.lcons_name = lcons_name;
    }

    public String getLcons_css() {
        return lcons_css;
    }

    public void setLcons_css(String lcons_css) {
        this.lcons_css = lcons_css;
    }

    public String getBg_name() {
        return bg_name;
    }

    public void setBg_name(String bg_name) {
        this.bg_name = bg_name;
    }

    public String getBg_css() {
        return bg_css;
    }

    public void setBg_css(String bg_css) {
        this.bg_css = bg_css;
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

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getOrg_code() {
        return org_code;
    }

    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getDparent_id() {
        return dparent_id;
    }

    public void setDparent_id(String dparent_id) {
        this.dparent_id = dparent_id;
    }
}

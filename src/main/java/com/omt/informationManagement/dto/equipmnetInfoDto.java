package com.omt.informationManagement.dto;

import com.omt.common.page.BaseDto;

/**
 * Created by zuoyue on 2018/6/4.
 */
public class equipmnetInfoDto extends BaseDto {
    int id=0;//设备编号
    String equipment_name = "";//设备名称
    String equipment_type = "";//设备类型
    String equipment_model = "";//设备型号
    String type_name = "";//类型名称
    String equipment_status = "";//设备状态
    String equipment_num = "";//设备数量
    String status_name = "";//状态名称;
    String equipment_org = "";//组织节点代码
    String es_time = "";//入库时间
    String eo_time = "";//上线时间
    String insert_time = "";//数据录入时间
    String op_person = "";//录入数据人员
    String org_name= "";//设备归属
    String org_code = "";//
    String use_num = "";// 属代码
    int rowno = 0;//序号
    String report_time = "";//上报时间
    String equipment_factory = "";//厂商
    String equipment_contract = "";//维保合同
    String equipment_address = "";//设备使用节点
    String contract_starttime = "";//合同开始时间
    String contract_endtime = "";//合同结束时间
    String equipment_brand = "";//设备品牌
    String equipment_price = "";//单价
    String equipment_custodian = "";//保管人员
    String equipmemt_model = "";//设备型号
    String equipment_system = "";//设备所属系统
    String address = "";//资产安装地址
    String equipment_typem = "";//设备类型，网络设备，iO设备，串口设备分类字段
    String address_orgcode = "";//收费站code
    String equipment_ip = "";//网络设备ip
    String id_model = "";//
    String equipment_no = "";//设备编号

    public String getEquipment_no() {
        return equipment_no;
    }

    public void setEquipment_no(String equipment_no) {
        this.equipment_no = equipment_no;
    }

    public String getId_model() {
        return id_model;
    }

    public void setId_model(String id_model) {
        this.id_model = id_model;
    }

    public String getEquipment_ip() {
        return equipment_ip;
    }

    public void setEquipment_ip(String equipment_ip) {
        this.equipment_ip = equipment_ip;
    }

    public String getAddress_orgcode() {
        return address_orgcode;
    }

    public void setAddress_orgcode(String address_orgcode) {
        this.address_orgcode = address_orgcode;
    }

    public String getEquipment_typem() {
        return equipment_typem;
    }

    public void setEquipment_typem(String equipment_typem) {
        this.equipment_typem = equipment_typem;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEquipment_system() {
        return equipment_system;
    }

    public void setEquipment_system(String equipment_system) {
        this.equipment_system = equipment_system;
    }

    public String getEquipmemt_model() {
        return equipmemt_model;
    }

    public void setEquipmemt_model(String equipmemt_model) {
        this.equipmemt_model = equipmemt_model;
    }

    public String getEquipment_brand() {
        return equipment_brand;
    }

    public void setEquipment_brand(String equipment_brand) {
        this.equipment_brand = equipment_brand;
    }

    public String getEquipment_price() {
        return equipment_price;
    }

    public void setEquipment_price(String equipment_price) {
        this.equipment_price = equipment_price;
    }

    public String getEquipment_custodian() {
        return equipment_custodian;
    }

    public void setEquipment_custodian(String equipment_custodian) {
        this.equipment_custodian = equipment_custodian;
    }

    public String getContract_starttime() {
        return contract_starttime;
    }

    public void setContract_starttime(String contract_starttime) {
        this.contract_starttime = contract_starttime;
    }

    public String getContract_endtime() {
        return contract_endtime;
    }

    public void setContract_endtime(String contract_endtime) {
        this.contract_endtime = contract_endtime;
    }

    public String getEquipment_address() {
        return equipment_address;
    }

    public void setEquipment_address(String equipment_address) {
        this.equipment_address = equipment_address;
    }

    public String getEquipment_contract() {
        return equipment_contract;
    }

    public void setEquipment_contract(String equipment_contract) {
        this.equipment_contract = equipment_contract;
    }

    public String getEquipment_factory() {
        return equipment_factory;
    }

    public void setEquipment_factory(String equipment_factory) {
        this.equipment_factory = equipment_factory;
    }

    public String getReport_time() {
        return report_time;
    }

    public void setReport_time(String report_time) {
        this.report_time = report_time;
    }

    public String getUse_num() {
        return use_num;
    }

    public void setUse_num(String use_num) {
        this.use_num = use_num;
    }

    public String getEquipment_num() {
        return equipment_num;
    }

    public void setEquipment_num(String equipment_num) {
        this.equipment_num = equipment_num;
    }

    public String getEquipment_model() {
        return equipment_model;
    }

    public void setEquipment_model(String equipment_model) {
        this.equipment_model = equipment_model;
    }

    public int getRowno() {
        return rowno;
    }

    public void setRowno(int rowno) {
        this.rowno = rowno;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public String getEquipment_type() {
        return equipment_type;
    }

    public void setEquipment_type(String equipment_type) {
        this.equipment_type = equipment_type;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getEquipment_status() {
        return equipment_status;
    }

    public void setEquipment_status(String equipment_status) {
        this.equipment_status = equipment_status;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }

    public String getEquipment_org() {
        return equipment_org;
    }

    public void setEquipment_org(String equipment_org) {
        this.equipment_org = equipment_org;
    }

    public String getEs_time() {
        return es_time;
    }

    public void setEs_time(String es_time) {
        this.es_time = es_time;
    }

    public String getEo_time() {
        return eo_time;
    }

    public void setEo_time(String eo_time) {
        this.eo_time = eo_time;
    }

    public String getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(String insert_time) {
        this.insert_time = insert_time;
    }

    public String getOp_person() {
        return op_person;
    }

    public void setOp_person(String op_person) {
        this.op_person = op_person;
    }
}

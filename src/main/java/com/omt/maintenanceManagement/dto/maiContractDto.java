package com.omt.maintenanceManagement.dto;

import com.omt.common.page.BaseDto;

/**
 * Created by zuoyue on 2018/6/21.
 */
public class maiContractDto extends BaseDto {
    String equipment_name = "";
    String equipment_model = "";
    String contract_no = "";
    String contract_name = "";
    String contract_startdate = "";
    String contract_enddate = "";
    String rowno = "";
    String contract_A = "";
    String contract_B = "";
    String insert_person = "";
    String note = "";


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getInsert_person() {
        return insert_person;
    }

    public void setInsert_person(String insert_person) {
        this.insert_person = insert_person;
    }

    public String getContract_A() {
        return contract_A;
    }

    public void setContract_A(String contract_A) {
        this.contract_A = contract_A;
    }

    public String getContract_B() {
        return contract_B;
    }

    public void setContract_B(String contract_B) {
        this.contract_B = contract_B;
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

    public String getContract_no() {
        return contract_no;
    }

    public void setContract_no(String contract_no) {
        this.contract_no = contract_no;
    }

    public String getContract_name() {
        return contract_name;
    }

    public void setContract_name(String contract_name) {
        this.contract_name = contract_name;
    }

    public String getContract_startdate() {
        return contract_startdate;
    }

    public void setContract_startdate(String contract_startdate) {
        this.contract_startdate = contract_startdate;
    }

    public String getContract_enddate() {
        return contract_enddate;
    }

    public void setContract_enddate(String contract_enddate) {
        this.contract_enddate = contract_enddate;
    }

    public String getRowno() {
        return rowno;
    }

    public void setRowno(String rowno) {
        this.rowno = rowno;
    }
}

package com.omt.ITD.dto;

public class ITDFaultDto {
    private String equipment_type;
    private String fault_code;
    private String fault_name;

    public String getEquipment_type() {
        return equipment_type;
    }

    public void setEquipment_type(String equipment_type) {
        this.equipment_type = equipment_type;
    }

    public String getFault_code() {
        return fault_code;
    }

    public void setFault_code(String fault_code) {
        this.fault_code = fault_code;
    }

    public String getFault_name() {
        return fault_name;
    }

    public void setFault_name(String fault_name) {
        this.fault_name = fault_name;
    }
}

package com.omt.malfunctionRepair.dto;

/**
 * Created by liuxiao on 2018/6/26.
 */
public class OmtInfRepairAttachInfoDto {
    private int id;
    private String repair_no;
    private String attach_name;
    private String path_value;
    private String attach_type;
    private String bak1;
    private String bak2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRepair_no() {
        return repair_no;
    }

    public void setRepair_no(String repair_no) {
        this.repair_no = repair_no;
    }

    public String getAttach_name() {
        return attach_name;
    }

    public void setAttach_name(String attach_name) {
        this.attach_name = attach_name;
    }

    public String getPath_value() {
        return path_value;
    }

    public void setPath_value(String path_value) {
        this.path_value = path_value;
    }

    public String getAttach_type() {
        return attach_type;
    }

    public void setAttach_type(String attach_type) {
        this.attach_type = attach_type;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1;
    }

    public String getBak2() {
        return bak2;
    }

    public void setBak2(String bak2) {
        this.bak2 = bak2;
    }
}

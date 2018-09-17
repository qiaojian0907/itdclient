package com.omt.malfunctionRepair.dto;

import java.util.Date;

public class OmtInfMaintainInfoDto {
    private String repair_no;
    private String oper_no;
    private String oper_name;
    private Date start_time;
    private Date end_time;
    private String maintenance_method;
    private String processing;
    private String fault_status;
    private String process_result;
    private String bak1;
    private String bak2;
    private String start_time_str;
    private String end_time_str;
    private String task_id;
    private String score;

    public String getRepair_no() {
        return repair_no;
    }

    public void setRepair_no(String repair_no) {
        this.repair_no = repair_no;
    }

    public String getOper_no() {
        return oper_no;
    }

    public void setOper_no(String oper_no) {
        this.oper_no = oper_no;
    }

    public String getOper_name() {
        return oper_name;
    }

    public void setOper_name(String oper_name) {
        this.oper_name = oper_name;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getMaintenance_method() {
        return maintenance_method;
    }

    public void setMaintenance_method(String maintenance_method) {
        this.maintenance_method = maintenance_method;
    }

    public String getProcessing() {
        return processing;
    }

    public void setProcessing(String processing) {
        this.processing = processing;
    }

    public String getFault_status() {
        return fault_status;
    }

    public void setFault_status(String fault_status) {
        this.fault_status = fault_status;
    }

    public String getProcess_result() {
        return process_result;
    }

    public void setProcess_result(String process_result) {
        this.process_result = process_result;
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

    public String getStart_time_str() {
        return start_time_str;
    }

    public void setStart_time_str(String start_time_str) {
        this.start_time_str = start_time_str;
    }

    public String getEnd_time_str() {
        return end_time_str;
    }

    public void setEnd_time_str(String end_time_str) {
        this.end_time_str = end_time_str;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}

package com.omt.ITD.dto;

import java.util.Date;

public class FaultLogDto {
    private Integer id;
    private Date start_time;
    private String start_time_str;
    private String fault_name;
    private String end_time;
    private String end_time_str;
    private String fault_equipment;
    private String status;
    private String repair_no;
    private String repair_name;
    private String oper_no;
    private String oper_name;
    private String oper_date;
    private String problem_description;
    private String assignee;
    private String recept_time;
    private String station;
    private String road;
    private String entry;
    private String fault_code;
    private String status1;

    public String getFault_code() {
        return fault_code;
    }

    public void setFault_code(String fault_code) {
        this.fault_code = fault_code;
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public String getStart_time_str() {
        return start_time_str;
    }

    public void setStart_time_str(String start_time_str) {
        this.start_time_str = start_time_str;
    }

    public String getFault_name() {
        return fault_name;
    }

    public void setFault_name(String fault_name) {
        this.fault_name = fault_name;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getEnd_time_str() {
        return end_time_str;
    }

    public void setEnd_time_str(String end_time_str) {
        this.end_time_str = end_time_str;
    }

    public String getFault_equipment() {
        return fault_equipment;
    }

    public void setFault_equipment(String fault_equipment) {
        this.fault_equipment = fault_equipment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRepair_no() {
        return repair_no;
    }

    public void setRepair_no(String repair_no) {
        this.repair_no = repair_no;
    }

    public String getRepair_name() {
        return repair_name;
    }

    public void setRepair_name(String repair_name) {
        this.repair_name = repair_name;
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

    public String getOper_date() {
        return oper_date;
    }

    public void setOper_date(String oper_date) {
        this.oper_date = oper_date;
    }

    public String getProblem_description() {
        return problem_description;
    }

    public void setProblem_description(String problem_description) {
        this.problem_description = problem_description;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getRecept_time() {
        return recept_time;
    }

    public void setRecept_time(String recept_time) {
        this.recept_time = recept_time;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }
}

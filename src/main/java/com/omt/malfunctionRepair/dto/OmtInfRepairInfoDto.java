package com.omt.malfunctionRepair.dto;

import com.omt.common.page.BaseDto;

/**
 * Created by liuxiao on 2018/6/13.
 */
public class OmtInfRepairInfoDto extends BaseDto {
    private int id;
    private int rowno = 0;//序号
    private String repair_no;
    private String repair_name;
    private String repair_type;
    private String repair_status;
    private String oper_no;
    private String oper_name;
    private String oper_date;
    private String end_date;
    private String system_name;
    private String area_code;
    private String system_code;
    private String area_name;
    private String problem_description;
    private String incidence;
    private String urgency_level;
    private String step_name;
    private String proc_inst_id;
    private String task_id;
    private String assignee;
    private String backlog_button;
    private String equipment_no;
    private String equipment_name;
    private String equipment_type;
    private String equipment_model;
    private String fault_type;
    private String fault_location;
    private String start_time;
    private String end_time;
    private String malfunction_status;
    private String results;
    private String act_id;

    //全景信息视图---设备维修信息分页查询
    int  startNum = 0;
    int  listNum  = 0;

    public int getStartNum() {
        return startNum;
    }

    public void setStartNum(int startNum) {
        this.startNum = startNum;
    }

    public int getListNum() {
        return listNum;
    }

    public void setListNum(int listNum) {
        this.listNum = listNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRowno() {
        return rowno;
    }

    public void setRowno(int rowno) {
        this.rowno = rowno;
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

    public String getRepair_type() {
        return repair_type;
    }

    public void setRepair_type(String repair_type) {
        this.repair_type = repair_type;
    }

    public String getRepair_status() {
        return repair_status;
    }

    public void setRepair_status(String repair_status) {
        this.repair_status = repair_status;
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

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getSystem_name() {
        return system_name;
    }

    public void setSystem_name(String system_name) {
        this.system_name = system_name;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getFault_location() {
        return fault_location;
    }

    public void setFault_location(String fault_location) {
        this.fault_location = fault_location;
    }

    public String getProblem_description() {
        return problem_description;
    }

    public void setProblem_description(String problem_description) {
        this.problem_description = problem_description;
    }

    public String getIncidence() {
        return incidence;
    }

    public void setIncidence(String incidence) {
        this.incidence = incidence;
    }

    public String getUrgency_level() {
        return urgency_level;
    }

    public void setUrgency_level(String urgency_level) {
        this.urgency_level = urgency_level;
    }

    public String getStep_name() {
        return step_name;
    }

    public void setStep_name(String step_name) {
        this.step_name = step_name;
    }

    public String getProc_inst_id() {
        return proc_inst_id;
    }

    public void setProc_inst_id(String proc_inst_id) {
        this.proc_inst_id = proc_inst_id;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getBacklog_button() {
        return backlog_button;
    }

    public void setBacklog_button(String backlog_button) {
        this.backlog_button = backlog_button;
    }

    public String getEquipment_no() {
        return equipment_no;
    }

    public void setEquipment_no(String equipment_no) {
        this.equipment_no = equipment_no;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getMalfunction_status() {
        return malfunction_status;
    }

    public void setMalfunction_status(String malfunction_status) {
        this.malfunction_status = malfunction_status;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getSystem_code() {
        return system_code;
    }

    public void setSystem_code(String system_code) {
        this.system_code = system_code;
    }

    public String getEquipment_type() {
        return equipment_type;
    }

    public void setEquipment_type(String equipment_type) {
        this.equipment_type = equipment_type;
    }

    public String getEquipment_model() {
        return equipment_model;
    }

    public void setEquipment_model(String equipment_model) {
        this.equipment_model = equipment_model;
    }

    public String getFault_type() {
        return fault_type;
    }

    public void setFault_type(String fault_type) {
        this.fault_type = fault_type;
    }

    public String getAct_id() {
        return act_id;
    }

    public void setAct_id(String act_id) {
        this.act_id = act_id;
    }
}

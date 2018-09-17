package com.omt.informationManagement.dto;

/**
 * Created by zuoyue on 2018/8/16.
 */
public class PanoramicInfomationDto {

    //告警信息
    String alert_name = "";
    String alert_date = "";
    String alert_content = "";
    String count = "";

    //机历卡
    String es_time = "";//入库时间
    String etime = "";//
    String ename = "";//
    String equipment_no = "";//设备编号
    String description = "";//描述
    String oper_person = "";//操作人员

    public String getOper_person() {
        return oper_person;
    }

    public void setOper_person(String oper_person) {
        this.oper_person = oper_person;
    }

    //评论信息
    String topic_no = "";//评论编号，报修单编号
    String topic_type = "";//评论类型
    String content = "";//评论内容
    String from_uno = "";//评论用户
    String to_uno = "";//回复用户
    String topic_time = "";//评论时间

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTopic_time() {
        return topic_time;
    }

    public void setTopic_time(String topic_time) {
        this.topic_time = topic_time;
    }

    public String getTopic_no() {
        return topic_no;
    }

    public void setTopic_no(String topic_no) {
        this.topic_no = topic_no;
    }

    public String getTopic_type() {
        return topic_type;
    }

    public void setTopic_type(String topic_type) {
        this.topic_type = topic_type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFrom_uno() {
        return from_uno;
    }

    public void setFrom_uno(String from_uno) {
        this.from_uno = from_uno;
    }

    public String getTo_uno() {
        return to_uno;
    }

    public void setTo_uno(String to_uno) {
        this.to_uno = to_uno;
    }

    public String getEquipment_no() {
        return equipment_no;
    }

    public void setEquipment_no(String equipment_no) {
        this.equipment_no = equipment_no;
    }

    public String getEs_time() {
        return es_time;
    }

    public void setEs_time(String es_time) {
        this.es_time = es_time;
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getAlert_name() {
        return alert_name;
    }

    public void setAlert_name(String alert_name) {
        this.alert_name = alert_name;
    }

    public String getAlert_date() {
        return alert_date;
    }

    public void setAlert_date(String alert_date) {
        this.alert_date = alert_date;
    }

    public String getAlert_content() {
        return alert_content;
    }

    public void setAlert_content(String alert_content) {
        this.alert_content = alert_content;
    }
}

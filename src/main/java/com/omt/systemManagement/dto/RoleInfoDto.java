package com.omt.systemManagement.dto;

/**
 * Created by wangbl on 2018/6/6.
 */
public class RoleInfoDto {
    String role_id="";      //角色id
    String role_name="";    //角色名称
    String note="";         //备注
    String create_login=""; //创建工号
    String func_select="";  //角色包含的功能点
    String update_login=""; //更新工号

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreate_login() {
        return create_login;
    }

    public void setCreate_login(String create_login) {
        this.create_login = create_login;
    }

    public String getFunc_select() {
        return func_select;
    }

    public void setFunc_select(String func_select) {
        this.func_select = func_select;
    }

    public String getUpdate_login() {
        return update_login;
    }

    public void setUpdate_login(String update_login) {
        this.update_login = update_login;
    }
}

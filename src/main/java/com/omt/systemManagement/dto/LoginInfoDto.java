package com.omt.systemManagement.dto;

import com.omt.common.page.BaseDto;

/**
 * Created by wangbl on 2017/12/23.
 */
public class LoginInfoDto extends BaseDto {
    String login_id = "";            /*工号流水*/
    String login_no = "";            /*工号*/
    String login_name = "";          /*工号名称*/
    String login_type = "";          /*工号,0 管理员、1 站长、2 业务员*/
    String cust_name = "";           /*使用者姓名*/
    String email = "";               /*邮箱*/
    String gender = "";              /*性别编码，0男、1女*/
    String gender_name = "";         /*性别*/
    String grade_id = "";            /*班级*/
    String password = "";            /*密码*/
    String reset_password = "";      /*密码重置*/
    String create_date = "";         /*创建时间*/
    String update_date = "";         /*修改时间*/
    String new_password = "";        /*新密码*/
    String confirm_password = "";    /*确认密码*/
    String sex="";                   /*性别,0未知、1男、2女*/
    String phone_no;                 /*电话*/
    String org_id;                   /*归属id*/
    String role_id="0";              /*角色id*/
    String role_name;                /*角色名称*/
    String org_name="";              /*归属名称*/
    String address="";               /*地址*/
    String valid="";                 /*有效标志，0无效、1有效*/
    String note="";                  /*备注*/
    String mg_org="";                //管理范围
    String mg_orgname;               /*管理范围名称*/
    String create_login="";          /*创建工号*/
    String update_login;             /*更新工号*/
    String avatar="";                /*头像base64数据*/

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

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

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getMg_org() {
        return mg_org;
    }

    public void setMg_org(String mg_org) {
        this.mg_org = mg_org;
    }

    public String getMg_orgname() {
        return mg_orgname;
    }

    public void setMg_orgname(String mg_orgname) {
        this.mg_orgname = mg_orgname;
    }

    public String getCreate_login() {
        return create_login;
    }

    public void setCreate_login(String create_login) {
        this.create_login = create_login;
    }

    public String getUpdate_login() {
        return update_login;
    }

    public void setUpdate_login(String update_login) {
        this.update_login = update_login;
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getLogin_no() {
        return login_no;
    }

    public void setLogin_no(String login_no) {
        this.login_no = login_no;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getLogin_type() {
        return login_type;
    }

    public void setLogin_type(String login_type) {
        this.login_type = login_type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender_name() {
        return gender_name;
    }

    public void setGender_name(String gender_name) {
        this.gender_name = gender_name;
    }

    public String getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(String grade_id) {
        this.grade_id = grade_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReset_password() {
        return reset_password;
    }

    public void setReset_password(String reset_password) {
        this.reset_password = reset_password;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getNew_password() {
        return new_password;
    }

    public void setNew_password(String new_password) {
        this.new_password = new_password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}

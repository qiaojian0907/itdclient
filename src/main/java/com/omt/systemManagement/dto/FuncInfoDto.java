package com.omt.systemManagement.dto;

/**
 * Created by wangbl on 2018/6/5.
 */
public class FuncInfoDto {
    String func_id="";     //功能编码
    String func_name="";   //功能名称
    String page_url="";    //功能页面对应路径
    String note="";        //功能描述
    String leaf="";        //是否叶子节点,1表示为叶子节点，0表示非叶子节点
    String sort_level="";  //排序等级，数字小排在前面
    String dparent_id="";  //直接父级节点
    String html="";        //生成的功能菜单树信息
    public String getFunc_id() {
        return func_id;
    }

    public void setFunc_id(String func_id) {
        this.func_id = func_id;
    }

    public String getFunc_name() {
        return func_name;
    }

    public void setFunc_name(String func_name) {
        this.func_name = func_name;
    }

    public String getPage_url() {
        return page_url;
    }

    public void setPage_url(String page_url) {
        this.page_url = page_url;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    public String getSort_level() {
        return sort_level;
    }

    public void setSort_level(String sort_level) {
        this.sort_level = sort_level;
    }

    public String getDparent_id() {
        return dparent_id;
    }

    public void setDparent_id(String dparent_id) {
        this.dparent_id = dparent_id;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }
}

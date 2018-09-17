package com.omt.systemManagement.dto;

/**
 * Created by wangbl on 2018/6/7.
 */
public class OrgInfoDto {
    String org_id="";       //组织ID
    String org_code="";     //组织编码
    String area="";         //区域
    String org_name="";     //组织节点名称
    String note="";         //备注
    String leaf="";         //是否叶子节点，1为叶子节点、0非叶子节点
    String sort_level="";   //排序等级，1排最上面
    String dparent_id="";   //直接父级节点id

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getOrg_code() {
        return org_code;
    }

    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
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
}

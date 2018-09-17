package com.omt.common.storage;

/**
 * Created by wangbl on 2018/3/22.
 */
public class AnnexDto {
    String annex_id ="";             /*附件信息id*/
    String annex_name ="";           /*附件名称*/
    String path ="";                 /*附件路径*/
    String create_date ="";          /*创建时间*/

    public String getAnnex_id() {
        return annex_id;
    }

    public void setAnnex_id(String annex_id) {
        this.annex_id = annex_id;
    }

    public String getAnnex_name() {
        return annex_name;
    }

    public void setAnnex_name(String annex_name) {
        this.annex_name = annex_name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }
}

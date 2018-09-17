package com.omt.malfunctionRepair.dto;

/**
 * Created by liuxiao on 2018/7/1.
 */
public class RepairStatisticsDto {
    private String oper_date;
    private String count;
    private String name;
    private String code;

    public String getOper_date() {
        return oper_date;
    }

    public void setOper_date(String oper_date) {
        this.oper_date = oper_date;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

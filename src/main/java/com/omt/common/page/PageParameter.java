package com.omt.common.page;

/**
 * Created by wangbl on 16/7/17.
 */
//翻页查询参数
public class PageParameter {
    public Object parameter;       //查询参数对象
    private int pageNumber = 0;    //页码，默认0为第一页
    private int pageRecords = 10;  //每页显示的记录数，默认是10
    private int recordsTotal = 1110;  //总记录数
    String order_column = "";      //排序字段
    String order_dir = "";         //排序方式asc或desc
    private boolean flag =false;   //是否翻页

    public Object getParameter() {
        return parameter;
    }

    public void setParameter(Object parameter) {
        this.parameter = parameter;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageRecords() {
        return pageRecords;
    }

    public void setPageRecords(int pageRecords) {
        this.pageRecords = pageRecords;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public String getOrder_column() {
        return order_column;
    }

    public void setOrder_column(String order_column) {
        this.order_column = order_column;
    }

    public String getOrder_dir() {
        return order_dir;
    }

    public void setOrder_dir(String order_dir) {
        this.order_dir = order_dir;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

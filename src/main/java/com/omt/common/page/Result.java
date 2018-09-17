package com.omt.common.page;

import java.util.List;

/**
 * Created by wangbl on 16/7/13.
 */
public class Result<T> {
    int draw = 0;
    int recordsTotal = 0;
    int recordsFiltered = 0;
    List<T> data;

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
}

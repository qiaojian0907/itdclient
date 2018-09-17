package com.omt.common.page;

/**
 * Created by wangbl on 16/7/18.
 */
//此类保存翻页需要的数据
public class BaseDto {
   public PageParameter page=new PageParameter();

    public PageParameter getPage() {
        return page;
    }

    public void setPage(PageParameter page) {
        this.page = page;
    }
}

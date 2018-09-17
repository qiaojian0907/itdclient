package com.omt.common.tool;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by wangbl on 2018/6/15.
 */
public class DateFunc {
    Calendar calendar=new GregorianCalendar();
    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
    Date date=new Date();
    //日期加减运算
    public String dateAS(int obj){
        calendar.setTime(date);
        calendar.add(calendar.DATE,obj);
        date=calendar.getTime();
        return format.format(date);
    }
	/*public static void main(String args[]){
		System.out.println(new DateFunc().dateAS(-1));
	}*/
}

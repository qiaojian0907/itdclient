package com.omt.common.page;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.util.Enumeration;

/**
 * Created by wangbl on 16/7/18.
 * 数据转换,将request中的值映射到PageParameter对象
 */
@Repository
public class DataConversion {
    private static Logger logger = Logger.getLogger(DataConversion.class);
    public PageParameter setPageValues(HttpServletRequest request){

        Enumeration en = request.getParameterNames();
        while (en.hasMoreElements()) {
            String paramName = (String) en.nextElement();
            logger.info(paramName + " = " + request.getParameter(paramName));
        }

        String str=request.getParameter("order[0][column]");
        String order_dir=request.getParameter("order[0][dir]");
        String order_column= request.getParameter("columns["+str+"][data]");
        //String order_dir ="asc";
        //String order_column="lc_id";
       // System.out.println("----------------------------toString-----------------------"+request.getParameter("columns["+str+"][data]"));
        int start = request.getParameter("start")==null?0:Integer.parseInt(request.getParameter("start"));
        int length = request.getParameter("length")==null?999:Integer.parseInt(request.getParameter("length"));
        int recordsTotal = request.getParameter("recordsTotal")==null?0:Integer.parseInt(request.getParameter("recordsTotal"));

        PageParameter pageParameter = new PageParameter();
        pageParameter.setOrder_column(order_column);
        pageParameter.setOrder_dir(order_dir);
        pageParameter.setPageNumber(start/length);
        pageParameter.setPageRecords(length);
        pageParameter.setRecordsTotal(recordsTotal);
        return  pageParameter;
    }
    //通过反射reflection将传入的参数影射到对象中
    public Object objectMapping(HttpServletRequest request,Object obj){
        try {
            Enumeration en = request.getParameterNames();
            int i=0;
            while (en.hasMoreElements()) {
                ++i;
                String paramName = (String) en.nextElement();
                logger.info(paramName + " = " + request.getParameter(paramName));
                if(i>1){
                    paramName.substring(paramName.indexOf("][")+2,paramName.length()-1);
                    ReflectUtil.setFieldValue(obj,paramName.substring(paramName.indexOf("][")+2,paramName.length()-1),request.getParameter(paramName));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }/*
    public static void main(String args[]){
        DataConversion dt=new DataConversion();
        LogisticsCompanyDto dto = new LogisticsCompanyDto();
        dto.setLc_name("韵达");
        System.out.println("data[0][lc_id]".indexOf("]["));
        System.out.println("data[0][lc_id]".substring(6+2,"data[0][lc_id]".length()-1));
        //HttpServletRequest request =new HttpServletRequestWrapper();
        //dt.reflectionObject(dto);
    }*/
    /**
     * 利用反射进行操作的一个工具类
     *
     */
    private static class ReflectUtil {
        /**
         * 利用反射获取指定对象的指定属性
         * @param obj 目标对象
         * @param fieldName 目标属性
         * @return 目标属性的值
         */
        public static Object getFieldValue(Object obj, String fieldName) {
            Object result = null;
            Field field = ReflectUtil.getField(obj, fieldName);
            if (field != null) {
                field.setAccessible(true);
                try {
                    result = field.get(obj);
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return result;
        }

        /**
         * 利用反射获取指定对象里面的指定属性
         * @param obj 目标对象
         * @param fieldName 目标属性
         * @return 目标字段
         */
        private static Field getField(Object obj, String fieldName) {
            Field field = null;
            for (Class<?> clazz=obj.getClass(); clazz != Object.class; clazz=clazz.getSuperclass()) {
                try {
                    field = clazz.getDeclaredField(fieldName);
                    break;
                } catch (NoSuchFieldException e) {
                    //这里不用做处理，子类没有该字段可能对应的父类有，都没有就返回null。
                }
            }
            return field;
        }

        /**
         * 利用反射设置指定对象的指定属性为指定的值
         * @param obj 目标对象
         * @param fieldName 目标属性
         * @param fieldValue 目标值
         */
        public static void setFieldValue(Object obj, String fieldName,
                                         String fieldValue) {
            Field field = ReflectUtil.getField(obj, fieldName);
            if (field != null) {
                try {
                    field.setAccessible(true);
                    field.set(obj, fieldValue);
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}

package com.omt.pub;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zuoyue on 2018/6/12.
 */
public class ServiceUrlBean {
    private static Logger logger = Logger.getLogger(ServiceUrlBean.class);
    private List serviceUrls ;
    private int counter=0;//计数器
    public ServiceUrlBean(String serviceUrl){
        if(serviceUrl != null){
            int num=0;
            serviceUrls =new ArrayList();
            for(String str:serviceUrl.split(";")){
                serviceUrls.add(num,str);num++;
                logger.debug(str);
            }
        }else{
            logger.error("serviceUrl无数据加载!");
        }
    }
    public synchronized String getServiceUrl(){
        String service= serviceUrls.get(counter).toString();
        if(counter<serviceUrls.size()-1){
            counter++;
        }else{
            counter=0;
        }
        return service;
    }
    public void delServiceUrl(){}
    public void addServiceUrl(){}

}

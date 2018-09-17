package com.omt.common.dataBase;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;

/**
 * Created by wangbl on 16/8/18.
 */
//@Configuration
//@ConfigurationProperties(value = "spring.ds_hall")
public class DataSource {
    BasicDataSource datasource=new BasicDataSource();
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    /**
     * @return the driverClassName
     */
    public String getDriverClassName() {
        if (StringUtils.hasText(this.driverClassName)) {
            return this.driverClassName;
        }
        return driverClassName;
    }
    /**
     * @param driverClassName the driverClassName to set
     */
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }
    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Bean(name = "primaryDataSource")
    public BasicDataSource getDataSource(){
        datasource.setDriverClassName(driverClassName);
        datasource.setUrl(url);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setInitialSize(10);
        datasource.setMaxActive(20);
        datasource.setMaxIdle(10);
        datasource.setMinIdle(5);
        datasource.setRemoveAbandoned(true);
        datasource.setRemoveAbandonedTimeout(60);
        datasource.setMaxWait(10000);
        datasource.setLogAbandoned(true);
        datasource.setTestOnBorrow(true);
        datasource.setTestOnReturn(true);
        datasource.setTestWhileIdle(true);
        datasource.setMinEvictableIdleTimeMillis(180000);
        datasource.setTimeBetweenEvictionRunsMillis(360000);
        datasource.setValidationQuery("SELECT 1 FROM DUAL");
        return datasource;
    }
}


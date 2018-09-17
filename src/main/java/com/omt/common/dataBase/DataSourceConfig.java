package com.omt.common.dataBase;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by wangbl on 16/7/12.
 */
@Configuration
public class DataSourceConfig {

    @Value("${hikaricp.datasource.dataSourceClassName}")
    private String dataSourceClassName;


    @Value("${hikaricp.datasource.connectionTimeout}")
    private int connectionTimeout;

    @Value("${hikaricp.datasource.maxLifetime}")
    private int maxLifetime;

    @Value("${hikaricp.datasource.maximumPoolSize}")
    private int maximumPoolSize;


    @Value("${hikaricp.datasource.idleTimeout}")
    private int idleTimeout;


    @Value("${hikaricp.datasource.connectionTestQuery}")
    private String connectionTestQuery;

    @Bean
    @ConfigurationProperties(prefix = "hikari.datasource")
    public DataBaseParameter dataParameter(){
        return new DataBaseParameter();
    }
    @Autowired
    DataBaseParameter dataBaseParameter;

    @Bean
    public DataSource primaryDataSource() {
        Properties dsProps = new Properties();


      /*//生产环境通过此处获取数据库连接信息
            ResourceInfo resourceInfo = EncryptInterface.desDecryptData("COMP1_DBESOPOPR");
        System.out.println("------------------------------------测试分割线---------------------------------------------");
        System.out.println("ResourceInfo.dbServ == " + resourceInfo.getDbServ());
        System.out.println("ResourceInfo.dbURL == " + resourceInfo.getDbURL());
        System.out.println("ResourceInfo.dbUser == " + resourceInfo.getDbUser());
        System.out.println("ResourceInfo.dbPasswd == " + resourceInfo.getDbPasswd());
        System.out.println("ResourceInfo.retCode == " + resourceInfo.getRetCode());
        System.out.println("ResourceInfo.retDesc == " + resourceInfo.getRetDesc());
        System.out.println("ResourceInfo.resType == " + resourceInfo.getResType());
        System.out.println("ResourceInfo.hostIP == " + resourceInfo.getHostIP());
        System.out.println("ResourceInfo.hostUser == " + resourceInfo.getHostUser());
        System.out.println("ResourceInfo.hostPasswd == " + resourceInfo.getHostPasswd());

            dsProps.put("url", resourceInfo.getDbURL());
            dsProps.put("user", resourceInfo.getDbUser());
            dsProps.put("password", resourceInfo.getDbPasswd());*/
       // System.out.println("ResourceInfo.hostPasswd == " + dataBaseParameter.getPassword());
        //以下代码为开发使用
        dsProps.put("url", dataBaseParameter.getUrl());
        dsProps.put("user", dataBaseParameter.getUsername());
        dsProps.put("password", dataBaseParameter.getPassword());

        //mysql配置使用参数

        dsProps.put("prepStmtCacheSize",250);
        dsProps.put("prepStmtCacheSqlLimit",2048);
        dsProps.put("cachePrepStmts",Boolean.TRUE);
        dsProps.put("useServerPrepStmts",Boolean.TRUE);
        /**/

        Properties configProps = new Properties();
        configProps.put("dataSourceClassName", dataSourceClassName);
        configProps.put("maximumPoolSize", maximumPoolSize);
        configProps.put("maxLifetime",maxLifetime);

        configProps.put("connectionTimeout", connectionTimeout);
        configProps.put("idleTimeout", idleTimeout);
        configProps.put("connectionTestQuery",connectionTestQuery);
        configProps.put("dataSourceProperties", dsProps);

        HikariConfig hc = new HikariConfig(configProps);
        HikariDataSource ds = new HikariDataSource(hc);
        return ds;
    }
}
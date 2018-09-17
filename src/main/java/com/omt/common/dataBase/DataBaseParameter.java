package com.omt.common.dataBase;


/**
 * Created by wangbl on 16/8/18.
 */
/*数据库连接用户名,密码等参数*/
public class DataBaseParameter {
    String url="";
    String username="";
    String password="";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

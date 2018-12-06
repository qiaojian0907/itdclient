package com.dh.dto;

/**
 * Created by QiaoJian on 2018/10/11.
 */
public class DpsdkLoginDto {
    String m_strIp = "";  //ip
    String m_nPort = "";  //端口
    String m_strUser = "";//用户名
    String m_strPassword = "";//密码

    public String getM_strIp() {
        return m_strIp;
    }

    public void setM_strIp(String m_strIp) {
        this.m_strIp = m_strIp;
    }

    public String getM_nPort() {
        return m_nPort;
    }

    public void setM_nPort(String m_nPort) {
        this.m_nPort = m_nPort;
    }

    public String getM_strUser() {
        return m_strUser;
    }

    public void setM_strUser(String m_strUser) {
        this.m_strUser = m_strUser;
    }

    public String getM_strPassword() {
        return m_strPassword;
    }

    public void setM_strPassword(String m_strPassword) {
        this.m_strPassword = m_strPassword;
    }
}

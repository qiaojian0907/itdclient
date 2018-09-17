package com.omt.systemManagement.service;

import com.omt.common.dataBase.SqlE;
import com.omt.systemManagement.dto.FuncInfoDto;
import com.omt.systemManagement.dto.LoginInfoDto;
import com.omt.systemManagement.dto.SessionDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangbl on 2018/6/8.
 */
@Repository
public class LoginService {
    private static Logger logger = Logger.getLogger(LoginService.class);
    @Autowired
    SqlE sqlE;

    //查询工号信息
    public List<LoginInfoDto> selectLoginInfoByLoginNo(LoginInfoDto param) {
        return sqlE.selectM("selectLoginInfoByLoginNo", param);
    }

    //查询工号列表
    public int getLoginInfoCount(LoginInfoDto obj) {
        return (int) sqlE.selectM("getLoginInfoCount", obj).get(0);
    }

    //查询工号列表
    public List getLoginInfoList(LoginInfoDto obj) {
        return sqlE.selectM("getLoginInfoList", obj);
    }

    //查询工号明细
    public LoginInfoDto getLoginInfo(LoginInfoDto obj) {
        obj = (LoginInfoDto) sqlE.selectM("getLoginInfo", obj).get(0);
        LoginInfoDto temp = new LoginInfoDto();
        List list;
        list = sqlE.selectM("getroleInfoByLoginId", obj);
        if (list.get(0) != null) {
            temp = (LoginInfoDto) list.get(0);
            obj.setRole_id(temp.getRole_id());
            obj.setRole_name(temp.getRole_name());
        }
        list = sqlE.selectM("getMgOrgByLoginId", obj);
        if (list.get(0) != null) {
            temp = (LoginInfoDto) list.get(0);
            obj.setMg_org(temp.getMg_org());
            obj.setMg_orgname(temp.getMg_orgname());
        }
        return obj;
    }
    //查询头像
    public SessionDto getAvatarByLoginNo(SessionDto obj) {
        List list;
        list = sqlE.selectM("getAvatarByLoginNo", obj);
        if (list.get(0) != null) {
            obj=(SessionDto) list.get(0);
        }
        return obj;
    }
    //增加工号
    @Transactional(propagation = Propagation.REQUIRED)
    public int addLoginInfo(LoginInfoDto obj) {
        Md5PasswordEncoder md5 = new Md5PasswordEncoder();
        obj.setPassword(md5.encodePassword("123456", null));
        sqlE.insertM("addLoginInfo", obj);
        sqlE.insertM("insertLoginRoleRel", obj);
        sqlE.insertM("insertLoginMgOrgRel", obj);
        return 1;
    }

    //更新工号信息
    @Transactional(propagation = Propagation.REQUIRED)
    public int updateLoginInfo(LoginInfoDto obj) {
        sqlE.insertM("updateLoginInfo", obj);
        sqlE.insertM("deleteLoginRoleRel", obj);
        sqlE.insertM("deleteLoginMgOrgRel", obj);
        sqlE.insertM("insertLoginRoleRel", obj);
        sqlE.insertM("insertLoginMgOrgRel", obj);
        return 1;
    }

    //删除工号信息
    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteLoginInfo(LoginInfoDto obj) {
        sqlE.insertM("deleteLoginInfo", obj);
        sqlE.insertM("deleteLoginRoleRel", obj);
        sqlE.insertM("deleteLoginMgOrgRel", obj);
        return 1;
    }

    //通过用户id获取功能点
    public String getFuncUid(LoginInfoDto obj) {
        String functree = "";
        FuncInfoDto temp = new FuncInfoDto();
        List list;
        list = sqlE.selectM("getFuncUid", obj);
        Map map = new HashMap();
        List templist;
        StringBuffer strb;
        for (int i = 0; i < (list.size()); i++) {
            temp = (FuncInfoDto) list.get(i);
            if (temp.getLeaf().equals("1")) {
                if (map.get(temp.getDparent_id()) == null) {
                    templist = new ArrayList();
                    templist.add(temp.getHtml());
                    map.put(temp.getDparent_id(), templist);
                } else {
                    templist = (ArrayList) map.get(temp.getDparent_id());
                    templist.add(temp.getHtml());
                    map.put(temp.getDparent_id(), templist);
                }
            } else {
                if (map.get(temp.getDparent_id()) == null) {
                    templist = new ArrayList();
                } else {
                    templist = (ArrayList) map.get(temp.getDparent_id());
                }
                strb = new StringBuffer();
                List strlist = (ArrayList) map.get(temp.getFunc_id());
                if (strlist != null) {
                    for (int ii = 0; ii < strlist.size(); ii++) {
                        strb.append(strlist.get(ii));
                    }
                }
                templist.add(temp.getHtml() + strb.toString() + "</ul></li></ul>");
                map.remove(temp.getFunc_id());
                map.put(temp.getDparent_id(), templist);
            }
            if (i == (list.size() - 1)) {
                strb = new StringBuffer();
                List strlist;
                // List strlist=(ArrayList)map.get(temp.getDparent_id());

                for (Object value : map.values()) {
                    strlist = (ArrayList) value;
                    for (int ii = 0; ii < strlist.size(); ii++) {
                        strb.append(strlist.get(ii));
                    }

                }
                logger.debug(strb.toString());
                functree = strb.toString();
            }
        }
        return functree;
    }
}

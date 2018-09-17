package com.omt.systemManagement.controller;

import com.omt.common.jsTree.GridDto;
import com.omt.common.jsTree.JsonData;
import com.omt.common.tool.DateFunc;
import com.omt.systemManagement.dto.LoginInfoDto;
import com.omt.systemManagement.dto.SessionDto;
import com.omt.systemManagement.service.LoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangbl on 2018/6/8.
 */
@RestController
public class LoginController {
    private static Logger logger = Logger.getLogger(LoginController.class);
    @Autowired
    LoginService loginService;
    //获得用户的session信息
    @RequestMapping(value="/getSessionInfo")
    public SessionDto getSessionInfo(HttpServletRequest request, HttpSession session){
        SessionDto obj=new SessionDto();
        // 登录名
        SecurityContextImpl securityContextImpl = (SecurityContextImpl) request
                .getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        obj.setLogin_no(securityContextImpl.getAuthentication().getName());
        obj=loginService.getAvatarByLoginNo(obj);
        Map user = (Map) session.getAttribute("userMap");
        /*obj.setName(user.get("name").toString());
        obj.setUname(user.get("uname").toString());
        obj.setOrg_id(user.get("org_id").toString());
        obj.setUid(user.get("uid").toString());
        obj.setRole_name(user.get("role_name").toString());
        obj.setPhone(user.get("phone").toString());
        obj.setOrg_name(user.get("org_name").toString());
        obj.setAddress(user.get("address").toString());
        obj.setNote(user.get("note").toString());
        obj.setSex(user.get("sex").toString());*/
        obj.setFuncMenu((String)session.getAttribute("funcMenu"));
        obj.setDatePlusOne(new DateFunc().dateAS(1));
        return obj;
    }
    //获得工号列表数据
    @RequestMapping(value="/getLoginInfoList")
    public JsonData getLoginInfoList(LoginInfoDto obj, GridDto griddto){

        JsonData jdata=new JsonData();
        HashMap map=(HashMap)griddto.getPage_par().get(0);
        System.out.println(griddto.getPage_par());
        if(!map.get("login_no").toString().equals(""))
            obj.setLogin_no(map.get("login_no").toString());
        if(!map.get("login_name").toString().equals(""))
            obj.setLogin_name(map.get("login_name").toString());
        if(!map.get("phone_no").toString().equals(""))
            obj.setPhone_no(map.get("phone_no").toString());
        if(!map.get("org_id").toString().equals(""))
            obj.setOrg_id(map.get("org_id").toString());
        int count=loginService.getLoginInfoCount(obj);
        jdata.setTotal_rows(count);
        List list=loginService.getLoginInfoList(obj);
        jdata.setPage_data(list);
        return jdata;
    }
    //获得工号明细数据
    @RequestMapping(value="/getLoginInfo")
    public LoginInfoDto getLoginInfo(LoginInfoDto obj){
        return loginService.getLoginInfo(obj);
    }
    //增加工号
    @RequestMapping(value="/addLoginInfo")
    public int addLoginInfo(LoginInfoDto obj){
    logger.debug("obj="+obj.getAvatar());
        if(obj.getSex().equals("on")) obj.setSex("1"); else obj.setSex("0");
        if(obj.getValid().equals("on")) obj.setValid("1"); else obj.setValid("0");
        return loginService.addLoginInfo(obj);
    }
    //修改工号明细数据
    @RequestMapping(value="/updateLoginInfo")
    public int updateLoginInfo(LoginInfoDto obj){
        if(obj.getSex().equals("on")) obj.setSex("1"); else obj.setSex("0");
        if(obj.getValid().equals("on")) obj.setValid("1"); else obj.setValid("0");
        return loginService.updateLoginInfo(obj);
    }
    //删除一条工号数据
    @RequestMapping(value="/deleteLoginInfo")
    public int deleteLoginInfo(LoginInfoDto obj){
        return loginService.deleteLoginInfo(obj);
    }
}

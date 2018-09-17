package com.omt.systemManagement.controller;

import com.omt.common.jsTree.JSTreeSDto;
import com.omt.systemManagement.dto.RoleInfoDto;
import com.omt.systemManagement.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wangbl on 2018/6/6.
 */
@RestController
public class RoleController {
    @Autowired
    RoleService roleService;
    //获得角色tree节点数据
    @RequestMapping(value="/getRoleTree")
    public List<JSTreeSDto> getFuncTree(RoleInfoDto obj){
        List list=roleService.getRoleJSTree(obj);
        return list;
    }
    //添加角色
    @RequestMapping(value="/addRole")
    public int addRole(RoleInfoDto obj){
        int result=roleService.addRole(obj);
        return result;
    }
    //获得角色对应功能点
    @RequestMapping(value="/getRoleFuncId")
    public RoleInfoDto getRoleFuncId(RoleInfoDto obj){
        return roleService.getSelectFuncId(obj);
    }
    //删除角色
    @RequestMapping(value="/deleteRole")
    public int deleteRole(RoleInfoDto obj){
        int result=roleService.deleteRole(obj);
        return result;
    }
    //更新角色
    @RequestMapping(value="/updateRole")
    public int updateRole(RoleInfoDto obj){
        int result=roleService.updateRole(obj);
        return result;
    }
}

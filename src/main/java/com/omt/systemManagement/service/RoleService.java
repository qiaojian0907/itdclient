package com.omt.systemManagement.service;

import com.omt.common.dataBase.SqlE;
import com.omt.common.jsTree.JSTreeSDto;
import com.omt.systemManagement.dto.RoleInfoDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wangbl on 2018/6/6.
 */
@Repository
public class RoleService {
    private static Logger logger = Logger.getLogger(RoleService.class);
    @Autowired
    SqlE sqlE;
    //查询角色列表tree
    public List<JSTreeSDto> getRoleJSTree(RoleInfoDto obj){
        return sqlE.selectM("selectRoleCreateLogin", obj);
    }
    //添加角色
    @Transactional(propagation = Propagation.REQUIRED)
    public int addRole(RoleInfoDto obj){
        //obj.setRole_id(sqlE.selectM("getRoleid").get(0).toString());
        if(obj.getNote().equals("")){
            obj.setNote("  ");
        }
        System.out.println("obj.getCreate_login="+obj.getCreate_login());
        System.out.println("obj.getFunc_select="+obj.getFunc_select());
        sqlE.insertM("addRoleInfo", obj);
        sqlE.insertM("deleteRoleFuncRel", obj);
        if(!obj.getFunc_select().trim().equals(""))
            sqlE.insertM("insertRoleFuncRel", obj);
        return Integer.parseInt(obj.getRole_id());
    }
    //获得角色对应功能点
    public RoleInfoDto getSelectFuncId(RoleInfoDto obj){
        RoleInfoDto temp=new RoleInfoDto();
        List list;
        list=sqlE.selectM("getRoleInfoId",obj);
        obj=(RoleInfoDto)list.get(0);
        list=sqlE.selectM("getRoleFuncid",obj);
        if(list.get(0)!=null){
            temp=(RoleInfoDto)list.get(0);
            obj.setFunc_select(temp.getFunc_select());
        }
        return obj;
    }
    //删除角色
    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteRole(RoleInfoDto obj){
        int result=sqlE.insertM("deleteRoleInfo", obj);
        sqlE.insertM("deleteRoleFuncRel", obj);
        return result;
    }
    //更新角色
    @Transactional(propagation=Propagation.REQUIRED)
    public int updateRole(RoleInfoDto obj){
        if(obj.getNote().equals("")){
            obj.setNote("  ");
        }
        System.out.println("obj.getFunc_select="+obj.getFunc_select());
        int result=sqlE.insertM("updateRoleInfo", obj);
        sqlE.insertM("deleteRoleFuncRel", obj);
        sqlE.insertM("insertRoleFuncRel", obj);
        return result;
    }
}

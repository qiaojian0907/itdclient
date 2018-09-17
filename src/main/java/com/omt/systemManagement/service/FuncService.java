package com.omt.systemManagement.service;

import com.omt.common.dataBase.SqlE;
import com.omt.common.jsTree.JSTreeDto;
import com.omt.systemManagement.dto.FuncInfoDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wangbl on 2018/6/5.
 */
@Repository
public class FuncService {
    private static Logger logger = Logger.getLogger(FuncService.class);
    @Autowired
    SqlE sqlE;
    //查询功能列表tree
    public List<JSTreeDto> getFuncJSTree(JSTreeDto obj){
        return sqlE.selectM("selectFuncParentId", obj);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public int addFunc(FuncInfoDto obj){
        //obj.setFunc_id(sqlE.selectM("getFuncid").get(0).toString());
        if(obj.getNote().equals("")){
            obj.setNote("  ");
        }
        if(obj.getSort_level().equals("")){
            obj.setSort_level("99");
        }
        obj.setLeaf("0");

        sqlE.insertM("addFuncInfo", obj);
        sqlE.insertM("insertFuncRel", obj);
        sqlE.insertM("updateFuncInfoLeaf", obj);
        return Integer.parseInt(obj.getFunc_id());
    }
    public List getFuncInfo(JSTreeDto obj){
        return sqlE.selectM("selectFuncInfoParentId", obj);
    }
    public boolean updateFuncInfo(FuncInfoDto obj){
        sqlE.updateM("updateFuncInfo",obj);
        return true;
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteFuncInfo(FuncInfoDto obj){
        sqlE.updateM("deleteFuncInfoAndFuncRel",obj);
        if((int)sqlE.selectM("getFuncRelnum", obj).get(0)==1){
            obj.setLeaf("1");//1为true，2为false
            sqlE.updateM("updateFuncInfoLeaf", obj);
        }
        return true;
    }
}

package com.omt.systemManagement.controller;

import com.omt.common.jsTree.JSTreeDto;
import com.omt.common.page.DataConversion;
import com.omt.common.page.Result;
import com.omt.systemManagement.dto.FuncInfoDto;
import com.omt.systemManagement.service.FuncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangbl on 2018/6/5.
 */
@RestController
public class FuncController {
    @Autowired
    FuncService funcService;
    DataConversion dataConversion;
    Result result = new Result();
    //同时展开所有tree节点
    @RequestMapping(value="/getFuncInfoTree")
    public List<JSTreeDto> getFuncInfoTree(JSTreeDto jstreedto, boolean flag){
        List list;
        if(flag){
            list=new ArrayList();
            list.add(jstreedto);
        }else{
            list=funcService.getFuncJSTree(jstreedto);
        }
        return list;
    }
    //查询系统功能信息列表展现
    @RequestMapping(value="/getFuncInfo")
    public List getFuncInfo(JSTreeDto jstreedto){
        return funcService.getFuncInfo(jstreedto);
    }
    //添加系统功能信息
    @RequestMapping(value="/addFunc")
    public int addFunc(FuncInfoDto obj){
        return funcService.addFunc(obj);
    }
    //更新系统功能信息
    @RequestMapping(value="/updateFunc")
    public boolean updateFunc(FuncInfoDto obj){
        return funcService.updateFuncInfo(obj);
    }
    //删除系统功能信息
    @RequestMapping(value="/deleteFunc")
    public boolean deleteFunc(FuncInfoDto obj){
        return funcService.deleteFuncInfo(obj);
    }
}

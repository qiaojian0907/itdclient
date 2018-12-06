package com.omt.Rest.controller;

import com.omt.Rest.tool.JsonResult;
import com.omt.Rest.tool.ResultCode;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by QiaoJian on 2018/11/5.
 */
@RestController
public class RestServer {
    @RequestMapping(value = "/getData")
    public JsonResult getData(@RequestBody Map<String,Object> map){

        System.out.println("S1="+map.get("S1"));
        System.out.println("S0="+map.get("S0"));
        return new JsonResult(ResultCode.SUCCESS, "操作成功！", null);
    }
}

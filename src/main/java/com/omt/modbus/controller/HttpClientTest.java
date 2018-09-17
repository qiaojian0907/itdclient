package com.omt.modbus.controller;

import com.omt.modbus.util.HttpClientUtil;
import com.omt.modbus.util.JsonUtil;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

@RestController
public class HttpClientTest {

    //@RequestMapping(value = "/test")
    public static String test(){
        String resultMsg = "";
        try {
            resultMsg = HttpClientUtil.doPost("http://192.168.31.230:8082/getRTUModbusData","");
            System.out.println("返回结果-----"+resultMsg);
            JSONObject json = JSONObject.fromObject(resultMsg);
            System.out.println("json-----"+json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultMsg;
    }

    //@RequestMapping(value = "/test1")
    public static String test1(){
        String resultMsg = "";
        HttpServletRequest request = HttpClientUtil.getRequest();
        try {
            resultMsg = HttpClientUtil.readRequest(request);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = "{\"data\":[{\"IR_SRCNAME\":\"车主之家\",\"IR_SITENAME\":\"车主之家\",\"IR_AUTHORS\":null,\"IR_URLTITLE\":\"2017年4月份高尔夫销量11798台, 同比下降20.24%\",\"IR_URLNAME\":\"http://news.16888.com/a/2017/0521/8172148.html\",\"IR_ABSTRACT\":\" 2017年4月份高尔夫销量11798台 \",\"IR_URLTIME\":\"2017/05/21 23:35:00\",\"IR_HKEYBBSNUM\":\"18093721078864168420-0\",\"IR_CHANNEL\":\"新闻_汽车新闻\",\"COMPANY_RISK_CONN\":\"汽车之家股份有限公司_财务风险\\偿债能力\\营运资本_18;\",\"ZFM\":\"负面\"}],\"path\":\"/cloud/wsu/queryByKeyword!get_by_fullname.action\",\"rstcode\":\"0000\",\"rstcount\":19476,\"cmpname\":\"汽车之家股份有限公司\",\"shortname\":\"汽车之家\",\"rstmsg\":\"查询成功\"}";
        Map map = JsonUtil.json2Map(str);
        System.out.println("coil-----"+map);
        System.out.println(resultMsg);
        return resultMsg;
    }
}

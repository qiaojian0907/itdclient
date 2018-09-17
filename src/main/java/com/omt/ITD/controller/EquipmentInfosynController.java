package com.omt.ITD.controller;

import com.omt.HttpClient.HttpClientUtil;
import com.omt.ITD.dto.EquipmentInfosynDto;
import com.omt.ITD.service.EquipmentInfosynService;
import com.omt.informationManagement.dto.equipmnetInfoDto;
import com.omt.informationManagement.dto.laneEquipmentDto;
import net.sf.json.JSONObject;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * Created by zuoyue on 2018/7/23.
 */
@RestController
public class EquipmentInfosynController {
    private static final org.apache.commons.logging.Log log = LogFactory.getLog(EquipmentInfosynController.class);
    @Autowired
    EquipmentInfosynService equipmentInfosynService;

    //网络设备查询
    @RequestMapping(value = "/netEquipmentQuery")
    public List netEquipmentQuery(equipmnetInfoDto param){
        return equipmentInfosynService.netEquipmentQuery(param);
    }




    //批量更新网络设备IP
    @RequestMapping(value = "/updateIP")
    public int updateIP(equipmnetInfoDto param){
        int data = 0;
        String[] idarray = param.getId_model().split(",");
        String[] iparray = param.getEquipment_ip().split(",");
        System.out.println("equipment_ip=");
        for (int i=0;i<idarray.length;i++){
            param.setEquipment_ip(iparray[i]);
            param.setId(Integer.valueOf(idarray[i]).intValue());
            log.info(Integer.valueOf(idarray[i]).intValue());
            log.info(iparray[i]);
            data += equipmentInfosynService.updateIP(param);
        }
        return data;
    }

    //测试
    @RequestMapping(value = "/testmodbus")
    public static String test(){
        String resultMsg = "";
        try {
            resultMsg = HttpClientUtil.doPost("http://192.168.31.230:8088/getModbusData","");
            System.out.println("返回结果-----"+resultMsg);
            JSONObject json = JSONObject.fromObject(resultMsg);
            System.out.println("json-----"+json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultMsg;
    }


    //测试
    @RequestMapping(value = "/testback")
    public static String testback(){
        String resultMsg = "";
        try {
            HttpServletRequest request = HttpClientUtil.getRequest();
            String inputParam	= HttpClientUtil.readRequest(request);
            System.out.println(inputParam);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultMsg;
    }

    //设备健康分析--收费站车道查询
    @RequestMapping(value = "/queryLane")
    public List queryLane(laneEquipmentDto param){
        return  equipmentInfosynService.queryLane(param);
    }

    //故障设备统计分析
    @RequestMapping(value = "/errorequipment")
    public List errorequipment(EquipmentInfosynDto param){
        return equipmentInfosynService.errorequipment(param);
    }

}

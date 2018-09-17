package com.omt.ITD.controller;

import com.omt.ITD.dto.FaultLogDto;
import com.omt.ITD.dto.ITDFaultDto;
import com.omt.ITD.service.FaultLogService;
import com.omt.ITD.service.ITDFaultService;
import com.omt.modbus.controller.ModbusController;
import com.omt.modbus.dto.ModbusDataDto;
import com.omt.modbus.dto.ModbusLogDto;
import com.omt.modbus.service.ModbusService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by liuxiao on 2018/8/21.
 */

@RestController
public class ITDController {
    private static final Logger logger = Logger.getLogger(ITDController.class);
    @Autowired
    FaultLogService faultLogService;
    @Autowired
    ITDFaultService itdFaultService;
    @Autowired
    ModbusService modbusService;
    @RequestMapping(value = "/qryHoldModbusData")
    public ModbusDataDto qryHoldModbusData(HttpServletRequest request, HttpServletResponse response){
        String ip = request.getParameter("ip");
        int slaveId = Integer.parseInt(request.getParameter("slaveId"));
        int start = Integer.parseInt(request.getParameter("start"));
        int len = Integer.parseInt(request.getParameter("len"));
        return ModbusController.getHoldModbusData(ip,slaveId,start,len);
    }

    @RequestMapping(value = "/qryDiscModbusData")
    public ModbusDataDto qryDiscModbusData(HttpServletRequest request, HttpServletResponse response){
        String ip = request.getParameter("ip");
        int slaveId = Integer.parseInt(request.getParameter("slaveId"));
        int start = Integer.parseInt(request.getParameter("start"));
        int len = Integer.parseInt(request.getParameter("len"));
        return null;
    }

    /**
     * 新增故障日志
     * @param param
     * @return
     */
    @RequestMapping(value = "/addFaultLogInfo")
    public int addFaultLogInfo(FaultLogDto param){
        return faultLogService.addFaultLogInfo(param);
    }
    /**
     * 更新故障日志
     * @param param
     * @return
     */
    @RequestMapping(value = "/updateFaultLogInfo")
    public int updateFaultLogInfo(FaultLogDto param){
        System.out.println(param.getAssignee());
        System.out.println(param.getOper_no());
        System.out.println(param.getOper_name());
        System.out.println(param.getOper_date());
        System.out.println(param.getId());
        System.out.println(param.getStatus());
        return faultLogService.updateFaultLogInfo(param);
    }
    /**
     * 查询故障日志
     * @param param
     * @return
     */
    @RequestMapping(value = "/qryFaultLogInfo")
    public List<FaultLogDto> qryFaultLogInfo(FaultLogDto param){
        return faultLogService.qryFaultLogInfo(param);
    }

    /**
     * 查询故障信息
     * @param param
     * @return
     */
    @RequestMapping(value = "/itdFaultInfoQry")
    public List<ITDFaultDto> itdFaultInfoQry(ITDFaultDto param){
        System.out.println(param.getEquipment_type());
        System.out.println(param.getFault_code());
        return itdFaultService.itdFaultInfoQry(param);
    }

    @RequestMapping(value="/loginLogQry")
    public List<ModbusLogDto> loginLogQry(ModbusLogDto param){
        return modbusService.loginLogQry(param);
    }

    @RequestMapping(value="/tempAndHumLogLogQry")
    public List<ModbusLogDto> tempAndHumLogLogQry(ModbusLogDto param){
        return modbusService.tempAndHumLogLogQry(param);
    }
}

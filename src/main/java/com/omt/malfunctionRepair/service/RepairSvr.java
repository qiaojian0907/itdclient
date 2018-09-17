package com.omt.malfunctionRepair.service;

import com.omt.common.dataBase.SqlE;
import com.omt.common.page.Result;
import com.omt.informationManagement.dto.equipmnetInfoDto;
import com.omt.malfunctionRepair.dto.*;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuxiao on 2018/6/13.
 */
@Repository
public class RepairSvr {
    private static final Logger logger = Logger.getLogger(RepairSvr.class);
    @Autowired
    protected SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    SqlE sqlE;

    /**
     * 新增报修单
     * @param param
     * @return
     */
    public int addRepairInfo(OmtInfRepairInfoDto param){
        return sqlE.insertM("addRepairInfo",param);
    }

    /**
     * 报修单待办
     * @param repairInfo
     * @return
     */
    public Result repairQuery(OmtInfRepairInfoDto repairInfo){
        return  sqlE.selectPage("repairQuery",repairInfo);
    }

    /**
     * 报修单待办
     * @param repairInfo
     * @return
     */
    public Result repairBacklogQuery(OmtInfRepairInfoDto repairInfo){
        return  sqlE.selectPage("repairBacklogQuery",repairInfo);
    }

    /**
     * 报修单完结查询
     * @param repairInfo
     * @return
     */
    public Result repairEndQuery(OmtInfRepairInfoDto repairInfo){
        return  sqlE.selectPage("repairEndQuery",repairInfo);
    }

    /**
     * 获取工单号
     * @param repairInfo
     * @return
     */
    public List getRepairNoByYear(OmtInfRepairInfoDto repairInfo){
        return sqlE.selectM("getRepairNoByYear",repairInfo);
    }

    /**
     * 查询处理人
     * @return
     */
    public List getDealPeople(){
        return sqlE.selectS("select login_no,login_name from omt_sys_login_info");
    }

    /**
     * 查询工单详细信息
     * @param repairInfo
     * @return
     */
    public List getRepairInfo(OmtInfRepairInfoDto repairInfo){
        return sqlE.selectM("repairInfoQry",repairInfo);
    }

    /**
     * 查询码表信息
     * @param code
     * @return
     */
    public List<OmtInfRepairCodeDto> qryCodeInfo(OmtInfRepairCodeDto code){
        return sqlE.selectM("qryCodeInfo",code);
    }

    /**
     * 更新报修单状态
     * @param repairInfo
     * @return
     */
    public int updateRepairInfo(OmtInfRepairInfoDto repairInfo){
        return sqlE.updateM("updateRepairInfo",repairInfo);
    }

    /**
     * 保存附件信息
     * @param attachInfo
     * @return
     */
    public int addRepairAttachInfo(OmtInfRepairAttachInfoDto attachInfo){
        return sqlE.insertM("addRepairAttachInfo",attachInfo);
    }

    /**
     * 查询附件信息
     * @param attachInfo
     * @return
     */
    public List<OmtInfRepairAttachInfoDto> qryAttachInfo(OmtInfRepairAttachInfoDto attachInfo){
        return sqlE.selectM("qryAttachInfo",attachInfo);
    }

    /**
     * 故障报修追踪
     * @param repairInfo
     * @return
     */
    public Result repairTraceQuery(OmtInfRepairInfoDto repairInfo){
        return  sqlE.selectPage("repairTraceQuery",repairInfo);
    }

    /**
     * 故障统计
     * @param info
     * @return
     */
    public List<RepairStatisticsDto> repairStatistics(OmtInfRepairInfoDto info){
        return sqlE.selectM("repairStatistics",info);
    }

    /**
     * 故障明细统计
     * @param info
     * @return
     */
    public List<RepairStatisticsDto> repairDetailStatistics(OmtInfRepairInfoDto info){
        return sqlE.selectM("repairDetailStatistics",info);
    }

    /**
     * 报修单设备信息查询
     * @param info
     * @return
     */
    public List repairOrder(equipmnetInfoDto info){
        return sqlE.selectM("repairOrder",info);
    }

    /**
     * 保存维修信息
     * @param param
     * @return
     */
    public int addMaintainInfo(OmtInfMaintainInfoDto param){
        return sqlE.insertM("addMaintainInfo",param);
    }

    /**
     * 获取维修信息
     * @param param
     * @return
     */
    public List getMaintainInfo(OmtInfMaintainInfoDto param){
        return sqlE.selectM("maintainInfoQry",param);
    }

    /**
     * 更新维修信息
     * @param param
     * @return
     */
    public int updateMaintainInfo(OmtInfMaintainInfoDto param){
        return sqlE.updateM("updateMaintainInfo",param);
    }
}

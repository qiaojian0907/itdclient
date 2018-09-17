package com.omt.informationManagement.service;

import com.omt.common.dataBase.SqlE;
import com.omt.common.page.Result;
import com.omt.informationManagement.dto.PanoramicInfomationDto;
import com.omt.informationManagement.dto.equipmnetInfoDto;
import com.omt.malfunctionRepair.dto.OmtInfRepairInfoDto;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zuoyue on 2018/7/4.
 */
@Repository
public class panoramicInfoMationService {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(panoramicInfoMationService.class);

    @Autowired
    SqlE sqlE;

    //全景信息----设备总量:统计收费站和该收费站车道的设备数量
    public List equipmentAllNum(equipmnetInfoDto param) {
        return sqlE.selectM("AllEquipmentNum", param);
    }


    //全景信息----收费站设备统计
    public List tollquery(equipmnetInfoDto param) {
        return sqlE.selectM("tollquery", param);
    }

    //全景信息----车道设备统计
    public List lanequery(equipmnetInfoDto param) {
        return sqlE.selectM("lanequery", param);
    }


    //维修流程信息查询
    public Result maiprocessInfo(OmtInfRepairInfoDto param) {
        return sqlE.selectPage("maiprocessInfo", param);
    }

    //全景信息----维修流程信息查询
    public List maiprocessInfoList(OmtInfRepairInfoDto param) {
        return sqlE.selectM("maiprocessInfo", param);
    }

    //全景信息----维修流程信息流程名称查询
    public List processName(OmtInfRepairInfoDto param) {
        return sqlE.selectM("processName", param);
    }

    //全景信息----设备告警统计分析
    public List alertCount(PanoramicInfomationDto param) {
        return sqlE.selectM("alertCount", param);
    }

    //全景信息----设备维修变化曲线图
    public List repairCount(OmtInfRepairInfoDto param) {
        return sqlE.selectM("repairCount", param);
    }

    //全景信息----告警信息
    public List tollalertInfo(equipmnetInfoDto param) {
        return sqlE.selectM("tollalertInfo", param);
    }

    //全景信息----车道设备统计
    public List lanealertInfo(equipmnetInfoDto param) {
        return sqlE.selectM("lanealertInfo", param);
    }

    //机历卡
    public List equipmenthis(PanoramicInfomationDto param) {
        return sqlE.selectM("equipmenthis", param);
    }

    //评论
    public List comment(PanoramicInfomationDto param) {
        return sqlE.selectM("comment", param);
    }
    //发布评论
    public int release(PanoramicInfomationDto param){
        return sqlE.insertM("release",param);
    }

}

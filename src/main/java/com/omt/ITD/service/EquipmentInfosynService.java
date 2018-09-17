package com.omt.ITD.service;

import com.omt.ITD.dto.EquipmentInfosynDto;
import com.omt.common.dataBase.SqlE;
import com.omt.informationManagement.dto.equipmnetInfoDto;
import com.omt.informationManagement.dto.laneEquipmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zuoyue on 2018/7/23.
 */
@Repository
public class EquipmentInfosynService {
    @Autowired
    SqlE sqlE;

    //车道网络设备查询
    public List netEquipmentQuery(equipmnetInfoDto param){
        return sqlE.selectM("netEquipmentQuery",param);
    }

    //更新网络设备ip
    public int insertiptoprocess(equipmnetInfoDto param){
        return  sqlE.updateM("insertiptoprocess",param);
    }

    //批量更新网络设备ip
    public int updateIP(equipmnetInfoDto param){
        return  sqlE.updateM("updateIP",param);
    }

    //收费站车道查询
    public List queryLane(laneEquipmentDto param){
        return sqlE.selectM("queryLane",param);
    }

    //故障设备统计分析
    public List errorequipment(EquipmentInfosynDto param){
        return sqlE.selectM("errorequipment",param);
    }

}

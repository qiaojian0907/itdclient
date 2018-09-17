package com.omt.informationManagement.service;

import com.omt.common.dataBase.SqlE;
import com.omt.informationManagement.dto.EquipmentDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zuopyue on 2018/8/24.
 */
@Repository
public class EquipmentDataService {
    @Autowired
    SqlE sqlE;


    //机房设备查询
    public List roomequipment(EquipmentDataDto param){
        return sqlE.selectM("roomequipment",param);
    }

    //设备数据查询
    public List itemAllInfo(EquipmentDataDto param){
        return sqlE.selectM("itemAllInfo",param);
    }

    //监控项状态查询
    public List itemStatus(EquipmentDataDto param){
        return sqlE.selectM("itemStatus",param);
    }


    //设备监控项数据查询
    public Map equipmentData(EquipmentDataDto param){
        Map map = new HashMap<>();
        List lisData =  sqlE.selectM("equipmentData",param);
        List listStatus = sqlE.selectM("itemStatus",param);
        map.put("item",lisData);
        map.put("itemstatus",listStatus);
        return map;
    }
}

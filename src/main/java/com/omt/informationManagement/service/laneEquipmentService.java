package com.omt.informationManagement.service;

import com.omt.common.dataBase.SqlE;
import com.omt.informationManagement.dto.laneEquipmentDto;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zuoyue on 2018/6/19.
 */
@Repository
public class laneEquipmentService {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(laneEquipmentService.class);
    @Autowired
    SqlE sqlE;

    //组织节点查询
    public List queryOrg(laneEquipmentDto param){
        return sqlE.selectM("queryOrg",param);
    }

    //组织节点查询
    public List queryLaneEquipment(laneEquipmentDto param){
        return sqlE.selectM("queryLaneEquipment",param);
    }

    //车道节点查询
    public List laneNodeQuery(laneEquipmentDto param){
        return sqlE.selectM("laneNodeQuery",param);
    }

    public List getLaneEquipmentNum(laneEquipmentDto param){
        log.info(param.getEquipment_address());
        return  sqlE.selectM("getEquipmentNum",param);
    }

    //组织节点查询
    public List queryLaneEquipmentByUse(laneEquipmentDto param){
        return sqlE.selectM("queryLaneEquipmentByUse",param);
    }

}

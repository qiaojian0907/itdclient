package com.omt.ITD.service;

import com.omt.ITD.dto.FaultLogDto;
import com.omt.common.dataBase.SqlE;
import com.omt.malfunctionRepair.service.RepairSvr;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FaultLogService {
    private static final Logger logger = Logger.getLogger(RepairSvr.class);
    @Autowired
    protected SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    SqlE sqlE;

    /**
     * 新增故障日志
     * @param param
     * @return
     */
    public int addFaultLogInfo(FaultLogDto param){
        return sqlE.insertM("addFaultLogInfo",param);
    }
    /**
     * 更新故障日志
     * @param param
     * @return
     */
    public int updateFaultLogInfo(FaultLogDto param){
        return sqlE.updateM("updateFaultlogInfo",param);
    }

    /**
     * 查询故障日志
     * @param param
     * @return
     */
    public List<FaultLogDto> qryFaultLogInfo(FaultLogDto param){
        return sqlE.selectM("faultLogInfoQry",param);
    }

}

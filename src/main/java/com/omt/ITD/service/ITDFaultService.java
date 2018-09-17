package com.omt.ITD.service;

import com.omt.ITD.dto.ITDFaultDto;
import com.omt.common.dataBase.SqlE;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ITDFaultService {
    private static final Logger logger = Logger.getLogger(ITDFaultService.class);
    @Autowired
    protected SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    SqlE sqlE;

    /**
     * 查询故障信息
     * @param param
     * @return
     */
    public List<ITDFaultDto> itdFaultInfoQry(ITDFaultDto param){
        return sqlE.selectM("itdFaultInfoQry",param);
    }

    /**
     * 获取故障名称
     * @param param
     * @return
     */
    public String getFaultName(ITDFaultDto param){
        List list =  sqlE.selectM("getFaultName",param);
        ITDFaultDto dto = (ITDFaultDto)list.get(0);
        return dto.getFault_name();
    }

}

package com.omt.modbus.service;

import com.omt.common.dataBase.SqlE;
import com.omt.modbus.dto.ModbusLogDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by QiaoJian on 2018/8/25.
 */
@Repository
public class ModbusService {
    private static Logger logger = Logger.getLogger(ModbusService.class);
    @Autowired
    SqlE sqlE;

    /**
     * 写入工号登录日志
     * @param dto
     * @return
     */
    public int addLoginLog(ModbusLogDto dto){
        return sqlE.insertM("addLoginLog",dto);
    }

    /**
     * 写入温湿日志
     * @param dto
     * @return
     */
    public int addTempAndHumLog(ModbusLogDto dto){
        return sqlE.insertM("addTempAndHumLog",dto);
    }

    /**
     * 更新工号退出时间
     * @param dto
     * @return
     */
    public int updateLoginLog(ModbusLogDto dto){
        return sqlE.updateM("updateLoginLog",dto);
    }

    /**
     * 查询登陆日志
     * @param dto
     * @return
     */
    public List<ModbusLogDto> loginLogQry(ModbusLogDto dto){
        return sqlE.selectM("loginLogQry",dto);
    }

    /**
     * 查询温湿日志
     * @param dto
     * @return
     */
    public List<ModbusLogDto> tempAndHumLogLogQry(ModbusLogDto dto){
        return sqlE.selectM("tempAndHumLogLogQry",dto);
    }
}

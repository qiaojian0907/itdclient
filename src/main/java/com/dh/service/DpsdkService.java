package com.dh.service;

import com.dh.dto.DpsdkAlarmDto;
import com.dh.dto.DpsdkAlarmTypeDto;
import com.dh.dto.DpsdkLoginDto;
import com.omt.common.dataBase.SqlE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by QiaoJian on 2018/10/11.
 */
@Repository
public class DpsdkService {
    @Autowired
    SqlE sqlE;

    /**
     * 获取大华平台登录信息
     * @return
     */
    public DpsdkLoginDto getDpsdkLoginInfo(){
        List list = sqlE.selectM("getDpsdkLoginInfo");
        DpsdkLoginDto dto = (DpsdkLoginDto)list.get(0);
        return dto;
    }

    /**
     * 获取报警类型
     * @return
     */
    public List<DpsdkAlarmTypeDto> getDpsdkAlarmType(){
        List<DpsdkAlarmTypeDto> list = sqlE.selectM("getDpsdkAlarmType");
        return list;
    }

    /**
     * 记录报警信息
     * @param dto
     * @return
     */
    public int addDpsdkAlarm(DpsdkAlarmDto dto){
        return sqlE.insertM("addDpsdkAlarm",dto);
    }

    /**
     * 查询报警日志
     * @param dto
     * @return
     */
    public List getDpsdkAlarmInfo(DpsdkAlarmDto dto){
        return sqlE.selectM("getDpsdkAlarmInfo",dto);
    }

    /**
     * 查询报警信息上报云平台
     * @param dto
     * @return
     */
    public List<DpsdkAlarmDto> queryAlarmInfoForSend(DpsdkAlarmDto dto){
        return sqlE.selectM("queryAlarmInfoForSend",dto);
    }

    /**
     * 更新报警数据状态
     * @return
     */
    public int updateAlarmInfoStatus(){
        return sqlE.updateM("updateAlarmInfoStatus");
    }
}

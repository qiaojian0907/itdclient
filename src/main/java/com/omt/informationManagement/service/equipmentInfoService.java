package com.omt.informationManagement.service;

import com.omt.common.dataBase.SqlE;
import com.omt.common.page.Result;
import com.omt.informationManagement.dto.equipmnetInfoDto;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.ReflectorFactory;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by zuoyue on 2018/6/4.
 */
@Repository
public class equipmentInfoService {
    private static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
    private static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
    private static final ReflectorFactory DEFAULT_REFLECTOR_WRAPPER_FACTORY = new DefaultReflectorFactory();

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(equipmentInfoService.class);
    @Autowired
    protected SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    SqlE sqlE;
    Result result = new Result();

    //设备信息查询
/*    public Result queryEquipmentInfo(equipmnetInfoDto equipmnetInfoDto ){
        Result result = new Result();
        MetaObject metaStatementHandler = MetaObject.forObject(equipmnetInfoDto, DEFAULT_OBJECT_FACTORY,
                DEFAULT_OBJECT_WRAPPER_FACTORY,DEFAULT_REFLECTOR_WRAPPER_FACTORY);
        PageParameter page = (PageParameter)metaStatementHandler.getValue("page");
        page.setFlag(true);

        List list1 = sqlE.selectM("queryEquipmentOrg",equipmnetInfoDto);
        List list = new ArrayList();
//        sqlE.selectPage("queryEquipmentInfo",equipmnetInfoDto);
        if(list1.size()!=0){
          for(int i=0;i<list1.size();i++) {
                log.info("-------------------list.get(i)------------------");
                log.info(list1.get(i));
                List list2=sqlSessionTemplate.selectList("queryEquipmentInfo",list1.get(i));
//                List  list2 =sqlE.selectM("queryEquipmentInfo", list1.get(i));
                list.addAll(list2);
                }
        }
        result.setData(list);
        //设置查询结果的总记录数
        if(page.getRecordsTotal()>0){
            result.setRecordsTotal(page.getRecordsTotal());
        }else {
            //第一次查询用rowBounds类的limit属性记录查询结果的总记录数
            result.setRecordsTotal(page.getRecordsTotal());
        }
        result.setRecordsFiltered(page.getRecordsTotal());

//        result.setData(list);
        log.info("-------------------result------------------");
        log.info(result);
        return result;
    }*/


    //导出设备信息
    public List exportEquipmentInfo(equipmnetInfoDto equipmnetInfoDto ){
        List list1 = sqlE.selectM("queryEquipmentOrg",equipmnetInfoDto);
        List list = new ArrayList();
        if(list1.size()!=0){
            for(int i=0;i<list1.size();i++) {
                log.info("-------------------list.get(i)------------------");
                log.info(list1.get(i));
                List list2=sqlSessionTemplate.selectList("queryEquipmentInfo",list1.get(i));
                list.addAll(list2);
            }
        }
        return list;
    }


    //资源列表查询
    public Result queryEquipmentInfo(equipmnetInfoDto equipmnetInfoDto){
        return  sqlE.selectPage("queryEquipmentInfo",equipmnetInfoDto);
    }


    //根据使用情况查询列表
    public Result queryEquipmentDetailList(equipmnetInfoDto equipmnetInfoDto){
        String  status_name = equipmnetInfoDto.getStatus_name();
        log.info("-++++++++++++++++++++++++++++++++++++++");
        log.info("status_name"+status_name+"equipment_name"+equipmnetInfoDto.getEquipment_name()+"equipment_model"+equipmnetInfoDto.getEquipment_model());
        //查询库存信息
        if (status_name.equals("库存") ){
            log.info(true);
            log.info(status_name);
            result = sqlE.selectPage("queryEquipmentStock",equipmnetInfoDto);
        }
        else {
            result = sqlE.selectPage("queryEquipmentDetailList",equipmnetInfoDto);
        }
        return  result;
    }

    public  List equipmentDetail(equipmnetInfoDto equipmnetInfoDto){
        return sqlE.selectM("equipmentDetail",equipmnetInfoDto);
    }


    //设备信息导入
    @Transactional(propagation= Propagation.REQUIRED)
    public int informationInsert(equipmnetInfoDto param){
        return sqlE.insertM("equipmentInsert",param);
    }


}

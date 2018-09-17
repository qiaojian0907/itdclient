package com.omt.systemManagement.service;

import com.omt.common.dataBase.SqlE;
import com.omt.common.jsTree.JSTreeDto;
import com.omt.common.jsTree.JSTreeNonOpenDto;
import com.omt.systemManagement.dto.OrgInfoDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangbl on 2018/6/7.
 */
@Repository
public class OrgService {
    private static Logger logger = Logger.getLogger(OrgService.class);
    @Autowired
    SqlE sqlE;
    public List<JSTreeNonOpenDto> getParentId(JSTreeDto obj){
        return sqlE.selectM("getParentId", obj);
    }
    public List<OrgInfoDto> getOrgInfoByParent(Object obj){
        return sqlE.selectM("getOrgInfoByParent", obj);
    }
    public List<JSTreeNonOpenDto> getOrgJSTree(JSTreeDto obj){
        //sqlE.selectM("selectOrgParentId", obj);
        return sqlE.selectM("selectOrgParentId", obj);
    }
    public List getOrgInfo(JSTreeDto obj){
        return sqlE.selectM("selectOrgInfoParentId", obj);
    }
    public int addOrg(OrgInfoDto obj){
        obj.setOrg_id(sqlE.selectM("getOrgid").get(0).toString());
        if(obj.getNote().equals("")){
            obj.setNote("  ");
        }
        if(obj.getSort_level().equals("")){
            obj.setSort_level("99");
        }
        obj.setLeaf("0");

        sqlE.insertM("addOrgInfo", obj);
        sqlE.insertM("insertOrgRel", obj);
        sqlE.insertM("updateOrgInfoLeaf", obj);
        return Integer.parseInt(obj.getOrg_id());
    }
    public boolean deleteOrgInfo(OrgInfoDto obj){
        sqlE.updateM("deleteOrgInfoAndOrgRel",obj);
        if((int)sqlE.selectM("getrelnum", obj).get(0)==1){
            obj.setLeaf("1");//1为true，2为false
            sqlE.selectM("updateOrgInfoLeaf", obj);
        }
        return true;
    }
    public boolean updateOrgInfo(OrgInfoDto obj){
        sqlE.updateM("updateOrgInfo",obj);
        return true;
    }
    public String getOrgInfoParentId(JSTreeDto obj){
        List list=sqlE.selectM("getOrgInfoParentId",obj);
        OrgInfoDto orgInfoDto=new OrgInfoDto();
        String parent_id="";
        Map map=new HashMap();

        for(int i=0;i<list.size();i++){
            orgInfoDto=(OrgInfoDto)list.get(i);
            if((i+1)==list.size()){
                map.put(orgInfoDto.getDparent_id(),orgInfoDto.getOrg_name()+"\r\n"+map.get(orgInfoDto.getDparent_id()));
            }else{
                if(parent_id.equals(orgInfoDto.getDparent_id())){
                    if((map.get(orgInfoDto.getOrg_id())==null)){
                        map.put(parent_id, map.get(parent_id)+orgInfoDto.getOrg_name()+"\r\n");
                        System.out.println(i+"--父节点相等--"+map.get(parent_id));
                    }else{
                        map.put(parent_id, map.get(parent_id)+orgInfoDto.getOrg_name()+"\r\n"+map.get(orgInfoDto.getOrg_id()));
                        System.out.println(i+"--父节点相等--"+map.get(parent_id));
                    }
                }else{
                    if((map.get(orgInfoDto.getOrg_id())==null)&&(map.get(orgInfoDto.getDparent_id())==null)){
                        parent_id=orgInfoDto.getDparent_id();
                        map.put(orgInfoDto.getDparent_id(), orgInfoDto.getOrg_name()+"\r\n");
                        System.out.println(i+"--新建父节点--"+map.get(orgInfoDto.getDparent_id()));
                    }else{
                        if(map.get(orgInfoDto.getDparent_id())==null){
                            map.put(orgInfoDto.getDparent_id(), orgInfoDto.getOrg_name()+"\r\n"+map.get(orgInfoDto.getOrg_id()));
                            System.out.println(i+"--新建向父节点下追加--"+map.get(orgInfoDto.getDparent_id()));
                        }else{
                            if(map.get(orgInfoDto.getOrg_id())==null){
                                map.put(orgInfoDto.getDparent_id(),map.get(orgInfoDto.getDparent_id()) +orgInfoDto.getOrg_name()+"\r\n");
                                System.out.println(i+"--向父节点下追加--"+map.get(orgInfoDto.getDparent_id()));
                            }else{
                                map.put(orgInfoDto.getDparent_id(),map.get(orgInfoDto.getDparent_id()) +orgInfoDto.getOrg_name()+"\r\n"+map.get(orgInfoDto.getOrg_id()));
                                System.out.println(i+"--向父节点下追加--"+map.get(orgInfoDto.getDparent_id()));
                            }
                        }
                    }

                }
            }
            if((i+1)==list.size()){
                System.out.println("最终结果=\r\n"+map.get(orgInfoDto.getDparent_id()));
            }
        }
        return "";
    }
}

package com.omt.systemManagement.controller;

import com.omt.common.jsTree.JSTreeDto;
import com.omt.common.jsTree.JSTreeNonOpenDto;
import com.omt.common.jsTree.State;
import com.omt.systemManagement.dto.OrgInfoDto;
import com.omt.systemManagement.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangbl on 2018/6/7.
 */
@RestController
public class OrgController {
    @Autowired
    OrgService orgService;

    //同时展开所有tree节点
    @RequestMapping(value = "/getOrgInfoTree")
    public List<JSTreeNonOpenDto> getOrgInfoTree(JSTreeDto jstreedto, boolean flag) {
        List list;
        if (flag) {
            JSTreeNonOpenDto temp;
            List listorg = orgService.getParentId(jstreedto);
            if (listorg.size() == 0) {
                temp = new JSTreeNonOpenDto();
                temp.setId("0");
                temp.setText("顶级节点");
            } else {
                temp = (JSTreeNonOpenDto) listorg.get(0);
            }
            temp.setState(new State(true));
            list = new ArrayList();
            list.add(temp);
        } else {
            list = orgService.getOrgJSTree(jstreedto);
        }
        return list;
    }

    //查询组织信息列表展现
    @RequestMapping(value = "/getOrgInfo")
    public List getOrgInfo(JSTreeDto jstreedto) {
        return orgService.getOrgInfo(jstreedto);
    }

    //添加组织信息
    @RequestMapping(value = "/addOrg")
    public int addOrg(OrgInfoDto obj) {
        return orgService.addOrg(obj);
    }

    //删除组织信息
    @RequestMapping(value = "/deleteOrg")
    public boolean deleteOrg(OrgInfoDto obj) {
        return orgService.deleteOrgInfo(obj);
    }

    //更新组织信息
    @RequestMapping(value = "/updateOrg")
    public boolean updateOrg(OrgInfoDto obj) {
        return orgService.updateOrgInfo(obj);
    }

    //更新组织信息
    @RequestMapping(value = "/getOrgInfoByParent")
    public List getOrgInfoByParent(String org_id) {
        return orgService.getOrgInfoByParent(org_id);
    }

    //测试组织信息格式化打印
    @RequestMapping(value = "/getInfo")
    public String getInfo(JSTreeDto obj) {
        return orgService.getOrgInfoParentId(obj);
    }
}

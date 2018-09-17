package com.omt.pub;


import com.omt.systemManagement.dto.LoginInfoDto;
import com.omt.systemManagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by wangbl on 2018/5/18.
 */
@Controller
public class MenuController {
    @Autowired
    LoginService loginService;
    //工作台跳转
    @RequestMapping(value = "wkh")
    public String wkh(HttpServletRequest request, HttpSession session) {
        SecurityContextImpl securityContextImpl = (SecurityContextImpl) request
                .getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        // 登录名
        System.out.println("Username:"
                +securityContextImpl.getAuthentication().getName());
        LoginInfoDto param=new LoginInfoDto();
        param.setLogin_no(securityContextImpl.getAuthentication().getName());
        String returnStr="";

        List list=loginService.selectLoginInfoByLoginNo(param);
        LoginInfoDto loginInfoDto=(LoginInfoDto)list.get(0);
        //model.addAttribute("login_name", loginInfoDto.getLogin_name());
        session.setAttribute("login_id",loginInfoDto.getLogin_id());
        session.setAttribute("login_no",loginInfoDto.getLogin_no());
        // session.setAttribute("si_id",loginInfoDto.getSi_id());
        session.setAttribute("login_name",loginInfoDto.getLogin_name());
        /*session.setAttribute("login_type",loginInfoDto.getLogin_type());
        System.out.println("login_name:"+loginInfoDto.getLogin_name());
        Map userMap=new HashMap();
        session.setAttribute("userMap",userMap);*/
        String funcMenu=loginService.getFuncUid(param);
        System.out.println("funcMenu="+funcMenu);
        session.setAttribute("funcMenu", funcMenu);
        returnStr = "ITD/ITDTolls";
        /*if(loginInfoDto.getLogin_type().equals("2")){
            returnStr="studentManagement/myScore";
        }else if(loginInfoDto.getLogin_type().equals("0")){
            returnStr="systemManagement/gradeMG";
        }else if(loginInfoDto.getLogin_type().equals("1")) {
            returnStr = "assistantManagement/experimentScore";
        }*/
        return returnStr;
    }
    //全景信息 by wangbl
    @RequestMapping(value = "pin")
    public String pin() {
        return "informationManagement/panoramicInformation";
    }
    //综合查询 by wangbl
    @RequestMapping(value = "iqy")
    public String iqy() {
        return "informationManagement/integratedQuery";
    }
    //功能管理 by wangbl
    @RequestMapping(value = "fun")
    public String fun() {
        return "systemManagement/funcInfo";
    }
    //角色管理 by wangbl
    @RequestMapping(value = "rol")
    public String rol() {
        return "systemManagement/roleInfo";
    }
    //组织节点管理
    @RequestMapping(value = "org")
    public String org() {
        return "systemManagement/orgInfo";
    }
    //工号管理
    @RequestMapping(value = "lgn")
    public String loginmg() {
        return "systemManagement/loginInfo";
    }
    //资产信息导入 by zuoyue
    @RequestMapping(value = "iit")
    public String iit() {
        return "informationManagement/informationImport";
    }
    //车道设备 by zuoyue
    @RequestMapping(value = "lane")
    public String lane() {
        return "informationManagement/lane";
    }
    //维保信息查询 by zuoyue
    @RequestMapping(value = "miq")
    public String miq() {
        return "maintenance/maintenanceInfQuery";
    }

    //维保信息录入 by zuoyue
    @RequestMapping(value = "mie")
    public String mie(){
        return "maintenance/maintenanceInfEntry";
    }

    //车道节点图形展示 by zuoyue
    @RequestMapping(value = "lnd")
    public String lnd(){ return "informationManagement/laneNode"; }

    //   测试
    @RequestMapping(value = "test")
    public String test(){

        return "test";
    }



    //车道树形展示 by zuoyue
    @RequestMapping(value = "lcn")
    public String lcn(Model model,String org_name,String org_code,String num) {
        model.addAttribute("org_name", org_name);
        model.addAttribute("org_code", org_code);
        model.addAttribute("num", num);
        return "informationManagement/laneChildNode";
    }

    //资产信息盘点 by zuoyue
    @RequestMapping(value = "ait")
    public String lcn() {
        return "inventoryManagement/assetInfoInventory";
    }

    //考勤管理 by zuoyue
    @RequestMapping(value = "atm")
    public String atm() {
        return "OA/attendanceManagement/attendanceManagement";
    }

    //考核管理 by zuoyue
    @RequestMapping(value = "asm")
    public String asm() {
        return "OA/AssessmentManagement/assessmentManagement";
    }

    //计划管理 by zuoyue
    @RequestMapping(value = "plan")
    public String tla() {
        return "OA/planManagement/plan";
    }

    //邮件内容 by zuoyue
    @RequestMapping(value = "mail")
    public String mail() {
        return "OA/planManagement/read-mail";
    }

    //ITD by zuoyue
    @RequestMapping(value = "ITDm")
    public String ITDm() {
        return "ITD/ITDmain";
    }

    //设备安装管理 by zuoyue
    @RequestMapping(value = "eit")
    public String eit() {
        return "equipmentInstallation/equipmentInstallation";
    }

    //设备安装管理 by zuoyue
    @RequestMapping(value = "mhp")
    public String mhp() {
        return "main/monitoringHomePage";
    }

    //设备生命周期展示 by zuoyue
    @RequestMapping(value = "lce")
    public String lce() {
        return "informationManagement/lifeCycle";
    }


    //新建故障报修 by liuxiao
    @RequestMapping(value = "amr")
    public String amr(Model model,String id) {
        model.addAttribute("id",id);
        return "malfunctionRepair/addMalfunctionRepair";
    }
    //故障报修办结查询 by liuxiao
    @RequestMapping(value = "req")
    public String req() {
        return "malfunctionRepair/repairEndQuery";
    }
    //故障报修待办 by liuxiao
    @RequestMapping(value = "rbq")
    public String rbq() {
        return "malfunctionRepair/repairBacklogQuery";
    }
    //故障报修记录表 by liuxiao
    @RequestMapping(value = "rqy")
    public String rqy() {
        return "malfunctionRepair/repairQuery";
    }
    //故障报修跟踪表 by liuxiao
    @RequestMapping(value = "rtq")
    public String rtq() {
        return "malfunctionRepair/repairTraceTableQuery";
    }
    //故障报修处理情况统计 by liuxiao
    @RequestMapping(value = "rds")
    public String rds() {
        return "malfunctionRepair/repairDealStatistics";
    }
    //故障报修处明细统计 by liuxiao
    @RequestMapping(value = "rdts")
    public String rdts() {
        return "malfunctionRepair/repairDetailStatistics";

    }
    @RequestMapping(value = "crt1")
    public String crt1() {
        return "OA/create1";

    }
    @RequestMapping(value = "rpc")
    public String rbc() {
        return "OA/reimburseProcCreate";

    }
    @RequestMapping(value = "pct")
    public String pct() {
        return "OA/procCreate";

    }
    @RequestMapping(value = "amg")
    public String amg() {
        return "OA/announcementManage";

    }
    @RequestMapping(value = "tpc")
    public String tpc() {
        return "OA/travelProcCreate";

    }
    @RequestMapping(value = "lpc")
    public String lpc() {
        return "OA/leaveProcCreate";

    }
    @RequestMapping(value = "pbl")
    public String pbl() {
        return "OA/procBacklog";

    }
    @RequestMapping(value = "rba")
    public String rba() {
        return "OA/reimburseApprove";

    }
    @RequestMapping(value = "mpc")
    public String mpc() {
        return "OA/myProc";
    }
    @RequestMapping(value = "ptk")
    public String ptk() {
        return "OA/procTrack";
    }
    @RequestMapping(value = "ant")
    public String ant() {
        return "OA/addNotice";
    }
    @RequestMapping(value = "itds")
    public String itds(Model model,boolean flag) {
        model.addAttribute("flag",flag);
        return "ITD/itdShow";
    }

    @RequestMapping(value = "acm")
    public String acm() {
        return "ITD/accountManagement";
    }

    @RequestMapping(value = "flg")
    public String flg() {
        return "ITD/logManagement/faultLog";
    }

    @RequestMapping(value = "mlg")
    public String mlg() {
        return "ITD/logManagement/maintenanceLog";
    }

    @RequestMapping(value = "plg")
    public String plg() {
        return "ITD/logManagement/personnelLog";
    }

    @RequestMapping(value = "thlg")
    public String thlg() {
        return "ITD/logManagement/temperatureAndHumidityLog";
    }

    @RequestMapping(value = "vlg")
    public String vlg() {
        return "ITD/logManagement/vehicleLog";
    }

    @RequestMapping(value = "fap")
    public String fap(Model model,String rn,String pi,String ti,String ai) {
        model.addAttribute("rn",rn);
        model.addAttribute("pi",pi);
        model.addAttribute("ti",ti);
        model.addAttribute("ai",ai);
        return "malfunctionRepair/failureApprove";
    }

    @RequestMapping(value = "fap1")
    public String fap1(Model model,String rn,String pi,String ti,String ai) {
        model.addAttribute("rn",rn);
        model.addAttribute("pi",pi);
        model.addAttribute("ti",ti);
        model.addAttribute("ai",ai);
        return "malfunctionRepair/failureApprove1";
    }
    @RequestMapping(value = "fap2")
    public String fap2(Model model,String rn,String pi,String ti,String ai) {
        model.addAttribute("rn",rn);
        model.addAttribute("pi",pi);
        model.addAttribute("ti",ti);
        model.addAttribute("ai",ai);
        return "malfunctionRepair/failureApprove2";
    }
    @RequestMapping(value = "fap3")
    public String fap3(Model model,String rn,String pi,String ti,String ai) {
        model.addAttribute("rn",rn);
        model.addAttribute("pi",pi);
        model.addAttribute("ti",ti);
        model.addAttribute("ai",ai);
        return "malfunctionRepair/failureApprove3";
    }
    @RequestMapping(value = "fap4")
    public String fap4(Model model,String rn,String pi,String ti,String ai) {
        model.addAttribute("rn",rn);
        model.addAttribute("pi",pi);
        model.addAttribute("ti",ti);
        model.addAttribute("ai",ai);
        return "malfunctionRepair/failureApprove4";
    }

    @RequestMapping(value = "crm")
    public String crm() {
        return "main/computerRoomMain";
    }


    //栏杆机
    @RequestMapping(value = "rmc")
    public String rmc(Model model,String StatusRailing) {
        model.addAttribute("StatusRailing",StatusRailing);
        return "ITD/railingMachine";
    }
    //雨棚灯
    @RequestMapping(value = "cpl")
    public String cpl(Model model,String StatusCanopy) {
        model.addAttribute("StatusCanopy",StatusCanopy);
        return "ITD/canopylight";
    }
    //通行灯
    @RequestMapping(value = "psl")
    public String psl(Model model,String StatusPassage) {
        model.addAttribute("StatusPassage",StatusPassage);
        return "ITD/passagelight";
    }
    //温控
    @RequestMapping(value = "ttc")
    public String ttc(Model model,String StatusTemperature) {
        model.addAttribute("StatusTemperature",StatusTemperature);
        return "ITD/temperaturCcontrol";
    }
    //环境
    @RequestMapping(value = "srd")
    public String srd(Model model,String StatusSurroundings) {
        model.addAttribute("StatusSurroundings",StatusSurroundings);
        return "ITD/surroundings";
    }
    //设置
    @RequestMapping(value = "set")
    public String set(Model model,String StatusSetting) {
        model.addAttribute("StatusSetting",StatusSetting);
        return "ITD/setting";
    }
    //日志
    @RequestMapping(value = "lgp")
    public String lgp(Model model,String StatusLog) {
        model.addAttribute("StatusLog",StatusLog);
        return "ITD/logpage";
    }

    //DO
    @RequestMapping(value = "dop")
    public String dop(Model model,String StatusDO) {
        model.addAttribute("StatusDO",StatusDO);
        return "ITD/DOpage";
    }
    //DI
    @RequestMapping(value = "dip")
    public String dip(Model model,String StatusDI) {
        model.addAttribute("StatusDI",StatusDI);
        return "ITD/DIpage";
    }
    //lan
    @RequestMapping(value = "lap")
    public String lap(Model model,String Statuslan) {
        model.addAttribute("Statuslan",Statuslan);
        return "ITD/lanpage";
    }

    @RequestMapping(value = "aaa")
    public String aaa() {
        return "main/aaa";
    }

    //itd报修发起 by liuxiao
    @RequestMapping(value = "itdamr")
    public String itdamr(Model model,String id,String faultName,String faultEquipment,String problemDescription) {
        model.addAttribute("id",id);
        model.addAttribute("faultName",faultName);
        model.addAttribute("faultEquipment",faultEquipment);
        model.addAttribute("problemDescription",problemDescription);
        return "ITD/malfunctionRepair/addMalfunctionRepair";
    }

    //itd报修接单列表 by liuxiao
    @RequestMapping(value = "itdrbq")
    public String itdrbq() {
        return "ITD/malfunctionRepair/repairBacklogQuery";
    }

    //itd报修接单
    @RequestMapping(value = "itdfap")
    public String itdfap(Model model,String id) {
        model.addAttribute("id",id);
        return "ITD/malfunctionRepair/failureApprove";
    }

    //itd报修接单
    @RequestMapping(value = "idtt")
    public String itdfap() {
        return "ITD/itdtab";
    }

    //itd收费站首页 by liuxiao
    @RequestMapping(value = "itdtolls")
    public String itdtolls() {
        return "ITD/ITDTolls";
    }

    //itd收费站页面 by liuxiao
    @RequestMapping(value = "itdtoll")
    public String itdtoll() {
        return "ITD/ITDToll";
    }
    //itd故障日志列表 by liuxiao
    @RequestMapping(value = "fll")
    public String itdfll() {
        return "ITD/malfunctionRepair/faultLogList";
    }

    //设备数据状态 by zuoyue
    @RequestMapping(value = "pcp")
    public String pcp() {
        return "main/pcPage";
    }
}

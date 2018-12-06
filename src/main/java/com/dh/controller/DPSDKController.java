package com.dh.controller;

import com.dh.DpsdkCore.*;
import com.dh.dto.DpsdkAlarmDto;
import com.dh.dto.DpsdkAlarmTypeDto;
import com.dh.dto.DpsdkLoginDto;
import com.dh.service.DpsdkService;
import com.omt.Rest.tool.JsonResult;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.dom4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.*;

/**
 * Created by QiaoJian on 2018/10/16.
 */
@Component
public class DPSDKController {

    @Autowired
    DpsdkService dpsdkService;

    @Autowired
    RestTemplate restTemplate;

    public int 	    m_nDLLHandle    = -1;
    public IDpsdkCore dpsdk = new IDpsdkCore();

    DPSDKAlarmCallback m_AlarmCB = new DPSDKAlarmCallback();
    Return_Value_Info_t nGroupLen = new Return_Value_Info_t();
    public static String StrCarNum;


    public fDPSDKDevStatusCallback fDeviceStatus = new fDPSDKDevStatusCallback() {
        @Override
        public void invoke(int nPDLLHandle, byte[] szDeviceId, int nStatus) {
            String status = "离线";
            if(nStatus == 1)
            {
                status = "在线";
                Device_Info_Ex_t deviceInfo = new Device_Info_Ex_t();
                int nRet = IDpsdkCore.DPSDK_GetDeviceInfoExById(m_nDLLHandle, szDeviceId, deviceInfo);
                if(deviceInfo.nDevType == dpsdk_dev_type_e.DEV_TYPE_NVR || deviceInfo.nDevType == dpsdk_dev_type_e.DEV_TYPE_EVS || deviceInfo.nDevType == dpsdk_dev_type_e.DEV_TYPE_SMART_NVR || deviceInfo.nDevType == dpsdk_dev_type_e.DEV_MATRIX_NVR6000)
                {
                    nRet = IDpsdkCore.DPSDK_QueryNVRChnlStatus(m_nDLLHandle, szDeviceId, 10*1000);

                    if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
                    {
                        //System.out.printf("查询NVR通道状态成功，deviceID = %s", new String(szDeviceId));
                    }else
                    {
                        System.out.printf("查询NVR通道状态失败，deviceID = %s, nRet = %d", new String(szDeviceId), nRet);
                    }
                    //System.out.println();
                }
            }
        }
    };

    public fDPSDKNVRChnlStatusCallback fNVRChnlStatus = new fDPSDKNVRChnlStatusCallback() {
        @Override
        public void invoke(int nPDLLHandle, byte[] szCameraId, int nStatus) {
            String status = "离线";
            if(nStatus == 1)
            {
                status = "在线";
            }
        }
    };

    public fDPSDKGeneralJsonTransportCallback fGeneralJson = new fDPSDKGeneralJsonTransportCallback() {
        @Override
        public void invoke(int nPDLLHandle, byte[] szJson) {
            System.out.printf("General Json Return, ReturnJson = %s", new String(szJson));
            System.out.println();
        }
    };
    //卡口过车数据回调
    public fDPSDKGetBayCarInfoCallbackEx fBayCarInfo = new fDPSDKGetBayCarInfoCallbackEx() {
        @Override
        public void invoke(int nPDLLHandle, byte[] szDeviceId, int nDeviceIdLen, int nDevChnId, byte[] szChannelId, int nChannelIdLen, byte[] szDeviceName, int	nDeviceNameLen, byte[] szDeviceChnName, int	nChanNameLen, byte[] szCarNum, int nCarNumLen, int	nCarNumType, int nCarNumColor, int nCarSpeed,int nCarType, int	nCarColor, int	nCarLen, int	nCarDirect, int	nWayId, long lCaptureTime, long lPicGroupStoreID, int nIsNeedStore, int nIsStoraged, byte[] szCaptureOrg, int nCaptureOrgLen, byte[] szOptOrg, int nOptOrgLen, byte[] szOptUser, int nOptUserLen, byte[] szOptNote, int nOptNoteLen, byte[] szImg0Path, int nImg0PathLen, byte[] szImg1Path, int nImg1PathLen, byte[] szImg2Path, int nImg2PathLen, byte[] szImg3Path, int nImg3PathLen, byte[] szImg4Path, int nImg4PathLen, byte[] szImg5Path, int nImg5PathLen, byte[] szImgPlatePath, int nImgPlatePathLen, int icarLog, int iPlateLeft, int iPlateRight, int iPlateTop, int iPlateBottom) {
            try {
                StrCarNum = new String(szCarNum, "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.printf("Bay Car Info Report, DeviceId=%s, szChannelId=%s, szDeviceChnName=%s, szCarNum=%s, szImg0Path=%s", new String(szDeviceId), new String(szChannelId), new String(szDeviceChnName), StrCarNum, new String(szImg0Path));
            System.out.println();
        }
    };

    //违章报警回调
    public fDPSDKTrafficAlarmCallback fTrafficAlarmCallback = new fDPSDKTrafficAlarmCallback() {
        @Override
        public void invoke(int nPDLLHandle, Traffic_Alarm_Info_t trafficAlarmInfo) {
            try {
                StrCarNum = new String(trafficAlarmInfo.szCarNum, "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.printf("TrafficAlarm Car Info Report, DeviceId=%s, szChannelId=%s, szDeviceChnName=%s, szCarNum=%s, szImg0Path=%s", new String(trafficAlarmInfo.szDeviceId).trim(), new String(trafficAlarmInfo.szCameraId).trim(), new String(trafficAlarmInfo.szDeviceName).trim(), StrCarNum.trim(), new String(trafficAlarmInfo.szPicUrl0).trim());
            System.out.println();
        }
    };

    //区间测速回调
    public fDPSDKGetAreaSpeedDetectCallback fGetAreaSpeedDetectCallback = new fDPSDKGetAreaSpeedDetectCallback() {
        @Override
        public void invoke(int nPDLLHandle, Area_Detect_Info_t areaSpeedDetectInfo) {
            try {
                StrCarNum = new String(areaSpeedDetectInfo.szCarNum, "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.printf("AreaSpeedDetectInfo Report, szCarNum=%s, szPicName0=%s", StrCarNum.trim(), new String(areaSpeedDetectInfo.szPicName0).trim());
            System.out.println();
        }
    };

    public int createSDK(){
        Return_Value_Info_t res = new Return_Value_Info_t();
        int nRet = dpsdk.DPSDK_Create(dpsdk_sdk_type_e.DPSDK_CORE_SDK_SERVER,res);
        m_nDLLHandle = res.nReturnValue;
        System.out.print("DPSDK_Create, m_nDLLHandle = ");
        System.out.println(m_nDLLHandle);
        if(m_nDLLHandle > 0)
        {
            //设置设备状态上报监听函数
            nRet = IDpsdkCore.DPSDK_SetDPSDKDeviceStatusCallback(m_nDLLHandle, fDeviceStatus);
            //设置NVR通道状态上报监听函数
            nRet =IDpsdkCore.DPSDK_SetDPSDKNVRChnlStatusCallback(m_nDLLHandle, fNVRChnlStatus);
            //设置通用JSON回调
            nRet = IDpsdkCore.DPSDK_SetGeneralJsonTransportCallback(m_nDLLHandle, fGeneralJson);

            nRet = IDpsdkCore.DPSDK_SetDPSDKGetBayCarInfoCallbackEx(m_nDLLHandle, fBayCarInfo);

            nRet = IDpsdkCore.DPSDK_SetDPSDKTrafficAlarmCallback(m_nDLLHandle, fTrafficAlarmCallback);

            nRet = IDpsdkCore.DPSDK_SetDPSDKGetAreaSpeedDetectCallback(m_nDLLHandle, fGetAreaSpeedDetectCallback);
        }

        return m_nDLLHandle;
    }

    public String OnLogin(){

        //获取登录信息
        DpsdkLoginDto dto = dpsdkService.getDpsdkLoginInfo();

        Login_Info_t loginInfo = new Login_Info_t();
        loginInfo.szIp = dto.getM_strIp().getBytes();
        loginInfo.nPort = Integer.valueOf(dto.getM_nPort());
        loginInfo.szUsername = dto.getM_strUser().getBytes();
        loginInfo.szPassword = dto.getM_strPassword().getBytes();
        loginInfo.nProtocol = dpsdk_protocol_version_e.DPSDK_PROTOCOL_VERSION_II;
        loginInfo.iType = 1;

        int nRet = IDpsdkCore.DPSDK_Login(m_nDLLHandle,loginInfo,10000);
        if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
        {
            System.out.printf("登录成功，nRet = %d", nRet);
            return dto.getM_strIp();
        }else
        {
            System.out.printf("登录失败，nRet = %d", nRet);
            return "";
        }
    }

    /*
     * 加载所有组织树
     * */
    public void LoadAllGroup()
    {
        int nRet = IDpsdkCore.DPSDK_LoadDGroupInfo(m_nDLLHandle, nGroupLen, 180000 );

        if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
        {
            System.out.printf("加载所有组织树成功，nRet = %d， nDepCount = %d", nRet, nGroupLen.nReturnValue);
        }else
        {
            System.out.printf("加载所有组织树失败，nRet = %d", nRet);
        }
        System.out.println();
    }

    /*
     * 获取所有组织树串
     * */
    public String GetGroupStr()
    {
        String str = "";
        byte[] szGroupBuf = new byte[nGroupLen.nReturnValue];
        int nRet = IDpsdkCore.DPSDK_GetDGroupStr(m_nDLLHandle, szGroupBuf, nGroupLen.nReturnValue, 10000);

        if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
        {
            String GroupBuf = "";
            try {
                str = new String(szGroupBuf, "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            //System.out.printf("获取所有组织树串成功，nRet = %d， szGroupBuf = [%s]", nRet, GroupBuf);
            /*try {
                File file = new File("D:\\text.xml");
                if(!file.exists())
                {
                    file.createNewFile();
                }

                FileOutputStream  out = new FileOutputStream(file);
                out.write(szGroupBuf);
                out.close();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }*/
        }else
        {
            System.out.printf("获取所有组织树串失败，nRet = %d", nRet);
        }
        System.out.println();
        return str;
    }

    /*
     * 获取用户组织信息
     * */
    public void GetUserOrgInfo()
    {
        GetUserOrgInfo userOrgInfo = new GetUserOrgInfo();
        int nRet = IDpsdkCore.DPSDK_GetUserOrgInfo(m_nDLLHandle, userOrgInfo, 10000 );

        if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
        {
            System.out.printf("获取用户组织信息成功，nRet = %d， UserOrgInfo = %s", nRet, userOrgInfo.strUserOrgInfo);
        }else
        {
            System.out.printf("获取用户组织信息失败，nRet = %d", nRet);
        }
        System.out.println();
    }



    /*
     * 加载组织树
     * */
    public void LoadGroup()
    {
        String strCoding="001";
        Load_Dep_Info_t depInfo = new Load_Dep_Info_t();
        depInfo.nOperation = dpsdk_getgroup_operation_e.DPSDK_CORE_GEN_GETGROUP_OPERATION_CHILD;
        depInfo.szCoding=strCoding.getBytes();
        Return_Value_Info_t nLen = new Return_Value_Info_t();
        int nRet = IDpsdkCore.DPSDK_LoadDGroupInfoLayered(m_nDLLHandle,depInfo,nLen,10000);

        if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
        {
            System.out.printf("加载组织树成功，nRet = %d， nGroupLen = %d", nRet,nLen.nReturnValue);
        }else
        {
            System.out.printf("加载组织树失败，nRet = %d", nRet);
        }
        System.out.println();

        Get_Dep_Count_Info_t depCountInfo = new Get_Dep_Count_Info_t();
        depCountInfo.szCoding=strCoding.getBytes();
        nRet = IDpsdkCore.DPSDK_GetDGroupCount(m_nDLLHandle,depCountInfo);
        if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
        {
            System.out.printf("获取子组织子设备个数成功，nRet = %d， nDepCount = %d, nDeviceCount= %d", nRet,depCountInfo.nDepCount,depCountInfo.nDeviceCount);
        }else
        {
            System.out.printf("获取子组织子设备失败，nRet = %d", nRet);
        }
        System.out.println();

    }

    /*
     * 报警布控
     * */
    public void SetAlarm()
    {
        int nRet = IDpsdkCore.DPSDK_SetDPSDKAlarmCallback(m_nDLLHandle,m_AlarmCB);//设置报警监听函数
        if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
        {
            System.out.printf("开启报警监听成功，nRet = %d", nRet);
        }else
        {
            System.out.printf("开启报警监听失败，nRet = %d", nRet);
        }
        System.out.println();
    }

    /*
     * 报警查询
     * */
    public void OnQueryAlarm(String channelId,String alarmType,String ip){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        /*Date tmStart = calendar.getTime();
        Date tmEnd = new Date();*/
        Date tmStart = new Date(2017-1900,10-1,28,0,0,0);
        Date tmEnd = new Date(2018-1900,12-1,30,23,59,59);
        Alarm_Query_Info_t stuQueryInfo = new Alarm_Query_Info_t();
        //stuQueryInfo.szCameraId = m_strQueryAlarmCamareID.getBytes();
        //stuQueryInfo.nAlarmType = dpsdk_alarm_type_e.DPSDK_CORE_ALARM_TYPE_DISK_FULL;
        stuQueryInfo.szCameraId = channelId.getBytes(); //通道ID
        stuQueryInfo.nAlarmType = Integer.valueOf(alarmType);   //报警类型
        stuQueryInfo.uStartTime = tmStart.getTime()/1000;//转换成秒 开始时间
        stuQueryInfo.uEndTime = tmEnd.getTime()/1000;    //结束时间


        //Return_Value_Info_t nCount = new Return_Value_Info_t();
        Alarm_Info_t stuAlarmInfo = new Alarm_Info_t(500);

        System.out.println("--------------开始查询报警信息----------");

        int nRet = IDpsdkCore.DPSDK_QueryAlarmInfo(m_nDLLHandle, stuQueryInfo, stuAlarmInfo, 0, 500,10000);

        if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS){
            System.out.printf("查询报警信息成功，nRet = %d， nCount= %d", nRet, stuAlarmInfo.nRetCount);
            for(int i=0;i<stuAlarmInfo.nRetCount;i++)
            {
                //System.out.println("第"+i+"次循环");
                Date dTime = new Date(stuAlarmInfo.pAlarmInfo[i].uAlarmTime * 1000);
                /*System.out.printf("序号=%d，类型 = %d，时间=%s，事件=%d，设备ID=%s，通道号=%d， 处理状态= %d", i+1,
                        stuAlarmInfo.pAlarmInfo[i].nAlarmType,dTime.toLocaleString(), stuAlarmInfo.pAlarmInfo[i].nEventType,
                        new String(stuAlarmInfo.pAlarmInfo[i].szDevId).trim(),stuAlarmInfo.pAlarmInfo[i].uChannel, stuAlarmInfo.pAlarmInfo[i].nDealWith);*/
                String alarm_type = String.valueOf(stuAlarmInfo.pAlarmInfo[i].nAlarmType);
                String alarm_date = dTime.toLocaleString();
                String alarm_event = String.valueOf(stuAlarmInfo.pAlarmInfo[i].nEventType);
                String devId = new String(stuAlarmInfo.pAlarmInfo[i].szDevId).trim();
                //String chanelId = String.valueOf(stuAlarmInfo.pAlarmInfo[i].uChannel);
                String chanelId = channelId;
                String dealWith = String.valueOf( stuAlarmInfo.pAlarmInfo[i].nDealWith);

                DpsdkAlarmDto dto =  new DpsdkAlarmDto();
                dto.setIp(ip);
                dto.setAlarm_date(alarm_date);
                dto.setAlarm_event(alarm_event);
                dto.setAlarm_type(alarm_type);
                dto.setChanelId(chanelId);
                dto.setDevId(devId);
                dto.setDealWith(dealWith);
                List list = dpsdkService.getDpsdkAlarmInfo(dto);
                if(list.size()==0){
                    dpsdkService.addDpsdkAlarm(dto);
                }
            }
        }else
        {
            System.out.printf("查询报警信息失败，nRet = %d", nRet);
        }
        System.out.println();
    }

    /*
     * 登出
     * */
    public void OnLogout()
    {
        int nRet = IDpsdkCore.DPSDK_Logout(m_nDLLHandle, 10000);
        if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
        {
            System.out.printf("登出成功，nRet = %d", nRet);
        }else
        {
            System.out.printf("登出失败，nRet = %d", nRet);
        }
        System.out.println();
    }

    /*
     * 释放内存
     * */
    public void OnDestroy()
    {
        int nRet = IDpsdkCore.DPSDK_Destroy(m_nDLLHandle);
        if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
        {
            System.out.printf("释放内存成功，nRet = %d", nRet);
        }else
        {
            System.out.printf("释放内存失败，nRet = %d", nRet);
        }
        System.out.println();
    }

    /**
     * 获取通道ID
     * @param xml
     */
    public List readStringXml(String xml) {
        List list = new ArrayList();
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(xml); // 将字符串转为XML
            Element rootElt = doc.getRootElement(); // 获取根节点
            //System.out.println("根节点：" + rootElt.getName()); // 拿到根节点的名称
            List<Element> elements = rootElt.elements();
            for (Iterator<Element> it = elements.iterator(); it.hasNext();) {
                Element element = it.next();
                if("Department".equals(element.getName())){
                    List<Element> elements1 = element.elements();
                    for(Iterator<Element> it1 = elements1.iterator();it1.hasNext();){
                        Element element1 = it1.next();
                        List<Element> elements2 = element1.elements();
                        for(Iterator<Element> it2 = elements2.iterator();it2.hasNext();){
                            Element element2 = it2.next();
                            if("Channel".equals(element2.getName())){
                                List<Attribute> attributes = element2.attributes();
                                for (int i = 0; i < attributes.size(); i++) {
                                    Attribute attribute = attributes.get(i);
                                    //System.out.println(attribute.getNamespace()+":"+attribute.getText());
                                    list.add(attribute.getText());
                                }
                            }
                        }
                    }
                }
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Scheduled(cron = "0 0/1 * * * *")
    public void DPSDKTask(){
        int ret = createSDK(); //初始化
        //OnLogin();//登陆
        if(ret > 0){
            String ip = OnLogin();
            if(!"".equals(ip)){
                LoadAllGroup();
                String groupStr = GetGroupStr();//获取组织结构串

                System.out.println("获取组织结构串"+groupStr);

                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                SetAlarm();//打开报警监听,加载组织结构后才能接收到报警信息
                List<DpsdkAlarmTypeDto> alarmList = dpsdkService.getDpsdkAlarmType();
                List groupList = readStringXml(groupStr);

                //JSONArray.fromObject(alarmList);

                for(int i = 0; i < groupList.size(); i++){
                    String channelId = (String)groupList.get(i);
                    for(int j = 0; j < alarmList.size(); j++){
                        DpsdkAlarmTypeDto dto = new DpsdkAlarmTypeDto();
                        dto = alarmList.get(j);
                        OnQueryAlarm(channelId,dto.getAlarm_value(),ip);//查询报警信息
                    }
                }
                sendAlarmInfo();
            }
        }

        OnLogout();
        OnDestroy();
    }


    public void sendAlarmInfo() {

        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());

        DpsdkAlarmDto dto = new DpsdkAlarmDto();
        List<DpsdkAlarmDto> list = dpsdkService.queryAlarmInfoForSend(dto);

        //上传增量数据
        if(list.size()>0){
            JSONArray json = JSONArray.fromObject(list);
            //JSONObject json = JSONObject.fromObject(list);
            System.out.println(json.toString());
            HttpEntity<String> formEntity = new HttpEntity<>(json.toString(), headers);
            JsonResult result = restTemplate.postForObject("http://192.168.31.68:8080/DpsdkAlarmData",formEntity,JsonResult.class);
            if("0000".equals(result.getCode())){
                dpsdkService.updateAlarmInfoStatus();
            }else{
                sendAlarmInfo();
            }
        }

    }
}

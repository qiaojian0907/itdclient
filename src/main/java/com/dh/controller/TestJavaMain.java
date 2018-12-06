package com.dh.controller;

import com.dh.DpsdkCore.*;
import com.dh.DpsdkCore.TvWall.TvWall_Task_Info_List_t;

import java.io.IOException;
import java.util.Date;

public class TestJavaMain
{
	public IDpsdkCore dpsdk = new IDpsdkCore();
	public int 	    m_nDLLHandle    = -1;    
	public String   m_strAlarmCamareID = "1000000";
	public String   m_strRealCamareID = "1000000$1$0$0";
	public String   m_strPTZCamareID = "1000000$1$0$0";
	public String   m_strNetAlarmHostCamareID = "1000000$1$0$0";
	public String   m_strNetAlarmHostDeviceID = "1000000";
	
	public String 	m_strIp 		= "192.168.31.78";
	public int    	m_nPort 		= 9000;
	public String 	m_strUser 		= "system";
	public String 	m_strPassword 	= "123456";

	public static String StrCarNum;
	public static boolean bDownloadFinish = false;
	
	Return_Value_Info_t m_nPlaybackSeq = new Return_Value_Info_t();
	Return_Value_Info_t nRealSeq = new Return_Value_Info_t();
	Record_Info_t records;
	
	public fDPSDKDevStatusCallback fDeviceStatus = new fDPSDKDevStatusCallback() {
		@Override
		public void invoke(int nPDLLHandle, byte[] szDeviceId, int nStatus) {
			String status = "离线";
			if(nStatus == 1)
			{
				status = "在线";
				Device_Info_Ex_t deviceInfo = new Device_Info_Ex_t();
				int nRet = IDpsdkCore.DPSDK_GetDeviceInfoExById(m_nDLLHandle, szDeviceId,deviceInfo);
				if(deviceInfo.nDevType == dpsdk_dev_type_e.DEV_TYPE_NVR || deviceInfo.nDevType == dpsdk_dev_type_e.DEV_TYPE_EVS || deviceInfo.nDevType == dpsdk_dev_type_e.DEV_TYPE_SMART_NVR || deviceInfo.nDevType == dpsdk_dev_type_e.DEV_MATRIX_NVR6000)
				{
					nRet = IDpsdkCore.DPSDK_QueryNVRChnlStatus(m_nDLLHandle, szDeviceId , 10*1000);
					
					if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
					{
						System.out.printf("查询NVR通道状态成功，nRet = %d", nRet);
					}else
					{
						System.out.printf("查询NVR通道状态失败，nRet = %d", nRet);
					}
					System.out.println();
				}
			}
			System.out.printf("Device Status Report!, szDeviceId = %s, nStatus = %s", new String(szDeviceId),status);
			System.out.println();
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
			System.out.printf("NVR Channel Status Report!, szCameraId = %s, nStatus = %s", new String(szCameraId),status);
			System.out.println();
		}
	};
	
	public fDPSDKGeneralJsonTransportCallback fGeneralJson = new fDPSDKGeneralJsonTransportCallback() {
		@Override
		public void invoke(int nPDLLHandle, byte[] szJson) {
			System.out.printf("General Json Return, ReturnJson = %s", new String(szJson));
			System.out.println();
		}
	};
	
	public fMediaDataCallback fm = new fMediaDataCallback() {
				@Override
				public void invoke(int nPDLLHandle, int nSeq, int nMediaType,
									byte[] szNodeId, int nParamVal, byte[] szData, int nDataLen) {
					//System.out.print("fMediaDataCallback, nDataLen = ");
					System.out.printf("DPSDKMediaDataCallback nSeq = %d, nMediaType = %d, nDataLen = %d", nSeq, nMediaType, nDataLen);
					System.out.println(nDataLen);
				}
			};
	public fDPSDKNetAlarmHostStatusCallback fNetAlarmHostStatus = new fDPSDKNetAlarmHostStatusCallback() {
				@Override
				public void invoke(int nPDLLHandle, byte[] szDeviceId, int nRType, int nOperType, int nStatus) {
					String DeviceId = new String(szDeviceId);
					String strReportType = "";
					String strOperationType = "";
					String strStatus = "";
					switch(nRType)
					{
						case 1:
							strReportType = "留守布防";
							break;
						case 2:
							strReportType = "防区旁路";
							break;
						default:
							strReportType = "未知";
							break;
					}
					switch(nOperType)
					{
						case 1:
							strOperationType = "设备 布/撤防";
							break;
						case 2:
							strOperationType = "通道 布/撤防";
							break;
						case 3:
							strOperationType = "报警输出通道操作";
							break;
						default:
							strOperationType = "未知";
							break;
					}
					switch(nStatus)
					{
						case 1:
							strStatus = "布防/旁路";
							break;
						case 2:
							strStatus = "撤防/取消旁路";
							break;
						default:
							strStatus = "未知";
							break;
					}
					System.out.printf("NetAlarmHostStatusCallback, szDeviceId[%s]nRType[%s]nOperType[%s]nStatus[%s]",DeviceId, strReportType, strOperationType, strStatus);
					System.out.println();
				}
			};
			
	public fDPSDKAlarmCallback fAlarm = new fDPSDKAlarmCallback() {
				@Override
				public void invoke( int nPDLLHandle, byte[] szAlarmId, int nDeviceType, byte[] szCameraId,
						byte[] szDeviceName, byte[] szChannelName, byte[] szCoding, byte[] szMessage, int nAlarmType, 
						int nEventType, int nLevel, long nTime, byte[] pAlarmData, int nAlarmDataLen, byte[] pPicData, int nPicDataLen){
					System.out.printf("fDPSDKAlarmCallback, nAlarmType[%d]szCameraId[%s]szDeviceName[%s]szChannelName[%s]szCoding[%s]szMessage[%s]nTime[%d]pAlarmData[%s]nAlarmDataLen[%d]pPicData[%s]nPicDataLen[%d]",nAlarmType,new String(szCameraId),
						new String(szDeviceName),new String(szChannelName),new String(szCoding),new String(szMessage),nTime,new String(pAlarmData),nAlarmDataLen,new String(pPicData),nPicDataLen);
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

	//转码下载录像完成回调
	public fSaveRecordFinishedCallback fSaveRecordFinished = new fSaveRecordFinishedCallback() {
		@Override
		public void invoke(int nPDLLHandle, int nPlaybackSeq) {
			System.out.printf("录像下载完成，nPlaybackSeq = %d", nPlaybackSeq);
			System.out.println();
			bDownloadFinish = true;
		}
	};
		
	/*public static void main(String argv[])
	{
		new TestJavaMain();
	}*/

	//@Scheduled(cron = "0 0/1 * * * *")
	public void TestJavaMain()
	{
		Return_Value_Info_t res = new Return_Value_Info_t();
		int nRet = dpsdk.DPSDK_Create(dpsdk_sdk_type_e.DPSDK_CORE_SDK_SERVER,res);
		m_nDLLHandle = res.nReturnValue;
		System.out.print("DPSDK_Create, m_nDLLHandle = ");
		System.out.println(m_nDLLHandle);
		if(m_nDLLHandle > 0)
		{
			//设置DPSDK日志路径
			//String fileName = "/root/DPSDK_log";
			//nRet = dpsdk.DPSDK_SetLog(m_nDLLHandle, fileName.getBytes());
			//if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			//{
			//	System.out.printf("DPSDK_SetLog success! nRet = %d,fileNamepath = %s", nRet, fileName);
			//}else
			//{
			//	System.out.printf("DPSDK_SetLog failed! nRet = %d", nRet);
			//}
			//System.out.println();



			//login
			Login_Info_t loginInfo = new Login_Info_t();
			loginInfo.szIp = m_strIp.getBytes();
			loginInfo.nPort = m_nPort;
			loginInfo.szUsername = m_strUser.getBytes();
			loginInfo.szPassword = m_strPassword.getBytes();
			loginInfo.nProtocol = dpsdk_protocol_version_e.DPSDK_PROTOCOL_VERSION_II;
			loginInfo.iType = 1;

			nRet = IDpsdkCore.DPSDK_Login(m_nDLLHandle,loginInfo,10000);
			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("login success! nRet = %d", nRet);
			}else
			{
				System.out.printf("login failed! nRet = %d", nRet);
			}
			System.out.println();

			//设置设备状态上报监听函数
			nRet = IDpsdkCore.DPSDK_SetDPSDKDeviceStatusCallback(m_nDLLHandle, fDeviceStatus);

			//设置NVR通道状态上报监听函数
			nRet =IDpsdkCore.DPSDK_SetDPSDKNVRChnlStatusCallback(m_nDLLHandle, fNVRChnlStatus);

			//设置通用JSON回调
			nRet = IDpsdkCore.DPSDK_SetGeneralJsonTransportCallback(m_nDLLHandle, fGeneralJson);

			//Set Net Alarm Host Status Callback
			nRet = IDpsdkCore.DPSDK_SetNetAlarmHostStatusCallback(m_nDLLHandle, fNetAlarmHostStatus);

			nRet = IDpsdkCore.DPSDK_SetDPSDKGetAreaSpeedDetectCallback(m_nDLLHandle, fGetAreaSpeedDetectCallback);

			nRet = IDpsdkCore.DPSDK_SetDPSDKSaveRecordFinishedCallback(m_nDLLHandle, fSaveRecordFinished);

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("DPSDK_SetNetAlarmHostStatusCallback success! nRet = %d", nRet);
			}else
			{
				System.out.printf("DPSDK_SetNetAlarmHostStatusCallback failed! nRet = %d", nRet);
			}
			System.out.println();

			//Set General Alarm Callback
			nRet = IDpsdkCore.DPSDK_SetDPSDKAlarmCallback(m_nDLLHandle, fAlarm);

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("DPSDK_SetDPSDKAlarmCallback success! nRet = %d", nRet);
			}else
			{
				System.out.printf("DPSDK_SetDPSDKAlarmCallback failed! nRet = %d", nRet);
			}
			System.out.println();


			//load group info
			Return_Value_Info_t nLen = new Return_Value_Info_t();
			nRet = IDpsdkCore.DPSDK_LoadDGroupInfo(m_nDLLHandle, nLen, 180000);

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("load all Group info success! nRet = %d, strLength = %d", nRet,nLen.nReturnValue);
			}else
			{
				System.out.printf("load all Group info failed! nRet = %d", nRet);
			}
			System.out.println();

			byte[] szGroupBuf = new byte[nLen.nReturnValue];
			nRet = IDpsdkCore.DPSDK_GetDGroupStr(m_nDLLHandle, szGroupBuf, nLen.nReturnValue, 10000);

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("获取所有组织树串成功，nRet = %d, szGroupBuf = [%s]", nRet, new String(szGroupBuf));
				//System.out.printf("获取所有组织树串成功，已经存储到root/text.xml");
				//try {
				//	File file = new File("root/text.xml");
				//	if(!file.exists())
				//	{
				//		file.createNewFile();
				//	}

				//	FileOutputStream  out = new FileOutputStream(file);
				//	out.write(szGroupBuf);
				//	out.close();
				//} catch (IOException e1) {
				// TODO Auto-generated catch block
				//	e1.printStackTrace();
				//}

			}else
			{
				System.out.printf("获取所有组织树串失败，nRet = %d", nRet);
			}
			System.out.println();


			//加载组织结构后延时5秒，等待服务模块建立链接
			try{
			Thread.sleep(5000);
			}catch(InterruptedException e){
			e.printStackTrace();
			}

			GetUserOrgInfo userOrgInfo = new GetUserOrgInfo();
			nRet = IDpsdkCore.DPSDK_GetUserOrgInfo(m_nDLLHandle, userOrgInfo, 10000);

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("获取用户组织信息成功，nRet = %d， UserOrgInfo = %s", nRet, userOrgInfo.strUserOrgInfo);
			}else
			{
				System.out.printf("获取用户组织信息失败，nRet = %d", nRet);
			}
			System.out.println();

			int nSubscribeFlag = 1;
			nRet = IDpsdkCore.DPSDK_SubscribeAreaSpeedDetectInfo(m_nDLLHandle, nSubscribeFlag, 10000);
			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("订阅区间测速上报成功，nRet = %d", nRet);
			}else
			{
				System.out.printf("订阅区间测速上报失败，nRet = %d", nRet);
			}
			System.out.println();

			//按时间下载mp4格式录像
			bDownloadFinish = false;
			Return_Value_Info_t nDownLoadSeq = new Return_Value_Info_t();
			Get_RecordStream_Time_Info_t getInfo = new Get_RecordStream_Time_Info_t();
			getInfo.szCameraId = "1000000$1$0$12".getBytes();
			getInfo.nMode = 2;//下载模式
			getInfo.nRight = dpsdk_check_right_e.DPSDK_CORE_NOT_CHECK_RIGHT; //不检查权限，请求视频流，无需加载组织结构
			getInfo.nSource = 2;//设备录像
			@SuppressWarnings("deprecation")
			Date tmStart = new Date(2018-1900,7-1,31,0,0,0);
			@SuppressWarnings("deprecation")
			Date tmEnd = new Date(2018-1900,7-1,31,0,1,0);
			long begintime = tmStart.getTime()/1000;
			long endtime = tmEnd.getTime()/1000;

			System.out.printf("开始录像下载   begintime = %d， endtime = %d", begintime, endtime);
			System.out.println();
			getInfo.uBeginTime = begintime;//转换成秒;
			getInfo.uEndTime = endtime;
			int scType = 3;//mp4

			nRet = IDpsdkCore.DPSDK_SaveRecordStreamByTime( m_nDLLHandle, nDownLoadSeq, getInfo, scType, "./test.mp4".getBytes(), 10000);

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("开始录像下载成功，nRet = %d， nSeq = %d", nRet, nDownLoadSeq.nReturnValue);
			}else
			{
				System.out.printf("开始录像下载失败，nRet = %d", nRet);
			}
			System.out.println();
			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				int nCount = 0;
				while(nCount < 300)
				{
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					nCount++;
					if(bDownloadFinish)
					break;
				}

				if(nDownLoadSeq.nReturnValue > 0)
				{
					nRet = IDpsdkCore.DPSDK_CloseRecordStreamBySeq(m_nDLLHandle, nDownLoadSeq.nReturnValue, 10000);
					System.out.printf("停止下载成功，nRet = %d， nSeq = %d", nRet, nDownLoadSeq.nReturnValue);
					System.out.println();
				}
			}

			/*
			Client_Alarm_Info_t sendAlarmInfo = new Client_Alarm_Info_t();
			sendAlarmInfo.szCameraId = m_strRealCamareID.getBytes();
			sendAlarmInfo.enAlarmType = 5502; //上海迹恒上报报警
			sendAlarmInfo.enStatus = 1;
			sendAlarmInfo.uAlarmTime = 111111111;
			String message = "UserID(46464646464)Nmae(张三)Addr(江南大道1199号)BirthDay(1996-05-12)Gender(1)PicUrl(ftp://127.1.1.1/alarm/02/1.jpg)";
			sendAlarmInfo.szMsg = message.getBytes();

			nRet = IDpsdkCore.DPSDK_SendAlarmToServer(m_nDLLHandle, sendAlarmInfo, 10* 1000);

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("发送报警到DSS服务 成功! nRet = %d  message[%s]", nRet, message);
			}else
			{
				System.out.printf("发送报警到DSS服务 失败! nRet = %d", nRet);
			}
			System.out.println();


			try{
			Thread.sleep(3000);
			}catch(InterruptedException e){
			e.printStackTrace();
			}

			nRet = IDpsdkCore.DPSDK_SendAlarmToServer(m_nDLLHandle, sendAlarmInfo, 10* 1000);

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("发送报警到DSS服务 成功! nRet = %d  message[%s]", nRet, message);
			}else
			{
				System.out.printf("发送报警到DSS服务 失败! nRet = %d", nRet);
			}
			System.out.println();


			try{
			Thread.sleep(3000);
			}catch(InterruptedException e){
			e.printStackTrace();
			}

			nRet = IDpsdkCore.DPSDK_SendAlarmToServer(m_nDLLHandle, sendAlarmInfo, 10* 1000);

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("发送报警到DSS服务 成功! nRet = %d  message[%s]", nRet, message);
			}else
			{
				System.out.printf("发送报警到DSS服务 失败! nRet = %d", nRet);
			}
			System.out.println();


			try{
			Thread.sleep(3000);
			}catch(InterruptedException e){
			e.printStackTrace();
			}

			nRet = IDpsdkCore.DPSDK_SendAlarmToServer(m_nDLLHandle, sendAlarmInfo, 10* 1000);

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("发送报警到DSS服务 成功! nRet = %d  message[%s]", nRet, message);
			}else
			{
				System.out.printf("发送报警到DSS服务 失败! nRet = %d", nRet);
			}
			System.out.println();


			try{
			Thread.sleep(3000);
			}catch(InterruptedException e){
			e.printStackTrace();
			}

			nRet = IDpsdkCore.DPSDK_SendAlarmToServer(m_nDLLHandle, sendAlarmInfo, 10* 1000);

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("发送报警到DSS服务 成功! nRet = %d  message[%s]", nRet, message);
			}else
			{
				System.out.printf("发送报警到DSS服务 失败! nRet = %d", nRet);
			}
			System.out.println();

			while(true);

			*/
			/*
			//get real stream url
			Get_RealStreamUrl_Info_t pRealStreamUrlInfo = new Get_RealStreamUrl_Info_t();
			pRealStreamUrlInfo.szCameraId = m_strRealCamareID.getBytes();
			pRealStreamUrlInfo.nMediaType = dpsdk_media_type_e.DPSDK_CORE_MEDIATYPE_VIDEO;
			pRealStreamUrlInfo.nStreamType = dpsdk_stream_type_e.DPSDK_CORE_STREAMTYPE_MAIN;
			pRealStreamUrlInfo.nTransType = dpsdk_trans_type_e.DPSDK_CORE_TRANSTYPE_TCP;
			nRet = IDpsdkCore.DPSDK_GetRealStreamUrl(m_nDLLHandle, pRealStreamUrlInfo, 10000);
			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.println(new String(pRealStreamUrlInfo.szUrl).trim());
			}else
			{
				System.out.printf("获取URL失败，nRet = %d", nRet);
			}
			System.out.println();

			//get real stream
			Get_RealStream_Info_t getInfo = new Get_RealStream_Info_t();
			getInfo.szCameraId = m_strRealCamareID.getBytes();
			getInfo.nStreamType = dpsdk_stream_type_e.DPSDK_CORE_STREAMTYPE_MAIN;
			getInfo.nRight = dpsdk_check_right_e.DPSDK_CORE_NOT_CHECK_RIGHT;
			getInfo.nMediaType = dpsdk_media_type_e.DPSDK_CORE_MEDIATYPE_VIDEO;
			getInfo.nTransType = dpsdk_trans_type_e.DPSDK_CORE_TRANSTYPE_TCP;
			getInfo.nTrackID = 501;

			nRet = IDpsdkCore.DPSDK_GetRealStream(m_nDLLHandle, nRealSeq, getInfo, fm, 10000);

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("GetRealStream success! nRet = %d, nSeq = %d", nRet, nRealSeq.nReturnValue);
			}else
			{
				System.out.printf("GetRealStream failed! nRet = %d", nRet);
			}
			System.out.println();

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				try{
					Thread.sleep(30000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				//close real stream
				nRet = IDpsdkCore.DPSDK_CloseRealStreamBySeq(m_nDLLHandle, nRealSeq.nReturnValue, 10000);

				if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
				{
					System.out.printf("CloseRealStream success! nRet = %d, nSeq = %d", nRet, nRealSeq.nReturnValue);
				}else
				{
					System.out.printf("CloseRealStream failed! nRet = %d", nRet);
				}
				System.out.println();
			}

			while(true);
			*/

			int nTvWallId = 45;
			Return_Value_Info_t nCount = new Return_Value_Info_t();
			nRet = IDpsdkCore.DPSDK_GetTvWallTaskListCount(m_nDLLHandle, nTvWallId, nCount, 10000);
			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("查询电视墙任务列表数量成功，nRet = %d， nCount= %d", nRet, nCount.nReturnValue);
			}else
			{
				System.out.printf("查询电视墙任务列表数量失败，nRet = %d", nRet);
			}
			System.out.println();

			int nCurTaskId = -1;
			if(nCount.nReturnValue > 0)
			{
				TvWall_Task_Info_List_t pTvWallTaskListInfo = new TvWall_Task_Info_List_t(nCount.nReturnValue);
				pTvWallTaskListInfo.nCount = nCount.nReturnValue;
				nRet = IDpsdkCore.DPSDK_GetTvWallTaskList(m_nDLLHandle, nTvWallId, pTvWallTaskListInfo, 10000);
				if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
				{
					System.out.printf("获取电视墙任务列表信息成功，nRet = %d， nCount= %d", nRet, pTvWallTaskListInfo.nCount);
					for(int i=0;i<pTvWallTaskListInfo.nCount;i++)
					{
						System.out.println();
						System.out.printf("序号=%d，nTaskId=%d，szName=%s, szDes=%s", i+1, pTvWallTaskListInfo.pTvWallTaskInfo[i].nTaskId, new String(pTvWallTaskListInfo.pTvWallTaskInfo[i].szName).trim(),
							new String(pTvWallTaskListInfo.pTvWallTaskInfo[i].szDes).trim());

						if(i==0)
						{
							nCurTaskId = pTvWallTaskListInfo.pTvWallTaskInfo[i].nTaskId;
						}
					}
				}else
				{
					System.out.printf("获取电视墙任务列表信息失败，nRet = %d", nRet);
				}
				System.out.println();
			}

			if(nCurTaskId >= 0)
			{
				Return_Value_Info_t nTaskInfoLen = new Return_Value_Info_t();
				nRet = IDpsdkCore.DPSDK_GetTvWallTaskInfoLen(m_nDLLHandle, nTvWallId, nCurTaskId, nTaskInfoLen, 10000);
				if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS && nTaskInfoLen.nReturnValue > 0)
				{
					byte[] szTaskInfoBuf = new byte[nTaskInfoLen.nReturnValue];
					nRet = IDpsdkCore.DPSDK_GetTvWallTaskInfoStr(m_nDLLHandle, szTaskInfoBuf, nTaskInfoLen.nReturnValue);
					if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
					{
						String TaskInfoBuf = "";
						try {
							TaskInfoBuf = new String(szTaskInfoBuf, "UTF-8");
						} catch (IOException e) {
		            	e.printStackTrace();
						}
						System.out.printf("查询电视墙任务信息成功，szTaskInfoBuf = %s", TaskInfoBuf);
						System.out.println();
					}

					nRet = IDpsdkCore.DPSDK_MapTaskToTvWall(m_nDLLHandle, nTvWallId, nCurTaskId, 10000);
					if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
					{
						System.out.printf("电视墙任务上墙成功。");

					}
					else
					{
						System.out.printf("电视墙任务上墙失败，nRet = %d.", nRet);
					}
					System.out.println();
				}
			}

			/*
			//try{
			//	Thread.sleep(3000);
			//}catch(InterruptedException e){
			//	e.printStackTrace();
			//}

			//ptzControl Start
			//Ptz_Direct_Info_t ptzDirectInfo = new Ptz_Direct_Info_t();
			//ptzDirectInfo.szCameraId = m_strPTZCamareID.getBytes();
			//ptzDirectInfo.bStop = false;
			//ptzDirectInfo.nDirect = dpsdk_ptz_direct_e.DPSDK_CORE_PTZ_GO_LEFT;
			//ptzDirectInfo.nStep = 3;

			//nRet = IDpsdkCore.DPSDK_PtzDirection(m_nDLLHandle, ptzDirectInfo, 10*1000);

			//if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			//{
			//	System.out.printf("PtzDirectionControl STart success! nRet = %d, nSeq = %d", nRet, nRealSeq.nReturnValue);
			//}else
			//{
			//	System.out.printf("PtzDirectionControl Start failed! nRet = %d", nRet);
			//}
			//System.out.println();

			//try{
			//	Thread.sleep(3000);
			//}catch(InterruptedException e){
			//	e.printStackTrace();
			//}

			//ptzControl Stop
			//ptzDirectInfo.bStop = true;

			//nRet = IDpsdkCore.DPSDK_PtzDirection(m_nDLLHandle, ptzDirectInfo, 10*1000);

			//if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			//{
			//	System.out.printf("PtzDirectionControl Stop success! nRet = %d, nSeq = %d", nRet, nRealSeq.nReturnValue);
			//}else
			//{
			//	System.out.printf("PtzDirectionControl Stop failed! nRet = %d", nRet);
			//}
			//System.out.println();

			//zoom begin
			//Ptz_Operation_Info_t ptzOperationInfo = new Ptz_Operation_Info_t();
			//ptzOperationInfo.szCameraId = m_strPTZCamareID.getBytes();
			//ptzOperationInfo.bStop = false;
			//ptzOperationInfo.nOperation = dpsdk_camera_operation_e.DPSDK_CORE_PTZ_ADD_ZOOM;
			//ptzOperationInfo.nStep = 2;

			//nRet = IDpsdkCore.DPSDK_PtzCameraOperation(m_nDLLHandle, ptzOperationInfo, 10*1000);
			//if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			//{
			//	System.out.printf("PtzCameraOperation zoom begin success! nRet = %d, nSeq = %d", nRet, nRealSeq.nReturnValue);
			//}else
			//{
			//	System.out.printf("PtzCameraOperation zoom begin failed! nRet = %d", nRet);
			//}
			//System.out.println();

			//try{
			//	Thread.sleep(3000);
			//}catch(InterruptedException e){
			//	e.printStackTrace();
			//}

			//zoom stop
			//ptzOperationInfo.bStop = true;

			//nRet = IDpsdkCore.DPSDK_PtzCameraOperation(m_nDLLHandle, ptzOperationInfo, 10*1000);

			//if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			//{
			//	System.out.printf("PtzCameraOperation zoom stop success! nRet = %d, nSeq = %d", nRet, nRealSeq.nReturnValue);
			//}else
			//{
			//	System.out.printf("PtzCameraOperation zoom stop failed! nRet = %d", nRet);
			//}
			//System.out.println();


			//qurey ptz prepoint
			//Ptz_Prepoint_Info_t PtzPrepointInfo = new Ptz_Prepoint_Info_t();
			//PtzPrepointInfo.szCameraId = m_strPTZCamareID.getBytes();

			//nRet = IDpsdkCore.DPSDK_QueryPrePoint(m_nDLLHandle, PtzPrepointInfo, 10*1000);
			//
			//if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			//{
			//	System.out.printf("DPSDK_QueryPrePoint success! nRet = %d, PrepointCount = %d", nRet, PtzPrepointInfo.nCount);
			//}else
			//{
			//	System.out.printf("DPSDK_QueryPrePoint failed! nRet = %d", nRet);
			//}
			//System.out.println();

			//ptz prepoint option
			//if(PtzPrepointInfo.nCount > 0)
			//{
			//	Ptz_Prepoint_Operation_Info_t prePointOperation = new Ptz_Prepoint_Operation_Info_t();
			//	prePointOperation.szCameraId = m_strPTZCamareID.getBytes();
			//	prePointOperation.nCmd = dpsdk_ptz_prepoint_cmd_e.DPSDK_CORE_PTZ_PRESET_LOCATION; //location
			//	prePointOperation.pPoints.nCode = PtzPrepointInfo.pPoints[0].nCode;
			//	prePointOperation.pPoints.szName = PtzPrepointInfo.pPoints[0].szName;

			//	nRet = IDpsdkCore.DPSDK_PtzPrePointOperation(m_nDLLHandle, prePointOperation, 10*1000);

			//	if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			//	{
			//		System.out.printf("DPSDK_PtzPrePointOperation location success! nRet = %d", nRet);
			//	}else
			//	{
			//		System.out.printf("DPSDK_PtzPrePointOperation location failed! nRet = %d", nRet);
			//	}
			//	System.out.println();
			//}


			//control Net Alarm Host (enable device alarm)
			String szId = m_strNetAlarmHostDeviceID;
			int opttype = dpsdk_netalarmhost_operator_e.AHOST_OPERATE_DEVICE;//or AHOST_OPERATE_CHANNEL
			int controlType = dpsdk_AlarmhostOperator_e.CONTROL_DEV_ARM; //or CONTROL_DEV_DISARM

			nRet = IDpsdkCore.DPSDK_ControlNetAlarmHostCmd(m_nDLLHandle, szId.getBytes(), opttype, controlType, 0, 0, 10*1000);

			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("DPSDK_ControlNetAlarmHostCmd enable device alarm success! nRet = %d", nRet);

				try{
					Thread.sleep(10000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}


				//disable device alarm
				controlType = dpsdk_AlarmhostOperator_e.CONTROL_DEV_DISARM;

				nRet = IDpsdkCore.DPSDK_ControlNetAlarmHostCmd(m_nDLLHandle, szId.getBytes(), opttype, controlType, 0, 0, 10*1000);
				if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
				{
					System.out.printf("DPSDK_ControlNetAlarmHostCmd disable device alarm success! nRet = %d", nRet);
				}else
				{
					System.out.printf("DPSDK_ControlNetAlarmHostCmd disable device alarm  failed! nRet = %d", nRet);
				}

			}else
			{
				System.out.printf("DPSDK_ControlNetAlarmHostCmd enable device alarm  failed! nRet = %d", nRet);
			}
			System.out.println();


			try{
				Thread.sleep(30000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}

			// playback stream

			//Query Record
			Get_RecordStream_File_Info_t m_RecordFileInfo = new Get_RecordStream_File_Info_t();
			Return_Value_Info_t nRecordCount = new Return_Value_Info_t();
			Query_Record_Info_t queryRecordInfo = new Query_Record_Info_t();
			queryRecordInfo.szCameraId = m_strRealCamareID.getBytes();
			queryRecordInfo.nRight = dpsdk_check_right_e.DPSDK_CORE_NOT_CHECK_RIGHT;
			queryRecordInfo.nRecordType = dpsdk_record_type_e.DPSDK_CORE_PB_RECORD_UNKONWN;
			queryRecordInfo.nSource = dpsdk_recsource_type_e.DPSDK_CORE_PB_RECSOURCE_PLATFORM;
			queryRecordInfo.uBeginTime = System.currentTimeMillis()/1000 - 3600*12;
			queryRecordInfo.uEndTime = System.currentTimeMillis()/1000;
			System.out.printf("DPSDK_QueryRecord uBeginTime = %d, uEndTime = %d", queryRecordInfo.uBeginTime, queryRecordInfo.uEndTime);

			nRet = IDpsdkCore.DPSDK_QueryRecord(m_nDLLHandle, queryRecordInfo, nRecordCount, 20*1000);
			int nCount = 0;

	        if (nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS) {
				nCount = nRecordCount.nReturnValue;
				if(nCount > 0)
				{
					records = new Record_Info_t(nCount);
					records.szCameraId = m_strRealCamareID.getBytes();
					m_RecordFileInfo.szCameraId = m_strRealCamareID.getBytes();
					records.nBegin = 0;
					IDpsdkCore.DPSDK_GetRecordInfo(m_nDLLHandle, records);
					if(records.nCount > 0) {
						m_RecordFileInfo.nFileIndex = records.pSingleRecord[0].nFileIndex;
						m_RecordFileInfo.nMode = dpsdk_pb_mode_e.DPSDK_CORE_PB_MODE_NORMAL;
						m_RecordFileInfo.nRight = dpsdk_check_right_e.DPSDK_CORE_NOT_CHECK_RIGHT;
						m_RecordFileInfo.uBeginTime = records.pSingleRecord[0].uBeginTime;
						m_RecordFileInfo.uEndTime = records.pSingleRecord[0].uEndTime;
					}
					System.out.printf("QueryRecord success! nRet = %d", nRet);

					System.out.printf("DPSDK_GetRecordStreamByTime uBeginTime = %d, uEndTime = %d", m_RecordFileInfo.uBeginTime, m_RecordFileInfo.uEndTime);
					nRet = IDpsdkCore.DPSDK_GetRecordStreamByFile(m_nDLLHandle, m_nPlaybackSeq, m_RecordFileInfo, fm, 20*1000);
					if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
					{
						System.out.printf("GetRecordStreamByFile success! nRet = %d, nSeq = %d", nRet, m_nPlaybackSeq.nReturnValue);
					}else
					{
						System.out.printf("GetRecordStreamByFile failed! nRet = %d", nRet);
					}
					System.out.println();

					if(records.nCount > 0 && nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
					{
						try{
							Thread.sleep(10000);
						}catch(InterruptedException e){
							e.printStackTrace();
						}

						nRet = IDpsdkCore.DPSDK_CloseRecordStreamBySeq(m_nDLLHandle, m_nPlaybackSeq.nReturnValue, 10000);

						if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
						{
							System.out.printf("Close file RecordStream success! nRet = %d, nSeq = %d", nRet, m_nPlaybackSeq.nReturnValue);
						}else
						{
							System.out.printf("Close file RecordStream failed! nRet = %d", nRet);
						}
						System.out.println();
					}

					try{
						Thread.sleep(3000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}

					if(records.nCount > 0)
					{
						Get_RecordStream_Time_Info_t getRecordStreamTimeInfo = new Get_RecordStream_Time_Info_t();

						getRecordStreamTimeInfo.szCameraId = m_strRealCamareID.getBytes();;
						getRecordStreamTimeInfo.nMode = dpsdk_pb_mode_e.DPSDK_CORE_PB_MODE_NORMAL;
						getRecordStreamTimeInfo.nRight = dpsdk_check_right_e.DPSDK_CORE_NOT_CHECK_RIGHT;
						getRecordStreamTimeInfo.nSource = dpsdk_recsource_type_e.DPSDK_CORE_PB_RECSOURCE_PLATFORM;
						getRecordStreamTimeInfo.uBeginTime = System.currentTimeMillis()/1000 - 3600*12;
						getRecordStreamTimeInfo.uEndTime = System.currentTimeMillis()/1000;
						System.out.printf("DPSDK_GetRecordStreamByTime uBeginTime = %d, uEndTime = %d", getRecordStreamTimeInfo.uBeginTime, getRecordStreamTimeInfo.uEndTime);
						nRet = IDpsdkCore.DPSDK_GetRecordStreamByTime(m_nDLLHandle, m_nPlaybackSeq, getRecordStreamTimeInfo, fm, 20*1000);
						if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
						{
							System.out.printf("GetRecordStreamByTime success! nRet = %d, nSeq = %d", nRet, m_nPlaybackSeq.nReturnValue);
						}else
						{
							System.out.printf("GetRecordStreamByTime failed! nRet = %d", nRet);
						}
						System.out.println();
					}

					if(records.nCount > 0 && nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
					{
						try{
							Thread.sleep(10000);
						}catch(InterruptedException e){
							e.printStackTrace();
						}

						nRet = IDpsdkCore.DPSDK_CloseRecordStreamBySeq(m_nDLLHandle, m_nPlaybackSeq.nReturnValue, 10000);

						if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
						{
							System.out.printf("Close Time RecordStream success! nRet = %d, nSeq = %d", nRet, m_nPlaybackSeq.nReturnValue);
						}else
						{
							System.out.printf("Close Time RecordStream failed! nRet = %d", nRet);
						}
						System.out.println();
					}
				}
			}else
			{
				System.out.printf("QueryRecord failed! nRet = %d", nRet);
			}
			System.out.println();


			//logout DSS
			nRet = IDpsdkCore.DPSDK_Logout(m_nDLLHandle, 10000);
			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("logout success! nRet = %d", nRet);
			}else
			{
				System.out.printf("logout failed! nRet = %d", nRet);
			}
			System.out.println();

			// destory SDK
			nRet = IDpsdkCore.DPSDK_Destroy(m_nDLLHandle);
			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("Destroy success! nRet = %d", nRet);
			}else
			{
				System.out.printf("Destroy failed! nRet = %d", nRet);
			}
			System.out.println();
			*/
			nRet = IDpsdkCore.DPSDK_Destroy(m_nDLLHandle);
			if(nRet == dpsdk_retval_e.DPSDK_RET_SUCCESS)
			{
				System.out.printf("Destroy success! nRet = %d", nRet);
			}else
			{
				System.out.printf("Destroy failed! nRet = %d", nRet);
			}
			System.out.println();
		}
	}
}

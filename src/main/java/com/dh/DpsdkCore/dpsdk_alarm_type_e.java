package com.dh.DpsdkCore;

/** 报警类型
	@param     DPSDK_CORE_ALARM_TYPE_Unknown					= 0;		未知
	@param     DPSDK_CORE_ALARM_TYPE_VIDEO_LOST					= 1;		视频丢失
	@param     DPSDK_CORE_ALARM_TYPE_EXTERNAL_ALARM				= 2;		外部报警
	@param     DPSDK_CORE_ALARM_TYPE_MOTION_DETECT				= 3;		移动侦测
	@param     DPSDK_CORE_ALARM_TYPE_VIDEO_SHELTER				= 4;		视频遮挡
	@param     DPSDK_CORE_ALARM_TYPE_DISK_FULL					= 5;		硬盘满
	@param     DPSDK_CORE_ALARM_TYPE_DISK_FAULT					= 6;		硬盘故障
	@param     DPSDK_CORE_ALARM_TYPE_FIBER						= 7;		光纤报警
	@param     DPSDK_CORE_ALARM_TYPE_GPS						= 8;		GPS信息
	@param     DPSDK_CORE_ALARM_TYPE_3G							= 9;		3G
	@param     DPSDK_CORE_ALARM_TYPE_STATUS_RECORD				= 10;		设备录像状态
	@param     DPSDK_CORE_ALARM_TYPE_STATUS_DEVNAME				= 11;		设备名
	@param     DPSDK_CORE_ALARM_TYPE_STATUS_DISKINFO			= 12;		硬盘信息
	@param     DPSDK_CORE_ALARM_TYPE_IPC_OFF					= 13;		前端IPC断线

	@param     DPSDK_CORE_ALARM_DOOR_BEGIN				     	= 40;		门禁设备报警起始
	@param     DPSDK_CORE_ALARM_FORCE_CARD_OPENDOOR		 		= 41;		胁迫刷卡开门
	@param     DPSDK_CORE_ALARM_VALID_PASSWORD_OPENDOOR	 		= 42;		合法密码开门
	@param     DPSDK_CORE_ALARM_INVALID_PASSWORD_OPENDOOR	 	= 43;		非法密码开门
	@param     DPSDK_CORE_ALARM_FORCE_PASSWORD_OPENDOOR	 		= 44;		胁迫密码开门
	@param     DPSDK_CORE_ALARM_VALID_FINGERPRINT_OPENDOOR	 	= 45;		合法指纹开门
	@param     DPSDK_CORE_ALARM_INVALID_FINGERPRINT_OPENDOOR	= 46;		非法指纹开门
	@param     DPSDK_CORE_ALARM_FORCE_FINGERPRINT_OPENDOOR	 	= 47;		胁迫指纹开门

	@param     DPSDK_CORE_ALARM_TYPE_VALID_CARD_READ		 	= 51;		合法刷卡/开门
	@param     DPSDK_CORE_ALARM_TYPE_INVALID_CARD_READ		 	= 52;		非法刷卡/开门
	@param     DPSDK_CORE_ALARM_TYPE_DOOR_MAGNETIC_ERROR	 	= 53;		门磁报警
	@param     DPSDK_CORE_ALARM_TYPE_DOOR_BREAK   			 	= 54;		破门报警和开门超时报警
	@param     DPSDK_CORE_ALARM_TYPE_DOOR_ABNORMAL_CLOSED	 	= 55;		门非正常关闭
	@param     DPSDK_CORE_ALARM_TYPE_DOOR_NORMAL_CLOSED	 		= 56;		门正常关闭
	@param     DPSDK_CORE_ALARM_TYPE_DOOR_OPEN				 	= 57;		门打开

	@param     DPSDK_CORE_ALARM_DOOR_OPEN_TIME_OUT_BEG			= 60;
	@param     DPSDK_CORE_ALARM_DOOR_OPEN_TIME_OUT_END			= 70;

	@param     DPSDK_CORE_ALARM_TYPE_ALARM_CONTROL_ALERT		= 81;		报警主机报警
	@param     DPSDK_CORE_ALARM_TYPE_FIRE_ALARM					= 82;		火警
	@param     DPSDK_CORE_ALARM_TYPE_ZONE_DISABLED				= 83;		防区失效
	@param     DPSDK_CORE_ALARM_TYPE_BATTERY_EMPTY				= 84;		电池没电

	@param     DPSDK_CORE_ALARM_FILESYSTEM				    	= 100;		文件系统
	@param     DPSDK_CORE_ALARM_RAID_FAULT						= 101;		raid故障
	@param     DPSDK_CORE_ALARM_RECORDCHANNELFUNCTION_ABNORMAL 	= 102;		录像通道功能异常
	@param     DPSDK_CORE_SVR_HARDDISK_STATUS	= 103;						硬盘状态
	@param     DPSDK_CORE_ALARM_RECORD_REPAIR	= 104;						录像补全 -P3.0

	@param     DPSDK_CORE_ALARM_MOTOR_BEGIN						= 200;
	@param     DPSDK_CORE_ALARM_OVERSPEED_OCCURE				= 201; 		超速报警产生
	@param     DPSDK_CORE_ALARM_OVERSPEED_DISAPPEAR  			= 202;		超速报警消失
	@param     DPSDK_CORE_ALARM_DRIVEROUT_DRIVERALLOW			= 203;		驶出行区
	@param     DPSDK_CORE_ALARM_DRIVERIN_DRIVERALLOW			= 204;		驶入行区
	@param     DPSDK_CORE_ALARM_DRIVEROUT_FORBIDDRIVE			= 205;		驶出禁入区
	@param     DPSDK_CORE_ALARM_DRIVERIN_FORBIDDRIVE			= 206;		驶入禁入区
	@param     DPSDK_CORE_ALARM_DRIVEROUT_LOADGOODS				= 207;		驶出装货区
	@param     DPSDK_CORE_ALARM_DRIVERIN_LOADGOODS				= 208;		驶入装货区
	@param     DPSDK_CORE_ALARM_DRIVEROUT_UNLOADGOODS			= 209;		驶出卸货区
	@param     DPSDK_CORE_ALARM_DRIVERIN_UNLOADGOODS			= 210;		驶入卸货区
	@param     DPSDK_CORE_ALARM_CAR_OVER_LOAD					= 211;		超载
	@param     DPSDK_CORE_ALARM_SPEED_SOON_ZERO					= 212;		急刹车
	@param     DPSDK_CORE_ALARM_3GFLOW							= 213;		3G流量
	@param     DPSDK_CORE_ALARM_AAC_POWEROFF					= 214;		ACC断电报警
	@param     DPSDK_CORE_ALARM_SPEEDLIMIT_LOWERSPEED			= 215;		限速报警 LowerSpeed
	@param     DPSDK_CORE_ALARM_SPEEDLIMIT_UPPERSPEED			= 216;		限速报警 UpperSpeed 
	@param     DPSDK_CORE_ALARM_VEHICLEINFOUPLOAD_CHECKIN		= 217;		车载自定义信息上传 CheckIn
	@param     DPSDK_CORE_ALARM_VEHICLEINFOUPLOAD_CHECKOUT		= 218;		车载自定义信息上传 CheckOut
	@param     DPSDK_CORE_ALARM_MOTOR_END						= 299;

	@param     DPSDK_CORE_ALARM_IVS_ALARM_BEGIN					= 300;		智能设备报警类型在dhnetsdk.h基础上+300（DMS服务中添加）
	@param     DPSDK_CORE_ALARM_IVS_ALARM						= 301;		智能设备报警
	@param     DPSDK_CORE_ALARM_CROSSLINEDETECTION				= 302;		警戒线事件
	@param     DPSDK_CORE_ALARM_CROSSREGIONDETECTION 			= 303;		警戒区事件
	@param     DPSDK_CORE_ALARM_PASTEDETECTION					= 304;		贴条事件
	@param     DPSDK_CORE_ALARM_LEFTDETECTION					= 305;		物品遗留事件
	@param     DPSDK_CORE_ALARM_STAYDETECTION					= 306;		停留事件
	@param     DPSDK_CORE_ALARM_WANDERDETECTION					= 307;		徘徊事件
	@param     DPSDK_CORE_ALARM_PRESERVATION					= 308;		物品保全事件
	@param     DPSDK_CORE_ALARM_MOVEDETECTION					= 309;		移动事件
	@param     DPSDK_CORE_ALARM_TAILDETECTION					= 310;		尾随事件
	@param     DPSDK_CORE_ALARM_RIOTERDETECTION					= 311;		聚众事件
	@param     DPSDK_CORE_ALARM_FIREDETECTION					= 312;		火警事件
	@param     DPSDK_CORE_ALARM_SMOKEDETECTION					= 313;		烟雾报警事件
	@param     DPSDK_CORE_ALARM_FIGHTDETECTION					= 314;		斗殴事件
	@param     DPSDK_CORE_ALARM_FLOWSTAT						= 315;		流量统计事件
	@param     DPSDK_CORE_ALARM_NUMBERSTAT						= 316;		数量统计事件
	@param     DPSDK_CORE_ALARM_CAMERACOVERDDETECTION			= 317;		摄像头覆盖事件
	@param     DPSDK_CORE_ALARM_CAMERAMOVEDDETECTION			= 318;		摄像头移动事件
	@param     DPSDK_CORE_ALARM_VIDEOABNORMALDETECTION			= 319;		视频异常事件
	@param     DPSDK_CORE_ALARM_VIDEOBADDETECTION				= 320;		视频损坏事件
	@param     DPSDK_CORE_ALARM_TRAFFICCONTROL					= 321;		交通管制事件
	@param     DPSDK_CORE_ALARM_TRAFFICACCIDENT					= 322;		交通事故事件
	@param     DPSDK_CORE_ALARM_TRAFFICJUNCTION					= 323;		交通路口事件
	@param     DPSDK_CORE_ALARM_TRAFFICGATE						= 324;		交通卡口事件
	@param     DPSDK_CORE_ALARM_TRAFFICSNAPSHOT					= 325;		交通抓拍事件
	@param     DPSDK_CORE_ALARM_FACEDETECT						= 326;		人脸检测事件 
	@param     DPSDK_CORE_ALARM_TRAFFICJAM						= 327;		交通拥堵事件

	@param     DPSDK_CORE_ALARM_TRAFFIC_RUNREDLIGHT				= 0x00000100 + 300;	  	交通违章-闯红灯事件
	@param     DPSDK_CORE_ALARM_TRAFFIC_OVERLINE				= 0x00000101 + 300;	 	交通违章-压车道线事件
	@param     DPSDK_CORE_ALARM_TRAFFIC_RETROGRADE				= 0x00000102 + 300;	  	交通违章-逆行事件
	@param     DPSDK_CORE_ALARM_TRAFFIC_TURNLEFT				= 0x00000103 + 300;	  	交通违章-违章左转
	@param     DPSDK_CORE_ALARM_TRAFFIC_TURNRIGHT			    = 0x00000104 + 300;	  	交通违章-违章右转
	@param     DPSDK_CORE_ALARM_TRAFFIC_UTURN					= 0x00000105 + 300;	  	交通违章-违章掉头
	@param     DPSDK_CORE_ALARM_TRAFFIC_OVERSPEED				= 0x00000106 + 300;	  	交通违章-超速
	@param     DPSDK_CORE_ALARM_TRAFFIC_UNDERSPEED				= 0x00000107 + 300;	  	交通违章-低速
	@param     DPSDK_CORE_ALARM_TRAFFIC_PARKING					= 0x00000108 + 300;	  	交通违章-违章停车
	@param     DPSDK_CORE_ALARM_TRAFFIC_WRONGROUTE				= 0x00000109 + 300;	  	交通违章-不按车道行驶
	@param     DPSDK_CORE_ALARM_TRAFFIC_CROSSLANE				= 0x0000010A + 300;	  	交通违章-违章变道
	@param     DPSDK_CORE_ALARM_TRAFFIC_OVERYELLOWLINE			= 0x0000010B + 300;	  	交通违章-压黄线
	@param     DPSDK_CORE_ALARM_TRAFFIC_DRIVINGONSHOULDER		= 0x0000010C + 300;	  	交通违章-路肩行驶事件  
	@param     DPSDK_CORE_ALARM_TRAFFIC_YELLOWPLATEINLANE		= 0x0000010E + 300;	  	交通违章-黄牌车占道事件
	@param     DPSDK_CORE_ALARM_CROSSFENCEDETECTION				= 0x0000011F + 300;	  	翻越围栏事件
	@param     DPSDK_CORE_ALARM_ELECTROSPARKDETECTION			= 0X00000110 + 300;	  	电火花事件
	@param     DPSDK_CORE_ALARM_TRAFFIC_NOPASSING				= 0x00000111 + 300;	  	交通违章-禁止通行事件
	@param     DPSDK_CORE_ALARM_ABNORMALRUNDETECTION			= 0x00000112 + 300;	  	异常奔跑事件
	@param     DPSDK_CORE_ALARM_RETROGRADEDETECTION				= 0x00000113 + 300;	  	人员逆行事件
	@param     DPSDK_CORE_ALARM_INREGIONDETECTION				= 0x00000114 + 300;	  	区域内检测事件
	@param     DPSDK_CORE_ALARM_TAKENAWAYDETECTION				= 0x00000115 + 300;	  	物品搬移事件
	@param     DPSDK_CORE_ALARM_PARKINGDETECTION				= 0x00000116 + 300;	  	非法停车事件
	@param     DPSDK_CORE_ALARM_FACERECOGNITION					= 0x00000117 + 300;	  	人脸识别事件
	@param     DPSDK_CORE_ALARM_TRAFFIC_MANUALSNAP				= 0x00000118 + 300;	  	交通手动抓拍事件
	@param     DPSDK_CORE_ALARM_TRAFFIC_FLOWSTATE				= 0x00000119 + 300;	  	交通流量统计事件
	@param     DPSDK_CORE_ALARM_TRAFFIC_STAY					= 0x0000011A + 300;	  	交通滞留事件
	@param     DPSDK_CORE_ALARM_TRAFFIC_VEHICLEINROUTE			= 0x0000011B + 300;	  	有车占道事件
	@param     DPSDK_CORE_ALARM_MOTIONDETECT					= 0x0000011C + 300;	  	视频移动侦测事件
	@param     DPSDK_CORE_ALARM_LOCALALARM						= 0x0000011D + 300;	  	外部报警事件
	@param     DPSDK_CORE_ALARM_PRISONERRISEDETECTION			= 0X0000011E + 300;	  	看守所囚犯起身事件
	@param     DPSDK_CORE_ALARM_IVS_B_ALARM_END					= 0X0000011E + 301;	  	以上报警都为IVS_B服务的报警类型，与SDK配合
	@param     DPSDK_CORE_ALARM_VIDEODIAGNOSIS					= 0X00000120 + 300;	  	视频诊断结果事件
	@param     DPSDK_CORE_ALARM_IVS_V_ALARM                    	= 0X00000120 + 300;	  
	@param     DPSDK_CORE_ALARM_IVS_ALARM_END					= 1000;			 	  	智能设备报警类型的范围为300-1000
	@param     DPSDK_CORE_ALARM_OSD								= 1001;				  	osd信息
	@param     DPSDK_CORE_ALARM_CROSS_INFO						= 1002;				  	十字路口

	@param     DPSDK_CORE_ALARM_CLIENT_ALARM_BEGIN				= 1100;				  	客户端平台报警开始
	@param     DPSDK_CORE_ALARM_CLIENT_DERELICTION				= 1101;				  	遗留检测[交通事件-抛洒物]
	@param     DPSDK_CORE_ALARM_CLIENT_RETROGRADATION			= 1102;				  	逆行 [交通事件]
	@param     DPSDK_CORE_ALARM_CLIENT_OVERSPEED				= 1103;				  	超速  [交通事件]
	@param     DPSDK_CORE_ALARM_CLIENT_LACK_ALARM				= 1104;				  	欠速  [交通事件]
	@param     DPSDK_CORE_ALARM_CLIENT_FLUX_COUNT				= 1105;				  	流量统计[交通事件]
	@param     DPSDK_CORE_ALARM_CLIENT_PARKING					= 1106;				 	 停车检测[交通事件]
	@param     DPSDK_CORE_ALARM_CLIENT_PASSERBY					= 1107;				  	行人检测[交通事件]
	@param     DPSDK_CORE_ALARM_CLIENT_JAM						= 1108;				  	拥堵检测[交通事件]
	@param     DPSDK_CORE_ALARM_CLIENT_AREA_INBREAK				= 1109;				  	特殊区域入侵
	@param     DPSDK_CORE_ALARM_CLIENT_ALARM_END				= 1200;				  	客户端平台报警结束
*/

// 报警类型
public class dpsdk_alarm_type_e
{
	public static final int     DPSDK_CORE_ALARM_TYPE_Unknown				= 0;				     // 未知
	public static final int     DPSDK_CORE_ALARM_TYPE_VIDEO_LOST			= 1;				     // 视频丢失
	public static final int     DPSDK_CORE_ALARM_TYPE_EXTERNAL_ALARM		= 2;					 // 外部报警
	public static final int     DPSDK_CORE_ALARM_TYPE_MOTION_DETECT			= 3;					 // 移动侦测
	public static final int     DPSDK_CORE_ALARM_TYPE_VIDEO_SHELTER			= 4;					 // 视频遮挡
	public static final int     DPSDK_CORE_ALARM_TYPE_DISK_FULL				= 5;					 // 硬盘满
	public static final int     DPSDK_CORE_ALARM_TYPE_DISK_FAULT			= 6;					 // 硬盘故障
	public static final int     DPSDK_CORE_ALARM_TYPE_FIBER					= 7;					 // 光纤报警
	public static final int     DPSDK_CORE_ALARM_TYPE_GPS					= 8;					 // GPS信息
	public static final int     DPSDK_CORE_ALARM_TYPE_3G					= 9;					 // 3G
	public static final int     DPSDK_CORE_ALARM_TYPE_STATUS_RECORD			= 10;					 // 设备录像状态
	public static final int     DPSDK_CORE_ALARM_TYPE_STATUS_DEVNAME		= 11;					 // 设备名
	public static final int     DPSDK_CORE_ALARM_TYPE_STATUS_DISKINFO		= 12;					 // 硬盘信息
	public static final int     DPSDK_CORE_ALARM_TYPE_IPC_OFF				= 13;					 // 前端IPC断线

	//门禁
	public static final int     DPSDK_CORE_ALARM_DOOR_BEGIN				     = 40;		    	     // 门禁设备报警起始
	public static final int     DPSDK_CORE_ALARM_FORCE_CARD_OPENDOOR		 = 41;				     // 胁迫刷卡开门
	public static final int     DPSDK_CORE_ALARM_VALID_PASSWORD_OPENDOOR	 = 42;				     // 合法密码开门
	public static final int     DPSDK_CORE_ALARM_INVALID_PASSWORD_OPENDOOR	 = 43;				     // 非法密码开门
	public static final int     DPSDK_CORE_ALARM_FORCE_PASSWORD_OPENDOOR	 = 44;				     // 胁迫密码开门
	public static final int     DPSDK_CORE_ALARM_VALID_FINGERPRINT_OPENDOOR	 = 45;			         // 合法指纹开门
	public static final int     DPSDK_CORE_ALARM_INVALID_FINGERPRINT_OPENDOOR	= 46;				 // 非法指纹开门
	public static final int     DPSDK_CORE_ALARM_FORCE_FINGERPRINT_OPENDOOR	 = 47;				     // 胁迫指纹开门

	public static final int     DPSDK_CORE_ALARM_TYPE_VALID_CARD_READ		 = 51;				     // 合法刷卡/开门
	public static final int     DPSDK_CORE_ALARM_TYPE_INVALID_CARD_READ		 = 52;					 // 非法刷卡/开门
	public static final int     DPSDK_CORE_ALARM_TYPE_DOOR_MAGNETIC_ERROR	 = 53;					 // 门磁报警
	public static final int     DPSDK_CORE_ALARM_TYPE_DOOR_BREAK   			 = 54;					 // 破门报警和开门超时报警
	public static final int     DPSDK_CORE_ALARM_TYPE_DOOR_ABNORMAL_CLOSED	 = 55;					 // 门非正常关闭
	public static final int     DPSDK_CORE_ALARM_TYPE_DOOR_NORMAL_CLOSED	 = 56;					 // 门正常关闭
	public static final int     DPSDK_CORE_ALARM_TYPE_DOOR_OPEN				 = 57;					 // 门打开

	public static final int     DPSDK_CORE_ALARM_DOOR_OPEN_TIME_OUT_BEG		= 60;
	public static final int     DPSDK_CORE_ALARM_DOOR_OPEN_TIME_OUT_END		= 70;

	//报警主机
	public static final int     DPSDK_CORE_ALARM_TYPE_ALARM_CONTROL_ALERT	= 81;				     // 报警主机报警
	public static final int     DPSDK_CORE_ALARM_TYPE_FIRE_ALARM			= 82;					 // 火警
	public static final int     DPSDK_CORE_ALARM_TYPE_ZONE_DISABLED			= 83;					 // 防区失效
	public static final int     DPSDK_CORE_ALARM_TYPE_BATTERY_EMPTY			= 84;					 // 电池没电

	public static final int     DPSDK_CORE_ALARM_FILESYSTEM				    = 100;					 // 文件系统
	public static final int     DPSDK_CORE_ALARM_RAID_FAULT					= 101;					 // raid故障
	public static final int     DPSDK_CORE_ALARM_RECORDCHANNELFUNCTION_ABNORMAL 	= 102;			 // 录像通道功能异常
	public static final int     DPSDK_CORE_SVR_HARDDISK_STATUS	= 103;								 // 硬盘状态
	public static final int     DPSDK_CORE_ALARM_RECORD_REPAIR	= 104;								 // 录像补全 -P3.0

	//-M的相关报警在这里添加
	public static final int     DPSDK_CORE_ALARM_MOTOR_BEGIN					= 200;
	public static final int     DPSDK_CORE_ALARM_OVERSPEED_OCCURE				= 201; 			     // 超速报警产生
	public static final int     DPSDK_CORE_ALARM_OVERSPEED_DISAPPEAR  			= 202;				 // 超速报警消失
	public static final int     DPSDK_CORE_ALARM_DRIVEROUT_DRIVERALLOW			= 203;				 // 驶出行区
	public static final int     DPSDK_CORE_ALARM_DRIVERIN_DRIVERALLOW			= 204;				 // 驶入行区
	public static final int     DPSDK_CORE_ALARM_DRIVEROUT_FORBIDDRIVE			= 205;				 // 驶出禁入区
	public static final int     DPSDK_CORE_ALARM_DRIVERIN_FORBIDDRIVE			= 206;				 // 驶入禁入区
	public static final int     DPSDK_CORE_ALARM_DRIVEROUT_LOADGOODS			= 207;				 // 驶出装货区
	public static final int     DPSDK_CORE_ALARM_DRIVERIN_LOADGOODS				= 208;				 // 驶入装货区
	public static final int     DPSDK_CORE_ALARM_DRIVEROUT_UNLOADGOODS			= 209;				 // 驶出卸货区
	public static final int     DPSDK_CORE_ALARM_DRIVERIN_UNLOADGOODS			= 210;				 // 驶入卸货区
	public static final int     DPSDK_CORE_ALARM_CAR_OVER_LOAD					= 211;				 // 超载
	public static final int     DPSDK_CORE_ALARM_SPEED_SOON_ZERO				= 212;				 // 急刹车
	public static final int     DPSDK_CORE_ALARM_3GFLOW							= 213;				 // 3G流量
	public static final int     DPSDK_CORE_ALARM_AAC_POWEROFF					= 214;				 // ACC断电报警
	public static final int     DPSDK_CORE_ALARM_SPEEDLIMIT_LOWERSPEED			= 215;				 // 限速报警 LowerSpeed
	public static final int     DPSDK_CORE_ALARM_SPEEDLIMIT_UPPERSPEED			= 216;				 // 限速报警 UpperSpeed 
	public static final int     DPSDK_CORE_ALARM_VEHICLEINFOUPLOAD_CHECKIN		= 217;				 // 车载自定义信息上传 CheckIn
	public static final int     DPSDK_CORE_ALARM_VEHICLEINFOUPLOAD_CHECKOUT		= 218;				 // 车载自定义信息上传 CheckOut
	public static final int     DPSDK_CORE_ALARM_MOTOR_END						= 299;

	//智能报警
	public static final int     DPSDK_CORE_ALARM_IVS_ALARM_BEGIN				= 300;				 // 智能设备报警类型在dhnetsdk.h基础上+300（DMS服务中添加）
	public static final int     DPSDK_CORE_ALARM_IVS_ALARM						= 301;				 // 智能设备报警
	public static final int     DPSDK_CORE_ALARM_CROSSLINEDETECTION				= 302;				 // 警戒线事件
	public static final int     DPSDK_CORE_ALARM_CROSSREGIONDETECTION 			= 303;				 // 警戒区事件
	public static final int     DPSDK_CORE_ALARM_PASTEDETECTION					= 304;				 // 贴条事件
	public static final int     DPSDK_CORE_ALARM_LEFTDETECTION					= 305;				 // 物品遗留事件
	public static final int     DPSDK_CORE_ALARM_STAYDETECTION					= 306;				 // 停留事件
	public static final int     DPSDK_CORE_ALARM_WANDERDETECTION				= 307;				 // 徘徊事件
	public static final int     DPSDK_CORE_ALARM_PRESERVATION					= 308;				 // 物品保全事件
	public static final int     DPSDK_CORE_ALARM_MOVEDETECTION					= 309;				 // 移动事件
	public static final int     DPSDK_CORE_ALARM_TAILDETECTION					= 310;				 // 尾随事件
	public static final int     DPSDK_CORE_ALARM_RIOTERDETECTION				= 311;				 // 聚众事件
	public static final int     DPSDK_CORE_ALARM_FIREDETECTION					= 312;				 // 火警事件
	public static final int     DPSDK_CORE_ALARM_SMOKEDETECTION					= 313;				 // 烟雾报警事件
	public static final int     DPSDK_CORE_ALARM_FIGHTDETECTION					= 314;				 // 斗殴事件
	public static final int     DPSDK_CORE_ALARM_FLOWSTAT						= 315;				 // 流量统计事件
	public static final int     DPSDK_CORE_ALARM_NUMBERSTAT						= 316;				 // 数量统计事件
	public static final int     DPSDK_CORE_ALARM_CAMERACOVERDDETECTION			= 317;				 // 摄像头覆盖事件
	public static final int     DPSDK_CORE_ALARM_CAMERAMOVEDDETECTION			= 318;				 // 摄像头移动事件
	public static final int     DPSDK_CORE_ALARM_VIDEOABNORMALDETECTION			= 319;				 // 视频异常事件
	public static final int     DPSDK_CORE_ALARM_VIDEOBADDETECTION				= 320;				 // 视频损坏事件
	public static final int     DPSDK_CORE_ALARM_TRAFFICCONTROL					= 321;				 // 交通管制事件
	public static final int     DPSDK_CORE_ALARM_TRAFFICACCIDENT				= 322;				 // 交通事故事件
	public static final int     DPSDK_CORE_ALARM_TRAFFICJUNCTION				= 323;				 // 交通路口事件
	public static final int     DPSDK_CORE_ALARM_TRAFFICGATE					= 324;				 // 交通卡口事件
	public static final int     DPSDK_CORE_ALARM_TRAFFICSNAPSHOT				= 325;				 // 交通抓拍事件
	public static final int     DPSDK_CORE_ALARM_FACEDETECT						= 326;				 // 人脸检测事件 
	public static final int     DPSDK_CORE_ALARM_TRAFFICJAM						= 327;				 // 交通拥堵事件

	public static final int     DPSDK_CORE_ALARM_TRAFFIC_RUNREDLIGHT			= 0x00000100 + 300;	 // 交通违章-闯红灯事件
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_OVERLINE				= 0x00000101 + 300;	 // 交通违章-压车道线事件
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_RETROGRADE				= 0x00000102 + 300;	 // 交通违章-逆行事件
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_TURNLEFT				= 0x00000103 + 300;	 // 交通违章-违章左转
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_TURNRIGHT			    = 0x00000104 + 300;	 // 交通违章-违章右转
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_UTURN					= 0x00000105 + 300;	 // 交通违章-违章掉头
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_OVERSPEED				= 0x00000106 + 300;	 // 交通违章-超速
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_UNDERSPEED				= 0x00000107 + 300;	 // 交通违章-低速
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_PARKING				= 0x00000108 + 300;	 // 交通违章-违章停车
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_WRONGROUTE				= 0x00000109 + 300;	 // 交通违章-不按车道行驶
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_CROSSLANE				= 0x0000010A + 300;	 // 交通违章-违章变道
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_OVERYELLOWLINE			= 0x0000010B + 300;	 // 交通违章-压黄线
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_DRIVINGONSHOULDER		= 0x0000010C + 300;	 // 交通违章-路肩行驶事件  
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_YELLOWPLATEINLANE		= 0x0000010E + 300;	 // 交通违章-黄牌车占道事件
	public static final int     DPSDK_CORE_ALARM_CROSSFENCEDETECTION			= 0x0000011F + 300;	 // 翻越围栏事件
	public static final int     DPSDK_CORE_ALARM_ELECTROSPARKDETECTION			= 0X00000110 + 300;	 // 电火花事件
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_NOPASSING				= 0x00000111 + 300;	 // 交通违章-禁止通行事件
	public static final int     DPSDK_CORE_ALARM_ABNORMALRUNDETECTION			= 0x00000112 + 300;	 // 异常奔跑事件
	public static final int     DPSDK_CORE_ALARM_RETROGRADEDETECTION			= 0x00000113 + 300;	 // 人员逆行事件
	public static final int     DPSDK_CORE_ALARM_INREGIONDETECTION				= 0x00000114 + 300;	 // 区域内检测事件
	public static final int     DPSDK_CORE_ALARM_TAKENAWAYDETECTION				= 0x00000115 + 300;	 // 物品搬移事件
	public static final int     DPSDK_CORE_ALARM_PARKINGDETECTION				= 0x00000116 + 300;	 // 非法停车事件
	public static final int     DPSDK_CORE_ALARM_FACERECOGNITION				= 0x00000117 + 300;	 // 人脸识别事件
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_MANUALSNAP				= 0x00000118 + 300;	 // 交通手动抓拍事件
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_FLOWSTATE				= 0x00000119 + 300;	 // 交通流量统计事件
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_STAY					= 0x0000011A + 300;	 // 交通滞留事件
	public static final int     DPSDK_CORE_ALARM_TRAFFIC_VEHICLEINROUTE			= 0x0000011B + 300;	 // 有车占道事件
	public static final int     DPSDK_CORE_ALARM_MOTIONDETECT					= 0x0000011C + 300;	 // 视频移动侦测事件
	public static final int     DPSDK_CORE_ALARM_LOCALALARM						= 0x0000011D + 300;	 // 外部报警事件
	public static final int     DPSDK_CORE_ALARM_PRISONERRISEDETECTION			= 0X0000011E + 300;	 // 看守所囚犯起身事件
	public static final int     DPSDK_CORE_ALARM_IVS_B_ALARM_END				= 0X0000011E + 301;	 // 以上报警都为IVS_B服务的报警类型，与SDK配合
	public static final int     DPSDK_CORE_ALARM_VIDEODIAGNOSIS					= 0X00000120 + 300;	 // 视频诊断结果事件
	public static final int     DPSDK_CORE_ALARM_IVS_V_ALARM                    = 0X00000120 + 300;	 // 
	public static final int     DPSDK_CORE_ALARM_IVS_ALARM_END					= 1000;			 	 // 智能设备报警类型的范围为300-1000
	public static final int     DPSDK_CORE_ALARM_OSD							= 1001;				 // osd信息
	public static final int     DPSDK_CORE_ALARM_CROSS_INFO						= 1002;				 // 十字路口


	public static final int     DPSDK_CORE_ALARM_CLIENT_ALARM_BEGIN				= 1100;				 // 客户端平台报警开始
	public static final int     DPSDK_CORE_ALARM_CLIENT_DERELICTION				= 1101;				 // 遗留检测[交通事件-抛洒物]
	public static final int     DPSDK_CORE_ALARM_CLIENT_RETROGRADATION			= 1102;				 // 逆行 [交通事件]
	public static final int     DPSDK_CORE_ALARM_CLIENT_OVERSPEED				= 1103;				 // 超速  [交通事件]
	public static final int     DPSDK_CORE_ALARM_CLIENT_LACK_ALARM				= 1104;				 // 欠速  [交通事件]
	public static final int     DPSDK_CORE_ALARM_CLIENT_FLUX_COUNT				= 1105;				 // 流量统计[交通事件]
	public static final int     DPSDK_CORE_ALARM_CLIENT_PARKING					= 1106;				 // 停车检测[交通事件]
	public static final int     DPSDK_CORE_ALARM_CLIENT_PASSERBY				= 1107;				 // 行人检测[交通事件]
	public static final int     DPSDK_CORE_ALARM_CLIENT_JAM						= 1108;				 // 拥堵检测[交通事件]
	public static final int     DPSDK_CORE_ALARM_CLIENT_AREA_INBREAK			= 1109;				 // 特殊区域入侵
	public static final int     DPSDK_CORE_ALARM_CLIENT_ALARM_END				= 1200;				 // 客户端平台报警结束
	
	//动环(PE)报警-(SCS_ALARM_SWITCH_START 取名直接来自SCS动环文档)
	//系统工程动环增加报警类型public static final int     DPSDK_CORE_ALARM_SCS_BEGIN
	//开关量，不可控
	public static final int     DPSDK_CORE_ALARM_SCS_SWITCH_START				= 1800;
	public static final int     DPSDK_CORE_ALARM_SCS_INFRARED					= 1801;				// 红外对射告警
	public static final int     DPSDK_CORE_ALARM_SCS_SMOKE						= 1802;				// 烟感告警
	public static final int     DPSDK_CORE_ALARM_SCS_WATER						= 1803;             // 水浸告警
	public static final int     DPSDK_CORE_ALARM_SCS_COMPRESSOR					= 1804;           	// 压缩机故障告警
	public static final int     DPSDK_CORE_ALARM_SCS_OVERLOAD					= 1805;             // 过载告警
	public static final int     DPSDK_CORE_ALARM_SCS_BUS_ANOMALY				= 1806;          	// 母线异常
	public static final int     DPSDK_CORE_ALARM_SCS_LIFE						= 1807;             // 寿命告警
	public static final int     DPSDK_CORE_ALARM_SCS_SOUND						= 1808;             // 声音告警
	public static final int     DPSDK_CORE_ALARM_SCS_TIME						= 1809;             // 时钟告警
	public static final int     DPSDK_CORE_ALARM_SCS_FLOW_LOSS					= 1810;            	// 气流丢失告警
	public static final int     DPSDK_CORE_ALARM_SCS_FUSING						= 1811;             // 熔断告警
	public static final int     DPSDK_CORE_ALARM_SCS_BROWN_OUT					= 1812;            	// 掉电告警
	public static final int     DPSDK_CORE_ALARM_SCS_LEAKING					= 1813;             // 漏水告警
	public static final int     DPSDK_CORE_ALARM_SCS_JAM_UP						= 1814;             // 堵塞告警
	public static final int     DPSDK_CORE_ALARM_SCS_TIME_OUT					= 1815;             // 超时告警
	public static final int     DPSDK_CORE_ALARM_SCS_REVERSE_ORDER				= 1816;        		// 反序告警
	public static final int     DPSDK_CORE_ALARM_SCS_NETWROK_FAILURE			= 1817;      		// 组网失败告警
	public static final int     DPSDK_CORE_ALARM_SCS_UNIT_CODE_LOSE				= 1818;       		// 机组码丢失告警
	public static final int     DPSDK_CORE_ALARM_SCS_UNIT_CODE_DISMATCH			= 1819;   			// 机组码不匹配告警
	public static final int     DPSDK_CORE_ALARM_SCS_FAULT						= 1820;             // 故障告警
	public static final int     DPSDK_CORE_ALARM_SCS_UNKNOWN					= 1821;             // 未知告警
	public static final int     DPSDK_CORE_ALARM_SCS_CUSTOM						= 1822;             // 自定义告警
	public static final int     DPSDK_CORE_ALARM_SCS_NOPERMISSION				= 1823;         	// 无权限告警
	public static final int     DPSDK_CORE_ALARM_SCS_INFRARED_DOUBLE			= 1824;      		// 红外双鉴告警
	public static final int     DPSDK_CORE_ALARM_SCS_ELECTRONIC_FENCE			= 1825;     		// 电子围栏告警
	public static final int     DPSDK_CORE_ALARM_SCS_UPS_MAINS					= 1826;            	// 市电正常市电异常
	public static final int     DPSDK_CORE_ALARM_SCS_UPS_BATTERY				= 1827;          	// 电池正常电池异常
	public static final int     DPSDK_CORE_ALARM_SCS_UPS_POWER_SUPPLY			= 1828;     		// UPS正常输出旁路供电
	public static final int     DPSDK_CORE_ALARM_SCS_UPS_RUN_STATE				= 1829;        		// UPS正常UPS故障
	public static final int     DPSDK_CORE_ALARM_SCS_UPS_LINE_STYLE				= 1830;       		// UPS类型为在线式UPS类  型为后备式
	public static final int     DPSDK_CORE_ALARM_SCS_XC							= 1831;             // 小车
	public static final int     DPSDK_CORE_ALARM_SCS_DRQ						= 1832;             // 断路器
	public static final int     DPSDK_CORE_ALARM_SCS_GLDZ						= 1833;             // 隔离刀闸
	public static final int     DPSDK_CORE_ALARM_SCS_JDDZ						= 1834;             // 接地刀闸
	public static final int     DPSDK_CORE_ALARM_SCS_IN_END						= 1835;				// 请注意这个值，不用把他作为判断值；只标记说“开关量，不可控”结束；
	//因为接下来的“开关量，可控”没有开始标记如public static final int     DPSDK_CORE_ALARM_SCS_DOOR_START

	//开关量，可控，请注意接下来的public static final int     DPSDK_CORE_ALARM_SCS_DOOR_SWITCH这个不能作为BEGIN用
	public static final int     DPSDK_CORE_ALARM_SCS_DOOR_SWITCH				= 1850;					// 门禁控制器开关告警
	public static final int     DPSDK_CORE_ALARM_SCS_UPS_SWITCH					= 1851;					// UPS开关告警;
	public static final int     DPSDK_CORE_ALARM_SCS_DBCB_SWITCH				= 1852;          		// 配电柜开关告警
	public static final int     DPSDK_CORE_ALARM_SCS_ACDT_SWITCH				= 1853;          		// 空调开关告警
	public static final int     DPSDK_CORE_ALARM_SCS_DTPW_SWITCH				= 1854;          		// 直流电源开关告警
	public static final int     DPSDK_CORE_ALARM_SCS_LIGHT_SWITCH				= 1855;         		// 灯光控制器开关告警
	public static final int     DPSDK_CORE_ALARM_SCS_FAN_SWITCH					= 1856;           		// 风扇控制器开关告警
	public static final int     DPSDK_CORE_ALARM_SCS_PUMP_SWITCH				= 1857;          		// 水泵开关告警
	public static final int     DPSDK_CORE_ALARM_SCS_BREAKER_SWITCH				= 1858;       			// 刀闸开关告警
	public static final int     DPSDK_CORE_ALARM_SCS_RELAY_SWITCH				= 1859;         		// 继电器开关告警
	public static final int     DPSDK_CORE_ALARM_SCS_METER_SWITCH				= 1860;        			// 电表开关告警
	public static final int     DPSDK_CORE_ALARM_SCS_TRANSFORMER_SWITCH			= 1861;   				// 变压器开关告警
	public static final int     DPSDK_CORE_ALARM_SCS_SENSOR_SWITCH				= 1862;        			// 传感器开关告警
	public static final int     DPSDK_CORE_ALARM_SCS_RECTIFIER_SWITCH			= 1863;     			// 整流器告警
	public static final int     DPSDK_CORE_ALARM_SCS_INVERTER_SWITCH			= 1864;      			// 逆变器告警
	public static final int     DPSDK_CORE_ALARM_SCS_PRESSURE_SWITCH			= 1865;      			// 压力开关告警
	public static final int     DPSDK_CORE_ALARM_SCS_SHUTDOWN_SWITCH			= 1866;      			// 关机告警
	public static final int     DPSDK_CORE_ALARM_SCS_WHISTLE_SWITCH				= 1867;	   				// 警笛告警
	public static final int     DPSDK_CORE_ALARM_SCS_SWITCH_END					= 1868;
	//模拟量
	public static final int     DPSDK_CORE_ALARM_SCS_ANALOG_START				= 1880;
	public static final int     DPSDK_CORE_ALARM_SCS_TEMPERATURE				= 1881;					// 温度告警
	public static final int     DPSDK_CORE_ALARM_SCS_HUMIDITY					= 1882;             	// 湿度告警
	public static final int     DPSDK_CORE_ALARM_SCS_CONCENTRATION				= 1883;        			// 浓度告警
	public static final int     DPSDK_CORE_ALARM_SCS_WIND						= 1884;                 // 风速告警
	public static final int     DPSDK_CORE_ALARM_SCS_VOLUME						= 1885;               	// 容量告警
	public static final int     DPSDK_CORE_ALARM_SCS_VOLTAGE					= 1886;              	// 电压告警
	public static final int     DPSDK_CORE_ALARM_SCS_ELECTRICITY				= 1887;          		// 电流告警
	public static final int     DPSDK_CORE_ALARM_SCS_CAPACITANCE				= 1888;          		// 电容告警
	public static final int     DPSDK_CORE_ALARM_SCS_RESISTANCE					= 1889;           		// 电阻告警
	public static final int     DPSDK_CORE_ALARM_SCS_CONDUCTANCE				= 1890;          		// 电导告警
	public static final int     DPSDK_CORE_ALARM_SCS_INDUCTANCE					= 1891;           		// 电感告警
	public static final int     DPSDK_CORE_ALARM_SCS_CHARGE						= 1892;               	// 电荷量告警
	public static final int     DPSDK_CORE_ALARM_SCS_FREQUENCY					= 1893;            		// 频率告警
	public static final int     DPSDK_CORE_ALARM_SCS_LIGHT_INTENSITY			= 1894;      			// 发光强度告警(坎)
	public static final int     DPSDK_CORE_ALARM_SCS_PRESS						= 1895;                	// 力告警（如牛顿，千克力）
	public static final int     DPSDK_CORE_ALARM_SCS_PRESSURE					= 1896;             	// 压强告警（帕，大气压）
	public static final int     DPSDK_CORE_ALARM_SCS_HEAT_TRANSFER				= 1897;        			// 导热告警（瓦每平米）
	public static final int     DPSDK_CORE_ALARM_SCS_THERMAL_CONDUCTIVITY		= 1898; 				// 热导告警（kcal/(m*h*℃)）
	public static final int     DPSDK_CORE_ALARM_SCS_VOLUME_HEAT				= 1899;          		// 比容热告（kcal/(kg*℃)）
	public static final int     DPSDK_CORE_ALARM_SCS_HOT_WORK					= 1900;             	// 热功告警（焦耳）
	public static final int     DPSDK_CORE_ALARM_SCS_POWER						= 1901;                	// 功率告警（瓦）
	public static final int     DPSDK_CORE_ALARM_SCS_PERMEABILITY				= 1902;         		// 渗透率告警（达西）
	public static final int     DPSDK_CORE_ALARM_SCS_PROPERTION					= 1903;					// 比例（包括电压电流变比，功率因素，负载单位为%） 
	public static final int     DPSDK_CORE_ALARM_SCS_ENERGY						= 1904;					// 电能（单位为J）
	public static final int     DPSDK_CORE_ALARM_SCS_ANALOG_END					= 1905;
	public static final int     ALARM_SHANGHAI_JIHENG							= 5502;					//上海迹恒上报报警
};
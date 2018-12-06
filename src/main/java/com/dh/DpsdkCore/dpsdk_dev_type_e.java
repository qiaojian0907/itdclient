package com.dh.DpsdkCore;

public class dpsdk_dev_type_e {
	public static final int     DEV_TYPE_ENC_BEGIN			= 0;		// 编码设备
	public static final int     DEV_TYPE_DVR				= DEV_TYPE_ENC_BEGIN + 1;			// DVR
	public static final int     DEV_TYPE_IPC				= DEV_TYPE_ENC_BEGIN + 2;			// IPC
	public static final int     DEV_TYPE_NVS				= DEV_TYPE_ENC_BEGIN + 3;			// NVS
	public static final int     DEV_TYPE_MCD				= DEV_TYPE_ENC_BEGIN + 4;			// MCD
	public static final int		DEV_TYPE_MDVR				= DEV_TYPE_ENC_BEGIN + 5;			// MDVR
	public static final int		DEV_TYPE_NVR				= DEV_TYPE_ENC_BEGIN + 6;			// NVR
	public static final int		DEV_TYPE_SVR				= DEV_TYPE_ENC_BEGIN + 7;			// SVR
	public static final int		DEV_TYPE_PCNVR				= DEV_TYPE_ENC_BEGIN + 8;			// PCNVR；PSS自带的一个小型服务
	public static final int		DEV_TYPE_PVR				= DEV_TYPE_ENC_BEGIN + 9;			// PVR
	public static final int		DEV_TYPE_EVS				= DEV_TYPE_ENC_BEGIN + 10;			// EVS
	public static final int		DEV_TYPE_MPGS				= DEV_TYPE_ENC_BEGIN + 11;			// MPGS
	public static final int		DEV_TYPE_SMART_IPC			= DEV_TYPE_ENC_BEGIN + 12;			// SMART_IPC
	public static final int		DEV_TYPE_SMART_TINGSHEN		= DEV_TYPE_ENC_BEGIN + 13;			// 庭审主机
	public static final int		DEV_TYPE_SMART_NVR			= DEV_TYPE_ENC_BEGIN + 14;			// SMART_NVR
	public static final int		DEV_TYPE_PRC				= DEV_TYPE_ENC_BEGIN + 15;			// 防护舱
	public static final int		DEV_TYPE_JT808				= DEV_TYPE_ENC_BEGIN + 18;			// 部标JT808

	public static final int		DEV_TYPE_ENC_END			= 99;

	public static final int		DEV_TYPE_TVWALL_BEGIN		= 100;
	public static final int		DEV_TYPE_BIGSCREEN			= DEV_TYPE_TVWALL_BEGIN + 1;		// 大屏
	public static final int		DEV_TYPE_TVWALL_END			= 199;

	public static final int		DEV_TYPE_DEC_BEGIN			= 200;		// 解码设备
	public static final int		DEV_TYPE_NVD				= DEV_TYPE_DEC_BEGIN + 1;			// NVD
	public static final int		DEV_TYPE_SNVD				= DEV_TYPE_DEC_BEGIN + 2;			// SNVD
	public static final int		DEV_TYPE_UDS				= DEV_TYPE_DEC_BEGIN + 5;			// UDS
	public static final int		DEV_TYPE_DEC_END			=299;

	public static final int		DEV_TYPE_MATRIX_BEGIN		= 300;		// 矩阵设备
	public static final int		DEV_MATRIX_M60				= DEV_TYPE_MATRIX_BEGIN	+ 1;		// M60
	public static final int		DEV_MATRIX_NVR6000			= DEV_TYPE_MATRIX_BEGIN + 2;		// NVR6000
	public static final int		DEV_TYPE_MATRIX_END			= 399;

	public static final int		DEV_TYPE_IVS_BEGIN			= 400;		// 智能设备
	public static final int		DEV_TYPE_ISD				= DEV_TYPE_IVS_BEGIN + 1;			// ISD 智能球
	public static final int		DEV_TYPE_IVS_B				= DEV_TYPE_IVS_BEGIN + 2;			// IVS-B 行为分析服务
	public static final int		DEV_TYPE_IVS_V				= DEV_TYPE_IVS_BEGIN + 3;			// IVS-V 视频质量诊断服务
	public static final int		DEV_TYPE_IVS_FR				= DEV_TYPE_IVS_BEGIN + 4;			// IVS-FR 人脸识别服务
	public static final int		DEV_TYPE_IVS_PC				= DEV_TYPE_IVS_BEGIN + 5;			// IVS-PC 人流量统计服务
	public static final int		DEV_TYPE_IVS_M				= DEV_TYPE_IVS_BEGIN + 6;			// IVS_M 主从跟踪智能盒
	public static final int		DEV_TYPE_IVS_PC_BOX			= DEV_TYPE_IVS_BEGIN + 7;			// IVS-PC 智能盒 
	public static final int		DEV_TYPE_IVS_B_BOX			= DEV_TYPE_IVS_BEGIN + 8;			// IVS-B 智能盒
	public static final int		DEV_TYPE_IVS_M_BOX			= DEV_TYPE_IVS_BEGIN + 9;			// IVS-M 盒子
	public static final int		DEV_TYPE_IVS_PRC			= DEV_TYPE_IVS_BEGIN + 10;			// 防护舱
	public static final int		DEV_TYPE_IVS_END			= 499;

	public static final int		DEV_TYPE_BAYONET_BEGIN		= 500;		// -C相关设备
	public static final int		DEV_TYPE_CAPTURE			= DEV_TYPE_BAYONET_BEGIN + 1;		// 卡口设备
	public static final int		DEV_TYPE_SPEED				= DEV_TYPE_BAYONET_BEGIN + 2;		// 测速设备
	public static final int		DEV_TYPE_TRAFFIC_LIGHT		= DEV_TYPE_BAYONET_BEGIN + 3;		// 闯红灯设备
	public static final int		DEV_TYPE_INCORPORATE		= DEV_TYPE_BAYONET_BEGIN + 4;		// 一体化设备
	public static final int		DEV_TYPE_PLATEDISTINGUISH	= DEV_TYPE_BAYONET_BEGIN + 5;		// 车牌识别设备
	public static final int		DEV_TYPE_VIOLATESNAPPIC		= DEV_TYPE_BAYONET_BEGIN + 6;		// 违停检测设备
	public static final int		DEV_TYPE_PARKINGSTATUSDEV	= DEV_TYPE_BAYONET_BEGIN + 7;		// 车位检测设备
	public static final int		DEV_TYPE_ENTRANCE			= DEV_TYPE_BAYONET_BEGIN + 8;		// 出入口设备
	public static final int		DEV_TYPE_VIOLATESNAPBALL	= DEV_TYPE_BAYONET_BEGIN + 9;		// 违停抓拍球机
	public static final int		DEV_TYPE_THIRDBAYONET		= DEV_TYPE_BAYONET_BEGIN + 10;		// 第三方卡口设备
	public static final int		DEV_TYPE_ULTRASONIC			= DEV_TYPE_BAYONET_BEGIN + 11;		// 超声波车位检测器
	public static final int		DEV_TYPE_FACE_CAPTURE		= DEV_TYPE_BAYONET_BEGIN + 12;		// 人脸抓拍设备
	public static final int		DEV_TYPE_ITC_SMART_NVR		= DEV_TYPE_BAYONET_BEGIN + 13;		// 卡口智能NVR设备
	public static final int		DEV_TYPE_BAYONET_END		= 599;

	public static final int		DEV_TYPE_ALARM_BEGIN		= 600;		// 报警设备
	public static final int		DEV_TYPE_ALARMHOST			= DEV_TYPE_ALARM_BEGIN + 1;			// 报警主机
	public static final int		DEV_TYPE_ALARM_END			= 699;

	public static final int		DEV_TYPE_DOORCTRL_BEGIN		= 700;
	public static final int		DEV_TYPE_DOORCTRL_DOOR		= DEV_TYPE_DOORCTRL_BEGIN + 1;		// 门禁
	public static final int		DEV_TYPE_DOORCTRL_END		=799;

	public static final int		DEV_TYPE_PE_BEGIN			= 800;
	public static final int		DEV_TYPE_PE_PE				= DEV_TYPE_PE_BEGIN + 1;			// 动环
	public static final int		DEV_TYPE_PE_AE6016			= DEV_TYPE_PE_BEGIN + 2;			// AE6016设备
	public static final int		DEV_TYPE_PE_NVS				= DEV_TYPE_PE_BEGIN + 3;			// 带动环功能的NVS设备
	public static final int		DEV_TYPE_PE_END				=899;

	public static final int		DEV_TYPE_VOICE_BEGIN		= 900;		// ip对讲
	public static final int		DEV_TYPE_VOICE_MIKE			= DEV_TYPE_VOICE_BEGIN + 1;
	public static final int		DEV_TYPE_VOICE_NET			= DEV_TYPE_VOICE_BEGIN + 2;
	public static final int		DEV_TYPE_VOICE_END			=999;

	public static final int		DEV_TYPE_IP_BEGIN			= 1000;		// IP设备（通过网络接入的设备）
	public static final int		DEV_TYPE_IP_SCNNER			= DEV_TYPE_IP_BEGIN + 1;			// 扫描枪
	public static final int		DEV_TYPE_IP_SWEEP			= DEV_TYPE_IP_BEGIN + 2;			// 地磅
	public static final int		DEV_TYPE_IP_POWERCONTROL	= DEV_TYPE_IP_BEGIN + 3;			// 电源控制器
	public static final int		DEV_TYPE_IP_END				= 1099;

	public static final int		DEV_TYPE_MULTIFUNALARM_BEGIN= 1100;		// 多功能报警主机
	public static final int		DEV_TYPE_VEDIO_ALARMHOST	= DEV_TYPE_MULTIFUNALARM_BEGIN + 1;	// 视频报警主机
	public static final int		DEV_TYPE_MULTIFUNALARM_END	= 1199;

	public static final int		DEV_TYPE_SLUICE_BEGIN		= 1200;
	public static final int		DEV_TYPE_SLUICE_DEV			= DEV_TYPE_SLUICE_BEGIN + 1;		// 出入口道闸设备
	public static final int		DEV_TYPE_SLUICE_PARKING		= DEV_TYPE_SLUICE_BEGIN + 2;		// 停车场道闸设备
	public static final int		DEV_TYPE_SLUICE_STOPBUFFER	= DEV_TYPE_SLUICE_BEGIN + 3;		// 视频档车器
	public static final int		DEV_TYPE_SLUICE_END			= 1299;

	public static final int		DEV_TYPE_ELECTRIC_BEGIN		= 1300;
	public static final int		DEV_TYPE_ELECTRIC_DEV		= DEV_TYPE_ELECTRIC_BEGIN + 1;		// 电网设备
	public static final int		DEV_TYPE_ELECTRIC_END		= 1399;

	public static final int		DEV_TYPE_LED_BEGIN			= 1400;
	public static final int		DEV_TYPE_LED_DEV			= DEV_TYPE_LED_BEGIN + 1;			// LED屏设备
	public static final int		DEV_TYPE_LED_END			= 1499;

	public static final int		DEV_TYPE_VIBRATIONFIBER_BEGIN	= 1500;		
	public static final int		DEV_TYPE_VIBRATIONFIBER_DEV	= DEV_TYPE_VIBRATIONFIBER_BEGIN + 1;// 震动光纤设备 
	public static final int		DEV_TYPE_VIBRATIONFIBER_END = 1599;

	public static final int		DEV_TYPE_PATROL_BEGIN		= 1600;		
	public static final int		DEV_TYPE_PATROL_DEV			= DEV_TYPE_PATROL_BEGIN + 1;		// 巡更棒设备
	public static final int		DEV_TYPE_PATROL_SPOT		= DEV_TYPE_PATROL_BEGIN + 2;		// 巡更点设备
	public static final int		DEV_TYPE_PATROL_END			= 1699;

	public static final int		DEV_TYPE_SENTRY_BOX_BEGIN	= 1700;		
	public static final int		DEV_TYPE_SENTRY_BOX_DEV		= DEV_TYPE_SENTRY_BOX_BEGIN + 1;	// 哨位箱设备
	public static final int		DEV_TYPE_SENTRY_BOX_END		= 1799;

	public static final int		DEV_TYPE_COURT_BEGIN		= 1800;		
	public static final int		DEV_TYPE_COURT_DEV			= DEV_TYPE_COURT_BEGIN + 1;			// 庭审设备
	public static final int		DEV_TYPE_COURT_END			= 1899;

	public static final int		DEV_TYPE_VIDEO_TALK_BEGIN	= 1900;
	public static final int		DEV_TYPE_VIDEO_TALK_VTNC	= DEV_TYPE_VIDEO_TALK_BEGIN + 1; 
	public static final int		DEV_TYPE_VIDEO_TALK_VTO		= DEV_TYPE_VIDEO_TALK_BEGIN + 2;  
	public static final int		DEV_TYPE_VIDEO_TALK_VTH		= DEV_TYPE_VIDEO_TALK_BEGIN + 3;  
	public static final int		DEV_TYPE_VIDEO_TALK_END		= 1999;

	public static final int		DEV_TYPE_BROADCAST_BEGIN	= 2000;
	public static final int		DEV_TYPE_BROADCAST_ITC_T6700R = DEV_TYPE_BROADCAST_BEGIN + 1;	// ITC_T6700R广播设备
	public static final int		DEV_TYPE_BROADCAST_END		= 2099;

	public static final int		DEV_TYPE_VIDEO_RECORD_SERVER_BEGIN = 2100;
	public static final int		DEV_TYPE_VIDEO_RECORD_SERVER_BNVR	= DEV_TYPE_VIDEO_RECORD_SERVER_BEGIN + 1; // BNVR设备
	public static final int		DEV_TYPE_VIDEO_RECORD_SERVER_OE	= DEV_TYPE_VIDEO_RECORD_SERVER_BEGIN + 2; // 手术设备(operation equipment)
	public static final int		DEV_TYPE_VIDEO_RECORD_SERVER_END= 2199;

}

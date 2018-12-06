package com.dh.DpsdkCore;

//违章报警数据结构信息
public class Traffic_Alarm_Info_t {
	public byte[]						szCameraId	= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];		// 通道ID
	public byte[]						nPtsIp		= new byte[dpsdk_constant_value.DPSDK_CORE_BAY_IP_LEN];		// pts内网
	public byte[]						nPtsIpy		= new byte[dpsdk_constant_value.DPSDK_CORE_BAY_IP_LEN];		// pts外网
	public int							nPicPort;																// pic内网port
	public int							nPicPorty;																// pic外网port
	public int							type;																	// 违章类型,参考dpsdk_alarm_type_e
	public byte[]						szCarNum	= new byte[dpsdk_constant_value.DPSDK_CORE_CAR_NUM_LENGTH];	// 车牌
	public int							nLicentype;																// 车牌颜色类型
	public int							nCarColor;																// 车身颜色
	public int							nCarLogo;																// 车标类型
	public int							nWay;																	// 车道号
	public byte[]						szPicUrl0	= new byte[dpsdk_constant_value.DPSDK_CORE_BAY_URL_LEN];	// 图片URL0
	public byte[]						szPicUrl1	= new byte[dpsdk_constant_value.DPSDK_CORE_BAY_URL_LEN];	// 图片URL1
	public byte[]						szPicUrl2	= new byte[dpsdk_constant_value.DPSDK_CORE_BAY_URL_LEN];	// 图片URL2
	public byte[]						szPicUrl3	= new byte[dpsdk_constant_value.DPSDK_CORE_BAY_URL_LEN];	// 图片URL3
	public byte[]						szPicUrl4	= new byte[dpsdk_constant_value.DPSDK_CORE_BAY_URL_LEN];	// 图片URL4
	public byte[]						szPicUrl5	= new byte[dpsdk_constant_value.DPSDK_CORE_BAY_URL_LEN];	// 图片URL5
	public int							nPicGroupStoreID;														// 图片组存储ID
	public int							bNeedStore;																// 是否需存盘 0：不需存盘 1：需存盘
	public int							bStored;																// 是否已存盘 0：未存盘 1：已存盘int
	public int							nAlarmLevel;															// 报警级别
	public int							nAlarmTime;																// 报警发生时间,精度为秒，值为time(NULL)值
	public int							nChannel;																// 通道
	public byte[]						szDeviceId	= new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];		// 设备ID
	public byte[]						szDeviceName	= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_DEVICENAME_LEN];	// 设备ID
	public byte[]						szDeviceChnName	= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_CHNNAME_LEN];		// 设备ID
	public int							nCarType;																// 车类型
	public int							nCarSpeed;																// 车速
	public int							nCarLen;																// 车身长度单位
	public int							nCardirect;																// 行车方向
	public int							nMaxSpeed;																// 限制速度
	public int							nMinSpeed;																// 最低限制速度
	public int[]						nRtPlate	= new int[dpsdk_constant_value.DPSDK_CORE_COORDINATE_LEN];	// 车牌坐标
};
package com.dh.DpsdkCore;

//区间测速上报信息
public class Area_Detect_Info_t {
	public byte[]						szAreaId		= new byte[dpsdk_constant_value.DPSDK_CORE_AREA_ID_LEN];		// 区间ID 50
	public byte[]                       szAreaName		= new byte[dpsdk_constant_value.DPSDK_CORE_AREA_NAME_LEN];      // 区间名称 256
	public byte[]                       szStartDevId	= new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];         // 起始设备ID
	public int                          nStartChnNum;                                    								// 起始点通道号
	public byte[]                       szStartChnId	= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];         // 起始点通道ID 
	public byte[]                       szStartDevName	= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_CHNNAME_LEN]; // 起始点设备名,UTF8编码
	public byte[]                       szStartDevChnName	= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_CHNNAME_LEN];// 起始点通道名,UTF8编码
	public long                         nStartCapTime;                                   								// 起始点通过时间
	public int                          nStartCarSpeed;                                  								// 起始点通过速度
	public byte[]                       szStartPosId	= new byte[dpsdk_constant_value.DPSDK_CORE_POS_ID_LEN];         // 起始点卡点ID
	public byte[]                       szStartPosName	= new byte[dpsdk_constant_value.DPSDK_CORE_POS_NAME_LEN];		// 起始点卡点名
	public byte[]                       szEndDevId		= new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];         // 终止点设备ID
	public int                          nEndChnNum;                                      								// 终止点通道号
	public byte[]                       szEndChnId		= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];         // 终止点通道ID 
	public byte[]                       szEndDevName	= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_CHNNAME_LEN]; // 终止点设备名,UTF8编码
	public byte[]                       szEndDevChnName	= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_CHNNAME_LEN]; // 终止点通道名,UTF8编码
	public long                         nEndCapTime;                                     								// 终止点通过时间
	public int                          nEndCarSpeed;                                    								// 终止点通过速度
	public byte[]                       szEndPosId		= new byte[dpsdk_constant_value.DPSDK_CORE_POS_ID_LEN];         // 终止点卡点ID
	public byte[]                       szEndPosName	= new byte[dpsdk_constant_value.DPSDK_CORE_POS_NAME_LEN];       // 终止点卡点名
	public int                          nAreaRange;                                      								// 区间距离
	public int                          nMinSpeed;                                       								// 路段限速下限 
	public int                          nMaxSpeed;                                       								// 路段限速上限 
	public byte[]                       szCarNum		= new byte[dpsdk_constant_value.DPSDK_CORE_CAR_NUM_LENGTH];     // 车牌号码，UTF8编码
	public int                          nCarNumType;                                     								// 车牌类型
	public int                          nCarNumColor;                                    								// 车牌颜色
	public int                          nCarColor;                                       								// 车身颜色
	public int                          nCarType;                                        								// 车类型
	public int                          nCarLogo;                                        								// 车标类型
	public int                          nCarAvgSpeed;                                    								// 车辆平均速度
	public int                          nIsIllegalSpeed;                                 								// 是否超速或低速
	public int                          nPicNum;                                         								// 图片张数，最大支持6张
	public byte[]						szPicName0		= new byte[dpsdk_constant_value.DPSDK_CORE_FILEPATH_LEN];		// 图片文件命名0
	public byte[]						szPicName1		= new byte[dpsdk_constant_value.DPSDK_CORE_FILEPATH_LEN];		// 图片文件命名1
	public byte[]						szPicName2		= new byte[dpsdk_constant_value.DPSDK_CORE_FILEPATH_LEN];		// 图片文件命名2
	public byte[]						szPicName3		= new byte[dpsdk_constant_value.DPSDK_CORE_FILEPATH_LEN];		// 图片文件命名3
	public byte[]						szPicName4		= new byte[dpsdk_constant_value.DPSDK_CORE_FILEPATH_LEN];		// 图片文件命名4
	public byte[]						szPicName5		= new byte[dpsdk_constant_value.DPSDK_CORE_FILEPATH_LEN];		// 图片文件命名5
	public int[]                        nRtPlate		= new int[dpsdk_constant_value.DPSDK_CORE_COORDINATE_LEN];      // 车牌坐标,left,top, right, bottom,不能超过4位
	public byte[]                       szCarPlatePicURL= new byte[dpsdk_constant_value.DPSDK_CORE_FILEPATH_LEN];       // 车牌小图片URL
};
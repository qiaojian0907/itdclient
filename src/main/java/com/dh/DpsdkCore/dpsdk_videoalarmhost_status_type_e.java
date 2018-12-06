package com.dh.DpsdkCore;

//报警主机状态类型
public class dpsdk_videoalarmhost_status_type_e {
	public static final int ALARMHOSE_STATUS_ERROR 			= 0;		// 状态类型错误
	public static final int ALARMHOSE_STATUS__DEV_ARM 		= 1;		// 针对设备布防-1
	public static final int ALARMHOSE_STATUS__DEV_DISARM 	= 2;		// 针对设备撤防-2
	public static final int ALARMHOSE_STATUS__CHL_BYPASS 	= 3;		// 针对通道旁路-3
	public static final int ALARMHOSE_STATUS__CHL_DISBYPASS = 4;		// 针对通道取消旁路-4
	public static final int ALARMHOSE_STATUS__DEV_IN_ARM	= 5;		// 针对设备在家布防-5 add by djm 20131219
	public static final int ALARMHOSE_STATUS__DEV_OUT_ARM 	= 6;		// 针对设备外出布防-6 add by djm 20131219
}

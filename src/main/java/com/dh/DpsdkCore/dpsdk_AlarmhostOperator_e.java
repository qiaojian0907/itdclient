package com.dh.DpsdkCore;

//报警主机布防操作控制类型
public class dpsdk_AlarmhostOperator_e {
	public static final int     CONTROL_ERROR = 0;				// 控制类型错误
	public static final int     CONTROL_DEV_ARM = 1;			// 针对设备布防-1
	public static final int     CONTROL_DEV_DISARM = 2;			// 针对设备撤防-2
	public static final int     CONTROL_DEV_ARM_HOME = 3;		// 在家布防-3
	public static final int     CONTROL_DEV_ARM_OUT = 4;		// 外出布防-4
	public static final int     CONTROL_CHL_BYPASS = 5;			// 针对通道旁路-5
	public static final int     CONTROL_CHL_DISBYPASS = 6;		// 针对通道取消旁路-6
	public static final int     CONTROL_CHL_ARM_CLEAR = 7;		// 针对通道消警-7
}

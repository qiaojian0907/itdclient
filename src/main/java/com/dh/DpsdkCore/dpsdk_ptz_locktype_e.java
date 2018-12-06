package com.dh.DpsdkCore;

/** 云台锁类型
@param     DPSDK_CORE_PTZ_CMD_LOCK					= 1;				锁定当前摄像头
@param     DPSDK_CORE_PTZ_CMD_UNLOCK_ONE            = 2;				解锁当前摄像头
@param     DPSDK_CORE_PTZ_CMD_UNLOCK_ALL 			= 3;				解锁被该用户锁定的所有摄像头
*/

public class dpsdk_ptz_locktype_e
{
	public static final int     DPSDK_CORE_PTZ_CMD_LOCK						= 1;					 // 锁定当前摄像头
	public static final int     DPSDK_CORE_PTZ_CMD_UNLOCK_ONE 				= 2;					 // 解锁当前摄像头
	public static final int     DPSDK_CORE_PTZ_CMD_UNLOCK_ALL 				= 3;					 // 解锁被该用户锁定的所有摄像头
};
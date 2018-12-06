package com.dh.DpsdkCore;	

/** 云台方向控制信息
@param   szCameraId						通道ID
@param   nDirect						云台方向控制命令,参考类dpsdk_ptz_direct_e定义
@param   nStep							步长
@param   bStop							是否停止，0表示不停止，1表示停止
*/

public class Ptz_Direct_Info_t
{
	public byte[]	szCameraId	= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];		// 通道ID
	public int					nDirect;													// 云台方向控制命令,参考类dpsdk_ptz_direct_e定义
	public int					nStep;														// 步长	
	public boolean					bStop;													// 是否停止，0表示不停止，1表示停止
};
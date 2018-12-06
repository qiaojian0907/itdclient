package com.dh.DpsdkCore;

/** 云台预置点操作信息
@param   szCameraId					通道ID
@param   nCmd						预置点操作命令,参考类dpsdk_ptz_prepoint_cmd_e定义
@param   pPoints					预置点信息
*/

public class Ptz_Prepoint_Operation_Info_t
{
	public byte[]	szCameraId	= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];			// 通道ID
	public int			nCmd;																	// 预置点操作命令,参考类dpsdk_ptz_prepoint_cmd_e定义
	public Ptz_Single_Prepoint_Info_t pPoints = new Ptz_Single_Prepoint_Info_t();		// 预置点信息
};
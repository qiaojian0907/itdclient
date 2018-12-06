package com.dh.DpsdkCore;

/** 云台扩展命令信息
@param   szCameraId					通道ID
@param   nCmd						扩展命令,参考类dpsdk_ptz_extend_cmd_e定义
@param   nParam						参数
*/

public class Ptz_Extend_Command_Info_t
{
	public byte[]	szCameraId	= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];		// 通道ID
	public int				nCmd;															// 扩展命令,参考类dpsdk_ptz_extend_cmd_e定义
	public int								nParam;											// 参数
};
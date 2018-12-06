package com.dh.DpsdkCore;

/** 云台打开命令信息 目前包括灯光 雨刷 红外
@param   szCameraId					通道ID
@param   bOpen						是否开启，0表示不开启,1表示开启
*/

public class Ptz_Open_Command_Info_t
{
	public byte[]	szCameraId	= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];			// 通道ID
	public boolean								bOpen;											// 是否开启，0表示不开启,1表示开启
};
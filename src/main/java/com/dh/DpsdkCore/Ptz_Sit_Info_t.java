package com.dh.DpsdkCore;

/** 云台三维定位操作信息
@param   szCameraId					通道ID
@param   pointX						坐标值X
@param   pointY						坐标值Y
@param   pointZ						坐标值Z	
*/

public class Ptz_Sit_Info_t
{
	public byte[]	szCameraId	= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];		// 通道ID
	public int							pointX;												// 坐标值X
	public int							pointY;												// 坐标值Y
	public int							pointZ;												// 坐标值Z	
};
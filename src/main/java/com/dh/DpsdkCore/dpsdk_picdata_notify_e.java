package com.dh.DpsdkCore;

/** 图片监控数据回调类型
@param    DPSDK_CORE_PICINFO_RECIVE			   	= 0;					收到图片信息
@param    DPSDK_CORE_PICDATA_RECIVE		        = 1;					图片数据接收
@param    DPSDK_CORE_PICDATA_OVER		        = 2;					一组图片数据结束
*/

public class dpsdk_picdata_notify_e
{
	public static final int    DPSDK_CORE_PICINFO_RECIVE 	= 0;										     // 收到图片信息
	public static final int    DPSDK_CORE_PICDATA_RECIVE	= 1;										     // 图片数据接收
	public static final int    DPSDK_CORE_PICDATA_OVER		= 2;										     // 一组图片数据结束
};
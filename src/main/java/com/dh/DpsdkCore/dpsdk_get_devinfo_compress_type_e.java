package com.dh.DpsdkCore;


/** 获取组织结构是否采用压缩格式获取
@param   DPSDK_GET_DEVINFO_BY_UNCOMPRESS			采用非压缩方式获取设备信息
@param   DPSDK_GET_DEVINFO_BY_COMPRESSED			采用压缩方式获取设备信息	
*/

public class dpsdk_get_devinfo_compress_type_e
{
	public static final int 	DPSDK_GET_DEVINFO_BY_UNCOMPRESS = 0;		// 采用非压缩方式获取设备信息
	public static final int 	DPSDK_GET_DEVINFO_BY_COMPRESSED = 1;		// 采用压缩方式获取设备信息
};
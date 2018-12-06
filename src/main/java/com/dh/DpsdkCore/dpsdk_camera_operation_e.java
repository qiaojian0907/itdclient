package com.dh.DpsdkCore;

/** 云台图像控制命令
@param     DPSDK_CORE_PTZ_ADD_ZOOM       	= 0;		变倍+ 
@param     DPSDK_CORE_PTZ_ADD_FOCUS   		= 1;		变焦+
@param     DPSDK_CORE_PTZ_ADD_APERTURE 		= 2;		光圈+
@param     DPSDK_CORE_PTZ_REDUCE_ZOOM 		= 3;		变倍-
@param     DPSDK_CORE_PTZ_REDUCE_FOCUS 		= 4;		变焦-
@param     DPSDK_CORE_PTZ_REDUCE_APERTURE 	= 5;		光圈-
*/

public class dpsdk_camera_operation_e
{	
	public static final int     DPSDK_CORE_PTZ_ADD_ZOOM                      = 0;					 // 变倍+ 
	public static final int     DPSDK_CORE_PTZ_ADD_FOCUS                     = 1;					 // 变焦+
	public static final int     DPSDK_CORE_PTZ_ADD_APERTURE                  = 2;					 // 光圈+
	public static final int     DPSDK_CORE_PTZ_REDUCE_ZOOM 					 = 3;					 // 变倍-
	public static final int     DPSDK_CORE_PTZ_REDUCE_FOCUS 				 = 4;					 // 变焦-
	public static final int     DPSDK_CORE_PTZ_REDUCE_APERTURE 				 = 5;					 // 光圈-
};
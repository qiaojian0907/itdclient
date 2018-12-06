package com.dh.DpsdkCore;

/** 编码通道信息
@param   nCameraType		类型，参见CameraType_e
@param   szId				通道ID:设备ID+通道号	
@param   szName				名称
@param   nRight				权限信息
@param   nChnlType			通道类型
@param   szChnlSN			互联编码SN
@param   szLatitude			纬度
@param   szLongitude		经度
@param   szMulticastIp		组播IP
@param   nMulticastPort		组播端口
*/
public class Enc_Channel_Info_Ex_t 
{
	public int		nCameraType;		                        													// 类型，参见CameraType_e
	public byte[]	szId			= new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];							// 通道ID:设备ID+通道号
	public byte[]	szName			= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_DEVICENAME_LEN];				// 名称
	public long		nRight;																							// 权限信息
	public int		nChnlType;                                  													// 通道类型
	public int 		nStatus;
	public byte[]	szChnlSN		= new byte[dpsdk_constant_value.DPSDK_CORE_LEN*4];								// 互联编码SN
	public byte[]	szLatitude		= new byte[dpsdk_constant_value.DPSDK_CORE_LEN*4];								// 纬度
	public byte[]	szLongitude		= new byte[dpsdk_constant_value.DPSDK_CORE_LEN*4];								// 经度
	public byte[]	szMulticastIp	= new byte[dpsdk_constant_value.DPSDK_CORE_IP_LEN];								// 组播IP
	public int 		nMulticastPort;																					// 组播端口
}; 
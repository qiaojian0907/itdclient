package com.dh.DpsdkCore;

/** 获取组织个数请求信息
@param   szCoding					节点code
@param   nDepCount					组织个数
@param   nDeviceCount				设备个数
*/

public class Get_Dep_Count_Info_t 
{
	public byte[]	szCoding	= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_DGPCODE_LEN];			// 节点code
	public int						nDepCount;															// 组织个数
	public int						nDeviceCount;														// 设备个数
	public int						nChannelCount;														// 通道个数
}; 
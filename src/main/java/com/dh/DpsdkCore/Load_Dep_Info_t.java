package com.dh.DpsdkCore;

/** 分级加载组织请求信息
@param   szCoding					节点code
@param   nOperation					获取节点的深度,参考类dpsdk_dev_status_e定义
*/

public class Load_Dep_Info_t 
{
	public byte[]	szCoding	= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_DGPCODE_LEN];					// 节点code
	public int		nOperation;																// 获取节点的深度,参考类dpsdk_dev_status_e定义
}; 
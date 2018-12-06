package com.dh.DpsdkCore;

/** 组织信息
@param   szCoding		节点code
@param   szDepName		节点名称	
*/

public class Dep_Info_t 
{	
	public byte[]	szCoding	= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_DGPCODE_LEN];					// 节点code
	public byte[]	szDepName	= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_DGPNAME_LEN];					// 节点名称
}; 
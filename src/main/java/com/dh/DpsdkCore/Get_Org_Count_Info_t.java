package com.dh.DpsdkCore;

/** 获取组织个数请求信息
@param   szCoding					节点code
@param   nGroupCount				组织个数
*/

public class Get_Org_Count_Info_t
{
	public byte[]	szCoding	= new byte[dpsdk_constant_value.DPSDK_CORE_ORG_CODE_LEN];         	// 节点code
	public int						nGroupCount;						       						// 组织个数
};
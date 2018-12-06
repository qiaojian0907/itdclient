package com.dh.DpsdkCore;

/** 获取组织请求信息
@param   szCoding					节点code
@param   nOrgCount					组织个数
@param   pOrgInfo					组织信息，在外部创建，如果为NULL则只返回个数
*/
 
public class Get_Org_Info_t 
{
	public byte[]	szCoding	= new byte[dpsdk_constant_value.DPSDK_CORE_ORG_CODE_LEN];		// 节点code
	public int							nOrgCount;							       				// 组织个数
	public Org_Info_t pOrgInfo[];							       				// 组织信息，在外部创建，如果为NULL则只返回个数
	
	public Get_Org_Info_t(int nMaxOrgCount)
	{
		nOrgCount = nMaxOrgCount;
		pOrgInfo = new Org_Info_t[nOrgCount];
		for (int i = 0; i < nOrgCount; i++)
		{
			pOrgInfo[i] = new Org_Info_t();
		}		
	}
};
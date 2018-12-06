package com.dh.DpsdkCore;

/** 组织信息(扩展)
@param   szCoding		节点code
@param   szDepName		节点名称
@param   szModifyTime	节点修改时间
@param   szSN			唯一标识码	
@param   szMemo			备注信息
@param   nDepType		组织节点类型	
@param   nDepSort		组织排序
@param   nChargebooth	收费亭标志		
@param   nDepExtType	组织节点扩展类型	
*/

public class Dep_Info_Ex_t 
{	
	public byte[]	szCoding		= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_DGPCODE_LEN];			// 节点code
	public byte[]	szDepName		= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_DGPNAME_LEN];			// 节点名称
	public byte[]	szModifyTime	= new byte[dpsdk_constant_value.DPSDK_CORE_TIME_LEN];					// 节点修改时间
	public byte[]	szSN			= new byte[dpsdk_constant_value.DPSDK_CORE_ORG_SN_LEN];					// 唯一标识码
	public byte[]	szMemo			= new byte[dpsdk_constant_value.DPSDK_CORE_MEM_LEN];					// 备注信息 -->报警运营平台
	public int		nDepType;																				// 组织节点类型 -->报警运营平台
	public int		nDepSort;																				// 组织排序
	public int		nChargebooth;																			// 收费亭标志
	public int		nDepExtType;																			// 组织节点扩展类型
}; 
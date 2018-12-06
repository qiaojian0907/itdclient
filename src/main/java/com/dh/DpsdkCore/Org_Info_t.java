package com.dh.DpsdkCore;

/** 通用组织节点信息
@param   szCode						通用节点编码
@param   szName						通用节点名称
@param   szSN						通用节点唯一码
@param   szType						通用节点类型
@param   szGpsX						通用节点经度
@param   szGpsY						通用节点纬度
@param   szMemo						通用节点描述
@param   domainId					域ID
@param   state						状态
*/

public class Org_Info_t
{
	public byte[] 	szCode 		= new byte[dpsdk_constant_value.DPSDK_CORE_ORG_CODE_LEN];			  	// 通用节点编码
	public byte[] 	szName		= new byte[dpsdk_constant_value.DPSDK_CORE_ORG_NAME_LEN];		  		// 通用节点名称
	public byte[]  szSN		= new byte[dpsdk_constant_value.DPSDK_CORE_ORG_SN_LEN];			  			// 通用节点唯一码
	public byte[]  szType      = new byte[dpsdk_constant_value.DPSDK_CORE_ORG_TYPE_LEN];		  		// 通用节点类型
	public byte[]  szGpsX		= new byte[dpsdk_constant_value.DPSDK_CORE_ORG_GPS_LEN];			  	// 通用节点经度
	public byte[]  szGpsY		= new byte[dpsdk_constant_value.DPSDK_CORE_ORG_GPS_LEN];			  	// 通用节点纬度
	public byte[]  szMemo		= new byte[dpsdk_constant_value.DPSDK_CORE_ORG_MEMO_LEN];		  		// 通用节点描述
	public int	                        domainId;		                          	// 域ID
	public int	                        state;			                          	// 状态
};
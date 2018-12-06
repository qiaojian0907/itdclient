package com.dh.DpsdkCore;

/** 查询节点类型
@param    DPSDK_CORE_ORG_NODE_TYPE_GROUP			   		= 1;					 组织
@param    DPSDK_CORE_ORG_NODE_TYPE_DEPARTMENT		        = 2;					部门
@param    DPSDK_CORE_ORG_NODE_TYPE_MONITOR_AREA	        	= 3;					 监控区域
@param    DPSDK_CORE_ORG_NODE_TYPE_ADM_AREA		        	= 4;					行政辖区
@param    DPSDK_CORE_ORG_NODE_TYPE_PERSION		        	= 5;					人员
@param    DPSDK_CORE_ORG_NODE_TYPE_CHNDEPREL		        = 6;					 通道-部门关联表 
@param    DPSDK_CORE_ORG_NODE_TYPE_DEPAREAREL		        = 7;					部门-辖区关联表  
*/

public class dpsdk_org_node_e
{
	//DPSDK_CORE_ORG_NODE_TYPE_ALL			        = 0;				   // 查询全部（1~4）暂时不提供
	public static final int    DPSDK_CORE_ORG_NODE_TYPE_GROUP			        = 1;				   // 组织
	public static final int    DPSDK_CORE_ORG_NODE_TYPE_DEPARTMENT		        = 2;			       // 部门
	public static final int    DPSDK_CORE_ORG_NODE_TYPE_MONITOR_AREA	        = 3;				   // 监控区域
	public static final int    DPSDK_CORE_ORG_NODE_TYPE_ADM_AREA		        = 4;				   // 行政辖区

	public static final int    DPSDK_CORE_ORG_NODE_TYPE_PERSION		        	= 5;				   // 人员
	public static final int    DPSDK_CORE_ORG_NODE_TYPE_CHNDEPREL		        = 6;				   // 通道-部门关联表 
	public static final int    DPSDK_CORE_ORG_NODE_TYPE_DEPAREAREL		        = 7;				   // 部门-辖区关联表   
};
package com.dh.DpsdkCore;

/** 节点改变通知类型
@param     DPSDK_CORE_CHANGE_UNDEFINE		= 0;		未定义
@param     DPSDK_CORE_CHANGE_ADD_DEV		= 1;		增加设备			
@param     DPSDK_CORE_CHANGE_MODIFY_DEV		= 2;		修改设备
@param     DPSDK_CORE_CHANGE_DEL_DEV		= 3;		删除设备
@param     DPSDK_CORE_CHANGE_ADD_ORG		= 4;		增加组织
@param     DPSDK_CORE_CHANGE_MODIFY_ORG		= 5;		修改组织 
@param     DPSDK_CORE_CHANGE_DELETE_ORG		= 6;		删除组织 
*/
 
public class dpsdk_change_type_e
{
	public static final int     DPSDK_CORE_CHANGE_UNDEFINE					= 0;					 // 未定义
	public static final int     DPSDK_CORE_CHANGE_ADD_DEV					= 1;					 // 增加设备			
	public static final int     DPSDK_CORE_CHANGE_MODIFY_DEV				= 2;					 // 修改设备
	public static final int     DPSDK_CORE_CHANGE_DEL_DEV					= 3;					 // 删除设备
	public static final int     DPSDK_CORE_CHANGE_ADD_ORG					= 4;					 // 增加组织
	public static final int     DPSDK_CORE_CHANGE_MODIFY_ORG				= 5;					 // 修改组织 
	public static final int     DPSDK_CORE_CHANGE_DELETE_ORG				= 6;					 // 删除组织 
};
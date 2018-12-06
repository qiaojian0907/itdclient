package com.dh.DpsdkCore;

/** 设备信息
@param   szId						设备ID
@param   szName						名称
@param   szUser						用户名
@param   szPassword					密码		
@param   nPort						设备端口
@param   nFactory					厂商类型,参考类dpsdk_device_factory_type_e定义	
@param   nStatus					设备状态,参考类dpsdk_dev_status_e定义
@param   nEncChannelChildCount		编码子通道个数	
*/

public class Device_Info_t 
{	
	public byte[]	szId		= new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];							// 设备ID
	public byte[]	szName		= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_DEVICENAME_LEN];				// 名称
	public byte[]	szUser		= new byte[dpsdk_constant_value.DPSDK_CORE_USER_NAME_LEN];						// 用户名
	public byte[]	szPassword	= new byte[dpsdk_constant_value.DPSDK_CORE_PASSWORD_LEN];						// 密码
	public byte[]	szIP		= new byte[dpsdk_constant_value.DPSDK_CORE_IP_LEN];								// 设备IP
	public int		nPort;																						// 设备端口
	public int		nFactory;																					// 厂商类型,参考类dpsdk_device_factory_type_e定义
	public int		nStatus;																					// 设备状态,参考类dpsdk_dev_status_e定义
	public int		nEncChannelChildCount;																		// 编码子通道个数
	public int		nType;																						// 设备类型，参考类dpsdk_dev_type_e定义
}; 
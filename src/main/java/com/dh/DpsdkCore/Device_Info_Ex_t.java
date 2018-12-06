package com.dh.DpsdkCore;

public class Device_Info_Ex_t {
	public byte[]						szId = new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];				// 设备ID
	public byte[]						szName = new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_DEVICENAME_LEN];	// 名称
	public int							nFactory;																	// 厂商类型,参考类dpsdk_device_factory_type_e定义
	public int                          szModel;					                								// 模式
	public byte[]						szUser = new byte[dpsdk_constant_value.DPSDK_CORE_USER_NAME_LEN];			// 用户名
	public byte[]						szPassword = new byte[dpsdk_constant_value.DPSDK_CORE_PASSWORD_LEN];		// 密码
	public byte[]						szIP = new byte[dpsdk_constant_value.DPSDK_CORE_IP_LEN];					// 设备IP
	public int                          nDevType;						            								// 设备type
	public int							nPort;																		// 设备端口
	public int                          szLoginType;				                								// 登陆类型
	public byte[]	                    szRegID = new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];				// 主动注册设备ID
	public int			                nProxyPort;					                								// 代理端口
	public int			                nUnitNum;					                								// 单元数目--对于矩阵设备代表卡槽数
	public int							nStatus;																	// 设备状态,参考类dpsdk_dev_status_e定义
	public byte[]                       szCN = new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];				// 设备序列号
	public byte[]						szSN = new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];   	 		    // 互联编码SN
	public long                         nRight;						                								// 权限信息(只有IP对讲设备中的话筒才有)
	public byte[]						szDevIP = new byte[dpsdk_constant_value.DPSDK_CORE_IP_LEN];					// 设备真实IP
	public int                          nDevPort;					                								// 设备真实port
	public byte[]						dev_Maintainer = new byte[dpsdk_constant_value.DPSDK_CORE_USER_NAME_LEN];   // 设备联系人
	public byte[]						dev_MaintainerPh = new byte[dpsdk_constant_value.DPSDK_CORE_USER_NAME_LEN]; // 设备联系人号码
	public byte[]						dev_Location = new byte[dpsdk_constant_value.DPSDK_CORE_POS_NAME_LEN];      // 设备所在位置
	public byte[]						desc = new byte[dpsdk_constant_value.DPSDK_CORE_OPT_NOTE_LEN];              // 设备描述 
	public	int							nEncChannelChildCount;														// 编码子通道个数
	public	int							iAlarmInChannelcount;														// 报警输入通道个数
	public byte[]						szCallNum = new byte[dpsdk_constant_value.DPSDK_CORE_IP_LEN];				// 设备呼叫号码
}

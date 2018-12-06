package com.dh.DpsdkCore;

public class DPSDK_UserInfo_t {
	public int		iUserId;					// 用户id
	public int		iUserLevel;					// 用户等级
	public boolean	iUserOperFlag;				// true操作员false企业客户
	public byte[]	szCoding = new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_DGPCODE_LEN];        // 用户所在组织
	public byte[]	szCodeName = new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_DEVICENAME_LEN];	// 用户所在组织名称
}

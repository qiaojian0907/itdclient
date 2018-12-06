package com.dh.DpsdkCore;

/** 预案列表信息
 * 
 * @param status		预案状态 ,参考{@link dpsdk_alarmScheme_status_e}
 * @param id			预案数据库id
 * @param schemeName	预案名称
 * @param templateId	预案时间模板ID
 * @param desc			预案描述
 */
public class AlarmSchemeInfo_t {
	public int		status;																	// 预案状态
	public int		id;																		// 预案数据库id
	public byte[]	schemeName = new byte[dpsdk_constant_value.DPSDK_CORE_SCHEME_NAME_LEN];	// 预案名称
	public int		templateId;																// 预案时间模板ID
	public byte[]	desc = new byte[dpsdk_constant_value.DPSDK_CORE_SCHEME_DESC_LEN];		// 预案描述
}

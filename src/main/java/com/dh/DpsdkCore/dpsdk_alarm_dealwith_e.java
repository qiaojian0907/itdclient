package com.dh.DpsdkCore;

/** 报警处理类型
@param   ALARM_DEALWITH_PENDING			= 1;			处理中
@param   ALARM_DEALWITH_RESOLVE			= 2;			已解决
@param   ALARM_DEALWITH_SUGGESTTED		= 4;			误报
@param   ALARM_DEALWITH_IGNORED			= 8;			忽略		
@param   ALARM_DEALWITH_UNPROCESSED		= 16;			未解决
*/
 
public class dpsdk_alarm_dealwith_e
{
	public static final int    ALARM_DEALWITH_PENDING							= 1;			      // 处理中
	public static final int    ALARM_DEALWITH_RESOLVE							= 2;				  // 已解决
	public static final int    ALARM_DEALWITH_SUGGESTTED						= 4;				  // 误报
	public static final int    ALARM_DEALWITH_IGNORED							= 8;			      // 忽略	
	public static final int    ALARM_DEALWITH_UNPROCESSED						= 16;				  // 未解决
};
package com.dh.DpsdkCore;

/** 客户端报警上报信息
@param   szCameraId					报警通道ID
@param   enAlarmType				报警类型
@param   enStatus					事件状态
@param   uAlarmTime					报警时间
@param   szMsg						报警信息
*/

public class Client_Alarm_Info_t
{		
	public byte[] 	szCameraId 		= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];						// 报警通道ID
	public int 		enAlarmType;                         														// 报警类型，参考类dpsdk_alarm_type_e定义
	public int		enStatus;																					// 事件状态，参考类dpsdk_event_type_e定义
	public long		uAlarmTime;																					// 报警时间
	public byte[]  	szMsg  = new byte[dpsdk_constant_value.DPSDK_CORE_ALARM_MSG_LEN];                   		// 报警信息
};

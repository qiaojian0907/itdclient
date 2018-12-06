package com.dh.DpsdkCore;

public class Single_Alarm_Info_t {
	public int					nAlarmType;									// 报警类型  dpsdk_alarm_type_e
	public int					nEventType;									// 事件状态 dpsdk_event_type_e
	public byte[]				szDevId = new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];				// 报警设备ID
	public int					uChannel;									// 报警通道
	public long					uAlarmTime;									// 报警时间
	public int          		nDealWith;									// 处理意见 dpsdk_alarm_dealwith_e
	public byte[]				szMessage = new byte[dpsdk_constant_value.DPSDK_CORE_ALARM_MSG_LEN];		// 附加信息
	
	public Single_Alarm_Info_t()
	{
	}
}

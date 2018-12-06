package com.dh.DpsdkCore;

//单个报警方案
public class Alarm_Single_Enable_Info_t {
	public byte[]	szAlarmDevId = new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];	// 报警设备ID
	public int		nVideoNo;		// 视频通道 视频相关的报警 -1接收所有通道
	public int		nAlarmInput;	// 报警输入通道 报警输入相关的报警 -1接收所有通道
	public int		nAlarmType;		// 报警类型,参考dpsdk_alarm_type_e
}

package com.dh.DpsdkCore;

//单个报警方案(针对整个部门所有设备设置报警)
public class Alarm_Single_Enable_By_Dep_Info_t {
	public byte[]	szAlarmDepartmentCode = new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];	// 报警设备所属部门
	public int		nVideoNo;		// 视频通道 视频相关的报警 -1接收所有通道
	public int		nAlarmInput;	// 报警输入通道 报警输入相关的报警 -1接收所有通道
	public int		nAlarmType;		// 报警类型,参考dpsdk_alarm_type_e
}

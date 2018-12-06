package com.dh.DpsdkCore;

//获取报警输入通道请求信息
public class Get_AlarmInChannel_Info_t {
	public byte[]					szDeviceId = new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];	// 设备ID
	public int						nAlarmInChannelCount;												// 通道个数
	public AlarmIn_Channel_Info_t[]	pAlarmInChannelnfo;													// 通道信息

	public Get_AlarmInChannel_Info_t(int nMaxAlarmInChannelCount)
	{
		nAlarmInChannelCount = nMaxAlarmInChannelCount;
		pAlarmInChannelnfo = new AlarmIn_Channel_Info_t[nAlarmInChannelCount];	
		for(int i = 0;i < nAlarmInChannelCount;i++)
		{
			pAlarmInChannelnfo[i] = new AlarmIn_Channel_Info_t();
		}
	}
}

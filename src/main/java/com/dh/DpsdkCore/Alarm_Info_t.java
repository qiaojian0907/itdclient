package com.dh.DpsdkCore;

public class Alarm_Info_t {
	public int							nCount;										// 请求录像数
	public int						    nRetCount;									// 实际返回个数
	public Single_Alarm_Info_t[]		pAlarmInfo;									// 报警信息
	
	public Alarm_Info_t(int nMaxCount)
	{
		nRetCount = 0;
		nCount = nMaxCount;
		pAlarmInfo = new Single_Alarm_Info_t[nCount];
		for(int i = 0; i < nCount; i++)
		{
			pAlarmInfo[i] = new Single_Alarm_Info_t();
		}
	}
}

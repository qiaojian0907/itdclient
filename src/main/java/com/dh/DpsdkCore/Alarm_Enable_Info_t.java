package com.dh.DpsdkCore;

//报警方案
public class Alarm_Enable_Info_t {
	public int							nCount;										// 报警布控个数
	public Alarm_Single_Enable_Info_t[]	sources;									// 报警内容
	
	public Alarm_Enable_Info_t(int nMaxCount)
	{
		nCount = nMaxCount;
		sources = new Alarm_Single_Enable_Info_t[nCount];
		for(int i = 0; i < nCount; i++)
		{
			sources[i] = new Alarm_Single_Enable_Info_t();
		}
	}
}

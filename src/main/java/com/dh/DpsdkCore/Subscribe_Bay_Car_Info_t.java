package com.dh.DpsdkCore;

//订阅卡口过车(或区间测速)信息请求信息
public class Subscribe_Bay_Car_Info_t {
	public int							nChnlCount;									// 订阅通道的数量
	public Enc_Channel_Info_t[]			pEncChannelnfo;								// 通道信息
	public int							nSubscribeFlag;								// 订阅标记。0:取消订阅，1：订阅
	
	public Subscribe_Bay_Car_Info_t(int nMaxCount)
	{
		nChnlCount = nMaxCount;
		pEncChannelnfo = new Enc_Channel_Info_t[nChnlCount];
		for(int i = 0; i < nChnlCount; i++)
		{
			pEncChannelnfo[i] = new Enc_Channel_Info_t();
		}
	}
}
package com.dh.DpsdkCore;

public class Get_PosChannel_Info_t {
	public byte[]	szDeviceId = new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];	// 设备ID
	public int							nPosChannelChildCount;							// 通道个数
	public Pos_Channel_Info_t pPosChannelnfo[];								// 通道信息
	
	public Get_PosChannel_Info_t(int nMaxPosChannelChildCount)
	{
		nPosChannelChildCount = nMaxPosChannelChildCount;
		pPosChannelnfo = new Pos_Channel_Info_t[nPosChannelChildCount];
		
		for(int i = 0;i < nPosChannelChildCount;i++)
		{
			pPosChannelnfo[i] = new Pos_Channel_Info_t();
		}
	}
}

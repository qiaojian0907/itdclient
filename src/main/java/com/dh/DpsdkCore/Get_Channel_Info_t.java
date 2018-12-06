package com.dh.DpsdkCore;

/** 获取通道请求信息
@param   szDeviceId					设备ID
@param   nEncChannelChildCount		通道个数
@param   pEncChannelnfo				通道信息
*/

public class Get_Channel_Info_t 
{
	public byte[]	szDeviceId = new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];							// 设备ID
	public int							nEncChannelChildCount;								// 通道个数
	public Enc_Channel_Info_t				pEncChannelnfo[];								// 通道信息
	
	public Get_Channel_Info_t(int nMaxEncChannelChildCount)
	{
		nEncChannelChildCount = nMaxEncChannelChildCount;
		pEncChannelnfo = new Enc_Channel_Info_t[nEncChannelChildCount];
		
		for(int i = 0;i < nEncChannelChildCount;i++)
		{
			pEncChannelnfo[i] = new Enc_Channel_Info_t();
		}
	}
};
package com.dh.DpsdkCore;

public class Pos_Channel_Info_t {
	public byte[]	szId		= new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];							// 通道ID:设备ID+通道号
	public byte[]	szName		= new byte[dpsdk_constant_value.DPSDK_CORE_DGROUP_DEVICENAME_LEN];				// 名称
	public byte[]	szLinkChnl		= new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];						// POS通道的绑定视频源
}

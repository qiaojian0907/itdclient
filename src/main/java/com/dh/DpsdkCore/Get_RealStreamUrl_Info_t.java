package com.dh.DpsdkCore;

/** 获取实时流URL信息
@param   szCameraId					通道ID
@param   nStreamType				码流类型,参考类dpsdk_stream_type_e定义
@param   nMediaType					媒体类型,参考类dpsdk_media_type_e定义
@param   nTransType					传输类型,参考类dpsdk_trans_type_e定义
@param   szUrl						URL信息
@param	 nToken						令牌
@param	 nTrackId					轨道ID
*/

public class Get_RealStreamUrl_Info_t
{
	public byte[]	szCameraId	= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];		// 通道ID
	public int				nStreamType;													// 码流类型,参考类dpsdk_stream_type_e定义
	public int				nMediaType;														// 媒体类型,参考类dpsdk_media_type_e定义
	public int				nTransType;														// 传输类型,参考类dpsdk_trans_type_e定义
	public byte[]	szUrl		= new byte[dpsdk_constant_value.DPSDK_TAG_URL_LEN];			// URL信息
	public int				nToken;															// 令牌
	public int				nTrackId;														// 轨道ID
};
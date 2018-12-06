package com.dh.DpsdkCore;

/** 获取码流信息
@param   szCameraId					通道ID
@param   nRight						是否检测权限,参考类dpsdk_check_right_e定义
@param   nStreamType				码流类型,参考类dpsdk_stream_type_e定义
@param   nMediaType					媒体类型,参考类dpsdk_media_type_e定义
@param   nTransType					传输类型,参考类dpsdk_trans_type_e定义
*/

// 获取码流信息
public class Get_RealStream_Info_t
{
	public byte[]	szCameraId	= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];		// 通道ID
	public int					nRight;														// 是否检测权限,参考类dpsdk_check_right_e定义
	public int					nStreamType;												// 码流类型,参考类dpsdk_stream_type_e定义
	public int					nMediaType;													// 媒体类型,参考类dpsdk_media_type_e定义
	public int					nTransType;													// 传输类型,参考类dpsdk_trans_type_e定义
	public int					nTrackID;												// 拉流TrackID,默认0
};
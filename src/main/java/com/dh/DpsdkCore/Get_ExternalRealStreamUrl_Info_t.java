package com.dh.DpsdkCore;

/** 获取对外媒体流URL信息
@param   szCameraId					通道ID
@param   nStreamType				码流类型,参考类dpsdk_stream_type_e定义
@param   nMediaType					媒体类型,参考类dpsdk_media_type_e定义
@param   nTransType					传输类型,参考类dpsdk_trans_type_e定义
@param   nTrackId					轨道ID,参考类dpsdk_trackid_type_e定义
@param   bUsedVCS					需要VCS转码,0表示不需要，1表示需要
@param   nVcsVideocodec				码流转码后的视频编码格式, bUsedVCS为1有效,参考类dpsdk_videocodec_type_e定义
@param   nVcsResolution				码流的视频分辨率，bUsedVCS为1有效,参考类dpsdk_resolution_type_e定义
@param   nVcsfps					码流的帧率，bUsedVCS为1有效
@param   nVcsbps					码流的码率，bUsedVCS为1有效
@param   szUrl						URL信息
*/

public class Get_ExternalRealStreamUrl_Info_t
{
	public byte[]	szCameraId	= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];		// 通道ID
	public int	            nStreamType;					            					// 码流类型,参考类dpsdk_stream_type_e定义
	public int	            nMediaType;						            					// 媒体类型,参考类dpsdk_media_type_e定义
	public int	            nTransType;						            					// 传输类型,参考类dpsdk_trans_type_e定义
	public int             nTrackId;                                   						// 轨道ID,参考类dpsdk_trackid_type_e定义
	public int             bUsedVCS;                                   						// 需要VCS转码,0表示不需要，1表示需要
	public int          	nVcsVideocodec;                             					// 码流转码后的视频编码格式, bUsedVCS为1有效,参考类dpsdk_videocodec_type_e定义
	public int          	nVcsResolution;                             					// 码流的视频分辨率，bUsedVCS为1有效,参考类dpsdk_resolution_type_e定义
	public int             nVcsfps;                                    						// 码流的帧率，bUsedVCS为1有效
	public int             nVcsbps;                                    						// 码流的码率，bUsedVCS为1有效
	public byte[]	szUrl		= new byte[dpsdk_constant_value.DPSDK_TAG_URL_LEN];		    // URL信息
};
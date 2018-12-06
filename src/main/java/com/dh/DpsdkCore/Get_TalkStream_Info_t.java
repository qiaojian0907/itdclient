package com.dh.DpsdkCore;	

/** 按时间获取录像码流信息
@param   szCameraId						设备ID或通道ID
@param   nAudioType						音频类型,参考类dpsdk_audio_type_e定义
@param   nTalkType						设备类型（通道或设备）,参考类dpsdk_talk_type_e定义
@param   nBitsType						位数,参考类dpsdk_talk_bits_e定义  
@param   nSampleType					采样率类型,参考类Talk_Sample_Rate_e定义
@param   nTransType						传输类型,参考类dpsdk_trans_type_e定义
*/

// 获取语音信息
public class Get_TalkStream_Info_t
{
	public byte[]	szCameraId	= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];		// 设备ID或通道ID
	public int                 nAudioType;                                 					// 音频类型,参考类dpsdk_audio_type_e定义		  
	public int                 nTalkType;                                  					// 设备类型（通道或设备）,参考类dpsdk_talk_type_e定义
	public int					nBitsType;								    				// 位数,参考类dpsdk_talk_bits_e定义
	public int					nSampleType;												// 采样率类型,参考类Talk_Sample_Rate_e定义
	public int					nTransType;													// 传输类型,参考类dpsdk_trans_type_e定义
};

package com.dh.DpsdkCore;

/** 发送音频流信息
@param   pCallBackFun				语音采集回调函数地址值
@param   pData						通道ID
@param   nLen						音频流数据长度
@param   nAudioType					音频类型,请参考dpsdk_audio_type_e类型声明,目前只支持PCM格式	
@param   nTalkBits					位数,请参考dpsdk_talk_bits_e类型声明
@param   nSampleRate				采样率,请参考Talk_Sample_Rate_e类型声明
@param   pUserParam					语音采集回调参数值
*/

public class Send_Audio_Data_Info_t 
{
	public long pCallBackFun;			// 语音采集回调函数地址值
	public byte	pData[];				// 通道ID
	public int nLen;					// 音频流数据长度
	public int nAudioType;				// 音频类型,请参考dpsdk_audio_type_e类型声明,目前只支持PCM格式
	public int nTalkBits;				// 位数,请参考dpsdk_talk_bits_e类型声明
	public int nSampleRate;				// 采样率,请参考Talk_Sample_Rate_e类型声明	
	public long pUserParam;				// 语音采集回调参数值
	
	public Send_Audio_Data_Info_t(int nMaxDataLen)
	{
		nLen = nMaxDataLen; 			
		pData = new byte[nLen];			
	}
}; 
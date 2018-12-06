package com.dh.DpsdkCore;

/** 媒体数据回调.
 @param   IN									nPDLLHandle				SDK句柄
 @param   IN									nSeq					对应请求时返回的Seq
 @param   IN									nMediaType				媒体类型，参考dpsdk_media_type_e
 @param	  IN									szNodeId				数据对应的通道/设备ID
 @param	  IN 									nParamVal				扩展值;mediaType为real时，为streamType;
 @param	  IN 									szData					媒体流数据
 @param   IN 									nDataLen				数据长度 
 @remark									
*/

public interface fMediaDataCallback {
	public void invoke(int nPDLLHandle, int nSeq, int nMediaType, byte[] szNodeId, int nParamVal, byte[] szData, int nDataLen);
}
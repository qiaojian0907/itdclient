package com.dh.DpsdkCore;

/** 录像转码完成回调.
@param   IN									nPDLLHandle				SDK句柄
@param   IN									nPlaybackSeq            录像转码的序列号
@remark									
*/
public interface fSaveRecordFinishedCallback{
	public void invoke(int nPDLLHandle, int nPlaybackSeq);
}
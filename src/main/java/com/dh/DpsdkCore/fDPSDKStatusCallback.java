package com.dh.DpsdkCore;

/** DPSDK 状态回调.
@param   IN									nPDLLHandle				SDK句柄
@param   IN									nStatus					参考dpsdk_status_type_e
@remark									
*/
public interface fDPSDKStatusCallback {
	public void invoke(int nPDLLHandle, int nStatus);
}
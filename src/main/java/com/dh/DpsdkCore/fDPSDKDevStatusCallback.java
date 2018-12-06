package com.dh.DpsdkCore;

/** 设备状态回调.
 @param   IN									nPDLLHandle		        SDK句柄
 @param   IN									szDeviceId              设备ID（DVR+通道）
 @param   IN									nStatus		            参考dpsdk_device_status_type_e
 @remark									
*/
public interface fDPSDKDevStatusCallback {
	public void invoke(int nPDLLHandle, byte[] szDeviceId, int nStatus);
}
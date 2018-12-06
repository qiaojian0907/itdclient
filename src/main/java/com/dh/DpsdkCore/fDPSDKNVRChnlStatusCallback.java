package com.dh.DpsdkCore;

/** NVR通道状态回调函数
@param   IN           nPDLLHandle               SDK句柄
@param   IN           szCameraId                通道ID
@param   IN           nStatus                	通道状态
*/
public interface fDPSDKNVRChnlStatusCallback {
	public void invoke(int nPDLLHandle, byte[] szCameraId, int nStatus);
}

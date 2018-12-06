package com.dh.DpsdkCore;

/** 车载设备远程抓拍回调
@param   IN           nPDLLHandle               SDK句柄
@param   IN           szCameraId                通道ID
@param   IN           szFullPath                文件全路径名
*/
public interface fDPSDKRemoteDeviceSnapCallback {
	public void invoke(int nPDLLHandle, byte[] szCameraId, byte[] szFullPath);
}

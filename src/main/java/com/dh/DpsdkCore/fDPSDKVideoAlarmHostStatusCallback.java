package com.dh.DpsdkCore;

/** 视频报警主机布撤防/旁路状态回调
@param	  IN	                                nPDLLHandle		    SDK句柄
@param	  IN	                                szDeviceId			设备Id
@param	  IN	                                nChannelNO			通道号，设备操作通道号是-1
@param	  IN	                                nStatus				状态，参考dpsdk_videoalarmhost_status_type_e
视频报警主机在客户端登陆的时候DMS会上报状态，客户端操作会通知其他客户端。
*/
public interface fDPSDKVideoAlarmHostStatusCallback {
	public void invoke(int nPDLLHandle, byte[] szDeviceId, int nChannelNO, int nStatus);
}

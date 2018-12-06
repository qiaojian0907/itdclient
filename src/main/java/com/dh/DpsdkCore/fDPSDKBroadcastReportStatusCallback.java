package com.dh.DpsdkCore;

/** 业翔广播通道状态回调
@param	  IN	                                nPDLLHandle		    SDK句柄
@param	  IN	                                szCameraId			通道id
@param	  IN	                                nRType				上报类型，参考dpsdk_broadcast_report_type_e，1500业翔广播故障消息，1501业翔广播播放状态消息
@param	  IN	                                nTime				上报时间
@param	  IN	                                nStatus				状态，对于业翔对讲通道故障消息 1产生 2消失；对于业翔对讲通道播放状态 1播放 2停止
网络报警主机状态要自己查询，客户端操作会通知其他客户端。
*/
public interface fDPSDKBroadcastReportStatusCallback {
	public void invoke(int nPDLLHandle, byte[] szCameraId, int nRType, long nTime, int nStatus);
}

package com.dh.DpsdkCore;

/** 网络报警主机布撤防/旁路状态回调
@param	  IN	                                nPDLLHandle		    SDK句柄
@param	  IN	                                szDeviceId			布撤防时是设备Id;旁路/取消旁路时是通道id
@param	  IN	                                nRType				上报类型，参考dpsdk_netalarmhost_report_type_e，1布防，2旁路
@param	  IN	                                nOperType			操作类型，参考dpsdk_netalarmhost_operator_e，1设备操作，2通道操作
@param	  IN	                                nStatus				状态，对于防区状态1布防2撤防；对于旁路状态1旁路2取消旁路
网络报警主机状态要自己查询，客户端操作会通知其他客户端。
*/
public interface fDPSDKNetAlarmHostStatusCallback {
	public void invoke(int nPDLLHandle, byte[] szDeviceId, int nRType, int nOperType, int nStatus);
}

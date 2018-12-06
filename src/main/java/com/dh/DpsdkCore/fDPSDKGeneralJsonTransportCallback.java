package com.dh.DpsdkCore;

/** Json传输协议回调
@param szJson	Json字符串
*/
public interface fDPSDKGeneralJsonTransportCallback {
	public void invoke(int nPDLLHandle, byte[] szJson);
}

package com.dh.DpsdkCore;

/** 卡口过车信息上报回调函数定义
    @param IN                                    nPDLLHandle              SDK句柄
    @param IN                                    pUserParam               用户指针参数,由对应的DPSDK_SetxxxxCallBack传入
	@remark	参数定义请参考Bay_Car_Info_t
*/
public interface fDPSDKGetBayCarInfoCallbackEx{
	public void invoke(int nPDLLHandle, byte[] szDeviceId, int nDeviceIdLen, int nDevChnId, byte[] szChannelId, int nChannelIdLen, byte[] szDeviceName, int nDeviceNameLen, byte[] szDeviceChnName, int nChanNameLen, byte[] szCarNum, int nCarNumLen, int nCarNumType, int nCarNumColor, int nCarSpeed, int nCarType, int nCarColor, int nCarLen, int nCarDirect, int nWayId, long lCaptureTime, long lPicGroupStoreID, int nIsNeedStore, int nIsStoraged, byte[] szCaptureOrg, int nCaptureOrgLen, byte[] szOptOrg, int nOptOrgLen, byte[] szOptUser, int nOptUserLen, byte[] szOptNote, int nOptNoteLen, byte[] szImg0Path, int nImg0PathLen, byte[] szImg1Path, int nImg1PathLen, byte[] szImg2Path, int nImg2PathLen, byte[] szImg3Path, int nImg3PathLen, byte[] szImg4Path, int nImg4PathLen, byte[] szImg5Path, int nImg5PathLen, byte[] szImgPlatePath, int nImgPlatePathLen, int icarLog, int iPlateLeft, int iPlateRight, int iPlateTop, int iPlateBottom);
}
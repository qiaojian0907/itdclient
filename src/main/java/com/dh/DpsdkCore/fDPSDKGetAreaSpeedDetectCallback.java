package com.dh.DpsdkCore;

/** 区间测速上报回调函数定义
    @param IN                                    nPDLLHandle              SDK句柄
    @param IN                                    pUserParam               用户指针参数,由对应的DPSDK_SetxxxxCallBack传入
	@remark	Area_Detect_Info_t
*/
public interface fDPSDKGetAreaSpeedDetectCallback{
	public void invoke(int nPDLLHandle, Area_Detect_Info_t areaDetectInfo);
}
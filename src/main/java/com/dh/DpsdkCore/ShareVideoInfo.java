package com.dh.DpsdkCore;

//视频分享结构体
public class ShareVideoInfo {
	public byte[]	szCameraId = new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];	//摄像头ID
	public int		nType;																//1视频，2音频，3音频＋视频
	public int		nSubStream;															//码流类型。1主码流，2子码流
	public int		nIsMobile;															//非零表示手机客户端请求
	public long		nPlanId;															//录像计划ID
	public long		nPlaybacktime;														//回放时间

	public ShareVideoInfo()
	{
		nType = 1;
		nSubStream = 1;
		nIsMobile = 0;
		nPlanId = 0;
		nPlaybacktime = 0;
	}
}

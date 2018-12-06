package com.dh.DpsdkCore.TvWall;
import com.dh.DpsdkCore.dpsdk_constant_value;

public class Set_TvWall_Screen_Window_Source_t {

	public int						nTvWallId;									// 电视墙ID
	public int						nScreenId;									// 屏ID
	public int						nWindowId;									// 窗口ID
	public byte[]					szCameraId= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];			// 通道ID
	public int				        enStreamType;								// 码流类型,参考类dpsdk_stream_type_e定义
	public long						nStayTime;									// 停留时间
	
	public Set_TvWall_Screen_Window_Source_t()
	{
		
	}
}

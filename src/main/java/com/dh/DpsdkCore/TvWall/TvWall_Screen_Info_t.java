package com.dh.DpsdkCore.TvWall;
import com.dh.DpsdkCore.dpsdk_constant_value;

public class TvWall_Screen_Info_t {

	public int							nScreenId;									// 屏ID
	public byte[]						szName = new byte[dpsdk_constant_value.DPSDK_CORE_TVWALL_NAME_LEN];			// 名称
	public byte[]						szDecoderId = new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];			// 解码器ID
	public float						fLeft;										// 左边距
	public float						fTop;										// 上边距
	public float						fWidth;										// 宽度
	public float						fHeight;									// 高度
	public boolean						bBind;										// 是否绑定解码器
	
	public TvWall_Screen_Info_t()
	{
		
	}
}

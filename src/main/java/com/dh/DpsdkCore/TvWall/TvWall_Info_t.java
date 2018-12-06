package com.dh.DpsdkCore.TvWall;
import com.dh.DpsdkCore.dpsdk_constant_value;

public class TvWall_Info_t {

	public int							nTvWallId;									// 电视墙ID
	public int							nState;										// 启用状态
	public byte[]						szName = new byte[dpsdk_constant_value.DPSDK_CORE_TVWALL_NAME_LEN];			// 名称
	
	public TvWall_Info_t()
	{
		
	}
}

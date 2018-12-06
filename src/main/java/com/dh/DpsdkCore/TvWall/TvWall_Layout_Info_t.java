package com.dh.DpsdkCore.TvWall;

public class TvWall_Layout_Info_t {

	public int						nTvWallId;									// 电视墙ID
	public int						nCount;										// 屏数量
	public	TvWall_Screen_Info_t[]	pScreenInfo;								// 屏信息
	
	public TvWall_Layout_Info_t(int nMaxCount)
	{
		nCount = nMaxCount;
		pScreenInfo = new TvWall_Screen_Info_t[nCount];
		for(int i = 0; i < nCount; i++)
		{
			pScreenInfo[i] = new TvWall_Screen_Info_t();
		}
	}
}

package com.dh.DpsdkCore.TvWall;

public class TvWall_List_Info_t {
	
	public int							nCount;										// 电视墙数量
	public TvWall_Info_t[]		        pTvWallInfo;							    // 电视墙信息
	
	public TvWall_List_Info_t(int nMaxCount)
	{
		nCount = nMaxCount;
		pTvWallInfo = new TvWall_Info_t[nCount];
		for(int i = 0; i < nCount; i++)
		{
			pTvWallInfo[i] = new TvWall_Info_t();
		}
	}
}

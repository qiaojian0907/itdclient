package com.dh.DpsdkCore.TvWall;

public class TvWall_Task_Info_List_t {

	public int						nCount;										// 电视墙任务数量
	public TVWall_Task_Info_t[]		pTvWallTaskInfo;							// 电视墙任务信息
	
	public TvWall_Task_Info_List_t(int nMaxCount)
	{
		nCount = nMaxCount;
		pTvWallTaskInfo = new TVWall_Task_Info_t[nCount];
		for(int i = 0; i < nCount; i++)
		{
			pTvWallTaskInfo[i] = new TVWall_Task_Info_t();
		}
	}
}

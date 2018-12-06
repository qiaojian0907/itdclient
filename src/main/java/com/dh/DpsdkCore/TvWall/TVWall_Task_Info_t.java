package com.dh.DpsdkCore.TvWall;

import com.dh.DpsdkCore.dpsdk_constant_value;

public class TVWall_Task_Info_t {

	public int							nTaskId;																	// 任务ID
	public byte[]						szName = new byte[dpsdk_constant_value.DPSDK_CORE_TVWALL_TASK_NAME_LEN];	// 任务名称
	public byte[]						szDes = new byte[dpsdk_constant_value.DPSDK_CORE_TVWALL_TASK_DES_LEN];		// 任务描述
	
	public TVWall_Task_Info_t()
	{
		
	}
}

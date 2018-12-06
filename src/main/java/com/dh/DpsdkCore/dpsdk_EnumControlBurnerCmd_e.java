package com.dh.DpsdkCore;

/** 刻录控制命令
@param    Cmd_StartBurn		        = 1;					开始刻录
@param    Cmd_PauseBurn		        = 2;					暂停刻录
@param    Cmd_StartBurn		        = 3;					继续刻录
@param    Cmd_PauseBurn		        = 4;					停止刻录
@param    Cmd_StartBurn		        = 5;					手动换盘
*/

public class dpsdk_EnumControlBurnerCmd_e
{
	public static final int	Cmd_StartBurn 		= 1;		// 开始刻录
	public static final int Cmd_PauseBurn		= 2;		// 暂停刻录
	public static final int	Cmd_ContinueBurn	= 3;		// 继续刻录
	public static final int	Cmd_StopBurn		= 4;		// 停止刻录
	public static final int	Cmd_ChangeCD		= 5;		// 手动换盘
};
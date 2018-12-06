package com.dh.DpsdkCore;

/** 云台方向控制命令
@param     DPSDK_CORE_PTZ_START_AUTO_ROUND				= 39;					开始水平旋转
@param     DPSDK_CORE_PTZ_STOP_AUTO_ROUND				= 40;					停止水平旋转

@param     DPSDK_CORE_PTZ_SET_LEFT_SCAN_RANGE			= 41;					设置左边界
@param     DPSDK_CORE_PTZ_SET_RIGHT_SCAN_RANGE			= 42;					设置右边界
@param     DPSDK_CORE_PTZ_START_SCAN					= 43;					开始线扫
@param     DPSDK_CORE_PTZ_STOP_SCAN						= 44;					停止线扫

@param     DPSDK_CORE_PTZ_SET_MODLE_START				= 45;					设置巡迹开始
@param     DPSDK_CORE_PTZ_SET_MODLE_CANCEL				= 46;					设置巡迹结束
@param     DPSDK_CORE_PTZ_RUN_MODLE						= 47;					运行巡迹
@param     DPSDK_CORE_PTZ_STOP_MODLE					= 48;					停止巡迹
@param     DPSDK_CORE_PTZ_CLEAR_MODLE					= 49;					清除巡迹

@param     DPSDK_CORE_PTZ_UPDOWN						= 50;					翻转命令

@param     DPSDK_CORE_PTZ_OPEN_ASSISTANT_POINT			= 52;					辅助开关开
@param     DPSDK_CORE_PTZ_CLOSE_ASSISTANT_POINT			= 53;					辅助开关关

@param     DPSDK_CORE_PTZ_OPEN_IPC_MENU					= 54;					打开菜单
@param     DPSDK_CORE_PTZ_CLOSE_IPC_MENU				= 55;					关闭菜单
@param     DPSDK_CORE_PTZ_MENU_ASSURE					= 56;					菜单确定
@param     DPSDK_CORE_PTZ_MENU_CALCEL					= 57;					菜单取消
@param     DPSDK_CORE_PTZ_MENU_UP						= 58;					菜单上
@param     DPSDK_CORE_PTZ_MENU_DOWN						= 59;					菜单下
@param     DPSDK_CORE_PTZ_MENU_LEFT						= 60;					菜单左
@param     DPSDK_CORE_PTZ_MENU_RIGHT					= 61;					菜单右
*/

// 云台扩展控制命令
public class dpsdk_ptz_extend_cmd_e
{
	public static final int     DPSDK_CORE_PTZ_START_AUTO_ROUND				= 39;					// 开始水平旋转
	public static final int     DPSDK_CORE_PTZ_STOP_AUTO_ROUND				= 40;					// 停止水平旋转

	public static final int     DPSDK_CORE_PTZ_SET_LEFT_SCAN_RANGE			= 41;					// 设置左边界
	public static final int     DPSDK_CORE_PTZ_SET_RIGHT_SCAN_RANGE			= 42;					// 设置右边界
	public static final int     DPSDK_CORE_PTZ_START_SCAN					= 43;					// 开始线扫
	public static final int     DPSDK_CORE_PTZ_STOP_SCAN					= 44;					// 停止线扫

	public static final int     DPSDK_CORE_PTZ_SET_MODLE_START				= 45;					// 设置巡迹开始
	public static final int     DPSDK_CORE_PTZ_SET_MODLE_CANCEL				= 46;					// 设置巡迹结束
	public static final int     DPSDK_CORE_PTZ_RUN_MODLE					= 47;					// 运行巡迹
	public static final int     DPSDK_CORE_PTZ_STOP_MODLE					= 48;					// 停止巡迹
	public static final int     DPSDK_CORE_PTZ_CLEAR_MODLE					= 49;					// 清除巡迹

	public static final int     DPSDK_CORE_PTZ_UPDOWN						= 50;					// 翻转命令

	public static final int     DPSDK_CORE_PTZ_OPEN_ASSISTANT_POINT			= 52;					// 辅助开关开
	public static final int     DPSDK_CORE_PTZ_CLOSE_ASSISTANT_POINT		= 53;					// 辅助开关关

	public static final int     DPSDK_CORE_PTZ_OPEN_IPC_MENU				= 54;					// 打开菜单
	public static final int     DPSDK_CORE_PTZ_CLOSE_IPC_MENU				= 55;					// 关闭菜单
	public static final int     DPSDK_CORE_PTZ_MENU_ASSURE					= 56;					// 菜单确定
	public static final int     DPSDK_CORE_PTZ_MENU_CALCEL					= 57;					// 菜单取消
	public static final int     DPSDK_CORE_PTZ_MENU_UP						= 58;					// 菜单上
	public static final int     DPSDK_CORE_PTZ_MENU_DOWN					= 59;					// 菜单下
	public static final int     DPSDK_CORE_PTZ_MENU_LEFT					= 60;					// 菜单左
	public static final int     DPSDK_CORE_PTZ_MENU_RIGHT					= 61;					// 菜单右
};
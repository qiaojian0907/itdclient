package com.dh.DpsdkCore;

/** 按文件获取录像码流信息
@param   szCameraId					通道ID
@param   nRight						是否检测权限,参考类dpsdk_check_right_e定义
@param   nMode						录像流请求类型,参考类dpsdk_pb_mode_e定义
@param   nFileIndex					文件索引
@param   uBeginTime					播放起始
@param   uEndTime					播放结束
*/

public class Get_RecordStream_File_Info_t
{
	public byte[]	szCameraId	= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];		// 通道ID
	public int						nRight;													// 是否检测权限,参考类dpsdk_check_right_e定义
	public int						nMode;													// 录像流请求类型,参考类dpsdk_pb_mode_e定义
	
	public int						nFileIndex;												// 文件索引
	public long						uBeginTime;												// 播放起始
	public long						uEndTime;												// 播放结束
};
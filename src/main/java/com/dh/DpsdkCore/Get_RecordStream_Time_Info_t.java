package com.dh.DpsdkCore;

/** 按时间获取录像码流信息
@param   szCameraId					通道ID
@param   nRight						是否检测权限,参考类dpsdk_check_right_e定义
@param   nMode						录像流请求类型,参考类dpsdk_pb_mode_e定义
@param   nSource					录像源类型 ,参考类dpsdk_recsource_type_e定义   
@param   uBeginTime					播放起始
@param   uEndTime					播放结束
*/

public class Get_RecordStream_Time_Info_t
{
	public byte[]	szCameraId	= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];		// 通道ID
	public int					nRight;														// 是否检测权限,参考类dpsdk_check_right_e定义
	public int					nMode;														// 录像流请求类型,参考类dpsdk_pb_mode_e定义

	public int					nSource;													// 录像源类型 ,参考类dpsdk_recsource_type_e定义                 
	public long				uBeginTime;														// 开始时间 
	public long				uEndTime;														// 结束时间
	public int				nTrackID;													// 拉流TrackID,默认0
};
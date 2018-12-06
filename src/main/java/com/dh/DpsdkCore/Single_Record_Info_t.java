package com.dh.DpsdkCore;

import java.io.Serializable;

/** 单个录像信息
@param   nFileIndex				文件索引
@param   nSource				录像源类型,参考类dpsdk_recsource_type_e定义
@param   nRecordType			录像类型,参考类dpsdk_record_type_e定义
@param   uBeginTime				起始时间	
@param   uEndTime				结束时间
@param   uLength				文件大小
*/

public class Single_Record_Info_t implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8515781048718228851L;
	
	public int				nFileIndex;														// 文件索引
	public int				nSource;														// 录像源类型,参考类dpsdk_recsource_type_e定义
	public int				nRecordType;													// 录像类型,参考类dpsdk_record_type_e定义
	public long				uBeginTime;														// 起始时间
	public long				uEndTime;														// 结束时间
	public long				uLength;														// 文件大小
};
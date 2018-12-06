package com.dh.DpsdkCore;

import java.io.Serializable;

/** 录像信息
@param   szCameraId					通道ID
@param   nBegin						录像起始
@param   nCount						请求录像数
@param   nRetCount					实际返回个数	
@param   pSingleRecord				录像记录信息	
*/

public class Record_Info_t implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1028601165846001162L;
	
	public byte[]	szCameraId = new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];		// 通道ID
	public int							nBegin;												// 录像起始
	public int							nCount;												// 请求录像数
	public int						nRetCount;												// 实际返回个数
	public Single_Record_Info_t pSingleRecord[];									// 录像记录信息
	
	public Record_Info_t(int nMaxRecordCount)
	{
		nCount = nMaxRecordCount; 			
		pSingleRecord = new Single_Record_Info_t[nCount];
		for(int i = 0; i < nCount; i++)
		{
			pSingleRecord[i] = new Single_Record_Info_t();
		}			
	}
};
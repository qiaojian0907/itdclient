package com.dh.DpsdkCore;

/** 设备磁盘信息
@param   szDevId					设备ID
@param   nDiskInfoSize				磁盘信息数量
@param   pDiskInfoList				磁盘信息列表
*/

public class Device_Disk_Info_t
{
	public byte[]				szDevId		=new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];	//设备ID
	public int					nDiskInfoSize;														//磁盘信息数量
	public Single_Disk_Info_t pDiskInfoList[];													//磁盘信息列表
	
	public Device_Disk_Info_t(int nMaxCount)
	{
		nDiskInfoSize = nMaxCount;
		pDiskInfoList = new Single_Disk_Info_t[nDiskInfoSize];
		for(int i = 0; i < nDiskInfoSize; i++)
		{
			pDiskInfoList[i] = new Single_Disk_Info_t();
		}
	}
};
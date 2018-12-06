package com.dh.DpsdkCore;

/** 单个磁盘信息
@param   nDiskId					硬盘ID（从0开始）
@param   uVolume					硬盘容量
@param   uFreeSpace					剩余容量
@param   diskState					高四位的值表示硬盘类型，具体为：0 读写驱动器 1 只读驱动器 2 备份驱动器或媒体驱动器 3 冗余驱动器 4 快照驱动器；低四位的值表示硬盘的状态，0-休眠,1-活动,2-故障
@param   diskNum					硬盘号
@param   subareaNum					分区号
@param   signal						标识， 0本地 1 远程
*/

public class Single_Disk_Info_t
{
	public int				nDiskId;						//硬盘ID（从0开始）
	public int				uVolume;						//硬盘容量
	public int				uFreeSpace;						//剩余容量
	public byte				diskState;						//高四位的值表示硬盘类型，具体为：0 读写驱动器 1 只读驱动器 2 备份驱动器或媒体驱动器 3 冗余驱动器 4 快照驱动器；低四位的值表示硬盘的状态，0-休眠,1-活动,2-故障
	public byte				diskNum;						//硬盘号
	public byte				subareaNum;						//分区号
	public byte				signal;							//标识， 0本地 1 远程
};
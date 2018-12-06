package com.dh.DpsdkCore;

/** 获取刻录实时状态信息请求
@param   deviceId					设备ID
@param   cmd						控制命令
@param   channelMask				通道掩码    第1个通道为1；第2个通道是：1<<1;第3个是1<<2
@param   burnerMask					刻录机掩码  1表示光驱1；2光驱2；3双光驱
@param   emMode						刻录模式    0-BURN_MODE_SYNC,1-BURN_MODE_TURN,2-BURN_MODE_CYCLE
@param   emPack						刻录流格式  0-DHAV,1-BURN_PACK_PS...
*/

public class Control_Dev_Burner_Request_t
{
	public byte[] 	deviceId 	= new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];
	public int		cmd;
	public int 		channelMask;
	public int 		burnerMask;
	public int 		emMode;
	public int 		emPack;
};
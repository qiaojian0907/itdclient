package com.dh.DpsdkCore;

public class SetDoorCmd_Request_t {

	public byte[]					szCameraId= new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];			// 通道ID
	public int						cmd;									// 控制命令 参考dpsdk_SetDoorCmd_e
	public long						start;									// 开始时间
	public long						end;									// 结束时间
	
	public SetDoorCmd_Request_t()
	{
		
	}
}

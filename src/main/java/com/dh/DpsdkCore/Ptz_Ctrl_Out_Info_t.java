package com.dh.DpsdkCore;

public class Ptz_Ctrl_Out_Info_t {
	public byte[]	szCameraId = new byte[dpsdk_constant_value.DPSDK_CORE_CHL_ID_LEN];	// 通道ID
	public boolean							bOpen;                                      //打开标志：true-打开, false-关闭
	public int								nCmd;                                       //控制命令。状态控制。1=开启，0=关闭     模式控制：0=关闭  1=自动 2=手动 3常闭模式下关闭，4常闭模式手动
	public int								nType;                                      //控制类型。1状态控制 2 模式控制
}

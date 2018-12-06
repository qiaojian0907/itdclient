package com.dh.DpsdkCore;

public class dpsdk_AHostDefenceStatus_t {
	public byte[]	szNodeID = new byte[dpsdk_constant_value.DPSDK_CORE_DEV_ID_LEN];// 防区节点ID
	public int  	nAlarm;															// 0表示未报警 1104表示报警 1105表示火警 1106表示防
	public int  	nUndefendAlarm;													// 0表示没有未布防报警 83表示未布防报警（由于24小时防区会出现布防报警和未布防报警并发的情况 所以需要区分一下）
	public boolean	bByPass;														// true=旁路, false=未旁路
	public boolean	bDefend;														// true=布防, false=撤防
}

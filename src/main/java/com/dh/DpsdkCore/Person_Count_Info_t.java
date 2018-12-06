package com.dh.DpsdkCore;

/** 人数统计信息
@param   nChannelID					统计通道号
@param   szRuleName					规则名称
@param   nStartTime					开始时间
@param   nEndTime					结束时间
@param   nEnteredSubTotal			进入人数小计
@param   nExitedSubtotal			出去人数小计
@param   nAvgInside					平均保有人数(除去零值)
@param   nMaxInside					最大保有人数
*/

public class Person_Count_Info_t
{		
	public int 		nChannelID;                         														// 统计通道号
	public byte[]  	szRuleName  = new byte[dpsdk_constant_value.DPSDK_CORE_IVS_EVENT_NAME_LEN];                 // 规则名称
	public int 		nStartTime;																					// 开始时间
	public int 		nEndTime;																					// 结束时间
	public int 		nEnteredSubTotal;																			// 进入人数小计
	public int 		nExitedSubtotal;																			// 出去人数小计
	public int 		nAvgInside;																					// 平均保有人数(除去零值)
	public int 		nMaxInside;																					// 最大保有人数
};
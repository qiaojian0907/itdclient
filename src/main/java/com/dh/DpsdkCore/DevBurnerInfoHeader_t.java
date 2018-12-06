package com.dh.DpsdkCore;

/** 刻录片头
@param   m_deviceId					设备ID
@param   m_password					叠加密码
@param   m_caseId					1.案件编号
@param   m_trialSeq					2.案件序号/审讯序号
@param   m_caseUnderTaker			3.办案人员
@param   m_caseDep					4.办案单位
@param   m_caseReason				5.涉嫌名称
@param   m_caseReferPerson			6.涉案人员
@param   m_caseRemark				7.案卷备注
@param   m_caseRecordName			8.录像名称
@param   m_RecordNum				9.光盘编号
@param   m_recordPerson				10.刻录人
@param   m_dataCheckOsdEn			11.光盘刻录数据校验配置/叠加使能
@param   m_AttachFileEn				12.附加文件使能
@param   m_multiBurnerDataCheck		13.多光盘一致性校验使能
@param   m_multiBurnerDataCheckSpeed	14.校验速度校验速度 0 高速（头尾数据校验）,1 正常（随机数据校验）,2 低速 （全盘数据校验）,默认0
*/

public class DevBurnerInfoHeader_t
{
	public byte[]	m_deviceId			=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];		// 设备ID
	public byte[]	m_password			=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_64];		// 叠加密码
	public byte[]	m_caseId			=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_64];		// 1.案件编号
	public byte[]	m_trialSeq			=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_256];	// 2.案件序号/审讯序号
	public byte[]	m_caseUnderTaker	=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_256];	// 3.办案人员
	public byte[]	m_caseDep			=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_256];	// 4.办案单位	
	public byte[]	m_caseReason		=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_256];	// 5.涉嫌名称
	public byte[]	m_caseReferPerson	=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_256];	// 6.涉案人员
	public byte[]	m_caseRemark		=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_256];	// 7.案卷备注
	public byte[]	m_caseRecordName	=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_256];	// 8.录像名称
	public byte[]	m_RecordNum			=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_64];		// 9.光盘编号
	public byte[]	m_recordPerson		=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_256];	// 10.刻录人
	public boolean	m_dataCheckOsdEn;																// 11.光盘刻录数据校验配置/叠加使能
	public boolean	m_AttachFileEn;																	// 12.附加文件使能
	public boolean	m_multiBurnerDataCheck;															// 13.多光盘一致性校验使能
	public int		m_multiBurnerDataCheckSpeed;													// 14.校验速度校验速度 0 高速（头尾数据校验）,1 正常（随机数据校验）,2 低速 （全盘数据校验）,默认0
};
package com.dh.DpsdkCore;

/** 审讯表单属性名
@param   m_caseIdAttr					案件编号
@param   m_trialSeqAttr					案件序号/审讯序号
@param   m_caseUnderTakerAttr			办案人员
@param   m_caseDepAttr					办案单位
@param   m_caseReasonAttr				涉嫌名称
@param   m_caseReferPersonAttr			涉案人员
@param   m_caseRemarkAttr				案卷备注
@param   m_caseRecordNameAttr			录像名称
@param   m_trialObjNameAttr				被审讯人姓名
@param   m_trialObjSexAttr				被审讯人性别
@param   m_trialObjIDAttr				被审讯人身份证号码
@param   m_trialObjNationAttr			民族
@param   m_trialObjBirthdayAttr			出生年月
@param   m_trialObjHomeAddrAttr			住址
@param   m_trialObjWorkUnitsAttr		工作单位
@param   m_trialObjTelephoneAttr		联系电话
@param   m_CDIDAttr						光盘编号
@param   m_recordPersonAttr				刻录人
@param   m_caseAssistantAttr			协助办案人员--卷宗信息新增，非必填项
@param   m_trialObjAgeAttr				年龄--被询问人信息-新增，非必填项
*/

public class TrialFormAttrName_t
{
	public byte[]	m_caseIdAttr			=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 案件编号
	public byte[]	m_trialSeqAttr			=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 案件序号/审讯序号
	public byte[]	m_caseUnderTakerAttr	=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 办案人员
	public byte[]	m_caseDepAttr			=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 办案单位
	public byte[]	m_caseReasonAttr		=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 涉嫌名称
	public byte[]	m_caseReferPersonAttr	=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 涉案人员
	public byte[]	m_caseRemarkAttr		=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 案卷备注
	public byte[]	m_caseRecordNameAttr	=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 录像名称
	public byte[]	m_trialObjNameAttr		=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 被审讯人姓名
	public byte[]	m_trialObjSexAttr		=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 被审讯人性别
	public byte[]	m_trialObjIDAttr		=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 被审讯人身份证号码
	public byte[]	m_trialObjNationAttr	=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 民族
	public byte[]	m_trialObjBirthdayAttr	=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 出生年月
	public byte[]	m_trialObjHomeAddrAttr	=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 住址
	public byte[]	m_trialObjWorkUnitsAttr	=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 工作单位
	public byte[]	m_trialObjTelephoneAttr	=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 联系电话
	public byte[]	m_CDIDAttr				=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 光盘编号
	public byte[]	m_recordPersonAttr		=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 刻录人
	public byte[]	m_caseAssistantAttr		=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 协助办案人员--卷宗信息新增，非必填项
	public byte[]	m_trialObjAgeAttr		=new byte[dpsdk_constant_value.DPSDK_CORE_CHAR_LEN_32];			// 年龄--被询问人信息-新增，非必填项
};
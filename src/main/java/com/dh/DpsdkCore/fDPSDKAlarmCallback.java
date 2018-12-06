package com.dh.DpsdkCore;

/** 报警回调.
@param   IN									nPDLLHandle				SDK句柄
@param   IN									szAlarmId               报警Id
@param   IN									nDeviceType             设备类型
@param   IN									szCameraId              通道Id
@param   IN									szDeviceName            设备名称
@param   IN									szChannelName           通道名称
@param   IN									szCoding                编码
@param   IN									szMessage               报警信息
@param   IN									nAlarmType              报警类型，参考dpsdk_alarm_type_e
@param   IN									nEventType              报警发生类型，参考dpsdk_event_type_e
@param   IN									nLevel                  报警等级
@param   IN									nTime                   报警时间
@param   IN									pAlarmData              报警数据
@param   IN									nAlarmDataLen           报警数据长度
@param   IN									pPicData                图片数据
@param   IN									nPicDataLen             图片数据长度
@remark									
*/
public interface fDPSDKAlarmCallback{
	public void invoke(int nPDLLHandle, byte[] szAlarmId, int nDeviceType, byte[] szCameraId, byte[] szDeviceName, byte[] szChannelName, byte[] szCoding, byte[] szMessage, int nAlarmType, int nEventType, int nLevel, long nTime, byte[] pAlarmData, int nAlarmDataLen, byte[] pPicData, int nPicDataLen);
}
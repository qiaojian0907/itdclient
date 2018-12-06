package com.dh.DpsdkCore;

/*
 * 报警回调
 * */
public class DPSDKAlarmCallback implements fDPSDKAlarmCallback
{
    int i =0;
    public void invoke( int nPDLLHandle, byte[] szAlarmId, int nDeviceType, byte[] szCameraId, byte[] szDeviceName, byte[] szChannelName, byte[] szCoding, byte[] szMessage, int nAlarmType, int nEventType, int nLevel, long nTime, byte[] pAlarmData, int nAlarmDataLen, byte[] pPicData, int nPicDataLen)
    {
        i++;
        System.out.printf("序号=%d,nPDLLHandle=%d,szAlarmId=%s,nDeviceType=%d,szCameraId=%s,szDeviceName=%s,szChannelName=%s,szCoding=%s," +
                        "szMessage=%s,nAlarmType=%d,nEventType=%d,nLevel=%d,nTime=%d,pAlarmData=%s,nAlarmDataLen=%d,pPicData=%s,nPicDataLen=%d",
                i,nPDLLHandle,new String(szAlarmId),nDeviceType,new String(szCameraId),new String(szDeviceName),new String(szChannelName),
                new String(szCoding),new String(szMessage),nAlarmType,nEventType,nLevel,nTime,new String(pAlarmData),nAlarmDataLen,new String(pPicData),nPicDataLen);
        System.out.println();
    }
}

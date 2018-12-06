package com.dh.DpsdkCore;

public class dpsdk_phone_subscribe_alarm_t {
	public int         iUserId;						//用户ID
	public byte[]      szPhoneId = new byte[256];	//手机ID,手机推送的标志־
	public int         iAppId;						//应用程序编号
	public byte[]      szPush_type = new byte[64];	//手机类型
	public int         iIs_subscribe;				//是否订阅; 1-订阅, 0-取消订阅
	public byte[]      szLanguage = new byte[32];	//语言
	public byte[]      szTimefmt = new byte[32];	//时间格式化

	public int         iDbOper;						//db操作类型. 1-插入, 2-更新, 3-查询
}

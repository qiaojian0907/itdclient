package com.dh.DpsdkCore;

public class GetLinkResource_Responce_t {
	public byte[]	pXmlData;		
	public int		nLen;								
	
	public GetLinkResource_Responce_t(int len)
	{
		nLen = len;
		if(nLen < 1)
			nLen = 1;
		pXmlData= new byte[nLen];
	}
}

package com.dh.DpsdkCore;

/** 音频类型
@param     Talk_Coding_Default  	= 0;		default
@param     Talk_Coding_PCM    		= 1;		PCM
@param     Talk_Coding_G711a		= 2;		G711a
@param     Talk_Coding_AMR			= 3;  		AMR
@param     Talk_Coding_G711u		= 4;  		G711u
@param     Talk_Coding_G726			= 5; 		G726
@param     Talk_Coding_AAC 			= 8;                     
@param     Talk_Coding_G722   		= 101;		G722 海康设备使用
@param     Talk_Coding_G711_MU		= 102;		G711 海康使用
*/

public class dpsdk_audio_type_e
{
	public static final int     Talk_Coding_Default                         = 0;		             //default
	public static final int     Talk_Coding_PCM                             = 1;		             //PCM
	public static final int     Talk_Coding_G711a							= 2;			         //G711a
	public static final int     Talk_Coding_AMR				                = 3;                     //AMR
	public static final int     Talk_Coding_G711u			                = 4;                     //G711u
	public static final int     Talk_Coding_G726			                = 5;                     //G726
	public static final int     Talk_Coding_AAC                             = 8;                     //add by fengjian 2012.8.8
	public static final int     Talk_Coding_G722                            = 101;		             //G722 海康设备使用
	public static final int     Talk_Coding_G711_MU		                    = 102;                   //G711 海康使用
};
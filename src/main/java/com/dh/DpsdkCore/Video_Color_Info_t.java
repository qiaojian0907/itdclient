package com.dh.DpsdkCore;

/** 视频图像属性
@param   nBrightness			亮度,默认64;范围0-128
@param   nContrast				对比度,默认64;范围0-128
@param   nSaturation			饱和度,默认64;范围0-128
@param   nHue					色调,默认64;范围0-128
*/

public class Video_Color_Info_t
{
	public int								nBrightness;									// 亮度,默认64;范围0-128
	public int								nContrast;										// 对比度,默认64;范围0-128
	public int								nSaturation;									// 饱和度,默认64;范围0-128
	public int								nHue;											// 色调,默认64;范围0-128
};
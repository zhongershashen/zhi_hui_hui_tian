package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * representation channel file info
 * \else
 *  映射通道文件信息
 * \endif
 */
public class NET_CHANNEL_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * real channel ID
	 * \else
	 * 真实通道号
	 * \endif
	 */
	public int                      nRealChannel;                    
	
	/**
	 * \if ENGLISH_LANG
	 * record file length
	 * \else
	 * 通道录像文件总长度 
	 * \endif
	 */
	public int                      nFileLen;                         
}

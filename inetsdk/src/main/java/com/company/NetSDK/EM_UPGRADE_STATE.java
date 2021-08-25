package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * uprade package and uprade state
 * \else
 * 升级包和升级状态
 * \endif
 */
public class EM_UPGRADE_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 *  unknown
	 * \else
	 * 设备详细型号，字符串格式，可能为空
	 * \endif
	 */
    public static final int EM_UPGRADE_STATE_UNKNOWN = 0;                            

    /**
     * \if ENGLISH_LANG
     * check none
     * \else
     *  没有检测到更新状态
     * \endif
     */
    public static final int EM_UPGRADE_STATE_NONE = 1; 
    
    /**
     * \if ENGLISH_LANG
     * package invalid
     * \else
     * 升级包不正确
     * \endif
     */
    public static final int EM_UPGRADE_STATE_INVALID = 2; 
   
    /**
     * \if ENGLISH_LANG
     * out of memory
     * \else
     * 内存不够
     * \endif
     */
    public static final int EM_UPGRADE_STATE_NOT_ENOUGH_MEMORY = 3;
   
    /**
     * \if ENGLISH_LANG
     * downloading package
     * \else
     * 正在下载数据
     * \endif
     */
    public static final int EM_UPGRADE_STATE_DOWNLOADING = 4; 
    
    /**
     * \if ENGLISH_LANG
     * download failed
     * \else
     * 下载失败
     * \endif
     */
    public static final int  EM_UPGRADE_STATE_DOWNLOAD_FAILED = 5;
   
    /**
     * \if ENGLISH_LANG
     * download successed
     * \else
     * 下载成功
     * \endif
     */
    public static final int EM_UPGRADE_STATE_DOWNLOAD_SUCCESSED = 6; 
    
    /**
     * \if ENGLISH_LANG
     * preparing
     * \else
     * 准备升级
     * \endif
     */
    public static final int EM_UPGRADE_STATE_PREPARING = 7; 
    
    /**
     * \if ENGLISH_LANG
     * upgrading
     * \else
     * 升级中
     * \endif
     */
    public static final int EM_UPGRADE_STATE_UPGRADING = 8; 
   
    /**
     * \if ENGLISH_LANG
     * upgrade failed
     * \else
     *  升级失败
     * \endif
     */
    public static final int EM_UPGRADE_STATE_UPGRADE_FAILED = 9;
    
    /**
     * \if ENGLISH_LANG
     * upgrade successed
     * \else
     * 升级成功
     * \endif
     */
    public static final int EM_UPGRADE_STATE_UPGRADE_SUCCESSED = 10; 
 
    /**
     * \if ENGLISH_LANG
     * upgrade cancelled
     * \else
     * 取消升级  
     * \endif
     */
    public static final int EM_UPGRADE_STATE_UPGRADE_CANCELLED = 11;



}

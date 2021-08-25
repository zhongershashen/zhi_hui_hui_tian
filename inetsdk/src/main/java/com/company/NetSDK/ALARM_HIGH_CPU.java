package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * larm of High CPU Occupancy rate, temporarily we set the max limit as 95%, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_HIGH_CPU}
 * \else
 * CPU占用率过高事件报警，暂定上限95%, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_HIGH_CPU}
 * \endif
 */
public class ALARM_HIGH_CPU implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0: Stop, 1: start
	 * \else
	 * 0：停止， 1：开始
	 * \endif
	 */
	public int      ActionType;
	
 	/**
	 * \if ENGLISH_LANG
	 * 1000 times of  CPU Occupancy rate
	 * \else
	 * CPU占用率的1000倍
	 * \endif
	 */
	public int      nUsed;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event occurrence time
	 * \else
	 * 事件发生时间    
	 * \endif
	 */
	public NET_TIME  stuTime = new NET_TIME();         
}

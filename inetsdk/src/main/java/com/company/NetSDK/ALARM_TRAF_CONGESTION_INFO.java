package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * traffic congestion alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_TRAF_CONGESTION_ALARM_EX}
 * \else
 * 交通拥塞报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_TRAF_CONGESTION_ALARM_EX}
 * \endif
 */
public class ALARM_TRAF_CONGESTION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * road number
	 * \else
	 * 车道号
	 * \endif
	 */
	public int                 nDriveWayID;
	
 	/**
	 * \if ENGLISH_LANG
	 * traffic congestion grade:1,2,3,4,5,6;1 indicate the most one 
	 * \else
	 * 交通拥塞等级:1,2,3,4,5,6;1级最严重
	 * \endif
	 */
	public int                 nCongestionLevel;
	
 	/**
	 * \if ENGLISH_LANG
	 * event happen time 
	 * \else
	 * 报警发生时间
	 * \endif
	 */
	public NET_TIME            stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * Device state,0 indicate fault recover,1 indicate fault happen
	 * \else
	 * 设备状态，0表示故障恢复，1表示发生故障
	 * \endif
	 */
	public int                 nState;
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel of alarm
	 * \else
	 * 报警的通道号
	 * \endif
	 */
	public int                 dwChannel;
}

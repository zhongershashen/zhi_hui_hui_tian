package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is NET_EM_GET_ALARMREGION_INFO_BYPASSMODE input param
 * \else
 * 获取旁路状态 输入参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_BYPASSMODE
 * \endif
 */
public class NET_IN_GET_BYPASSMODE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * zone number
	 * \else
	 * 防区个数
	 * \endif
	 */
	public int                       nZoneNum;

	/**
	 * \if ENGLISH_LANG
	 * zone id
	 * \else
	 * 防区号
	 * \endif
	 */
	public int                       arrZones[] = new int[FinalVar.MAX_ZONE_NUMBER];
}

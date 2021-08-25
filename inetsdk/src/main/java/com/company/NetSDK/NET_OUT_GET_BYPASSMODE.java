package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is NET_EM_GET_ALARMREGION_INFO_BYPASSMODE output param
 * \else
 * 获取旁路状态 输出参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_BYPASSMODE
 * \endif
 */
public class NET_OUT_GET_BYPASSMODE implements Serializable {

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
	public int                   			nZoneRet;

	/**
	 * \if ENGLISH_LANG
	 * bypass mode {@link EM_BYPASSMODE_TYPE}
	 * \else
	 * 防区工作模式 {@link EM_BYPASSMODE_TYPE}
	 * \endif
	 */
	public int        		arrModes[] = new int[FinalVar.MAX_ZONE_NUMBER];
}

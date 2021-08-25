package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is NET_EM_GET_ALARMREGION_INFO_AREAZONES input param
 * \else
 * 获取区域防区信息 输入参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_AREAZONES
 * \endif
 */
public class NET_IN_GET_AREAZONES implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * area number
	 * \else
	 * 区域个数
	 * \endif
	 */
	public int                       nAreaNum;

	/**
	 * \if ENGLISH_LANG
	 * area id
	 * \else
	 * 区域号
	 * \endif
	 */
	public int                       arrArea[] = new int[FinalVar.MAX_AREA_NUMBER];
}

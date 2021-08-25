package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is NET_EM_GET_ALARMREGION_INFO_AREAZONES output param
 * \else
 * 获取区域防区信息 输出参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_AREAZONES
 * \endif
 */
public class NET_OUT_GET_AREAZONES implements Serializable {

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
	public int                             nAreaRet;

	/**
	 * \if ENGLISH_LANG
	 * area information
	 * \else
	 * 区域信息
	 * \endif
	 */
	public NET_AREA_INFO                   stuAreaInfo[] = new NET_AREA_INFO[FinalVar.MAX_AREA_NUMBER];

	public NET_OUT_GET_AREAZONES() {
		for (int i = 0; i < stuAreaInfo.length; ++i) {
			stuAreaInfo[i] = new NET_AREA_INFO();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Battery Information, interface {@link INetSDK#QueryDevState}, corresponding to command {@link FinalVar#SDK_DEVSTATE_POWER_STATE}
 * \else
 * 电池信息, {@link INetSDK#QueryDevState}接口的 {@link FinalVar#SDK_DEVSTATE_POWER_STATE} 命令参数
 * \endif
 */
public class SDK_BATTERY_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Battery Capacity Percentage
	 * \else
	 * 电池容量百分比
	 * \endif
	 */
	public int                 nPercent;

	/**
	 * \if ENGLISH_LANG
	 * Whether real charging
	 * \else
	 * 是否真正充电
	 * \endif
	 */
	public boolean                bCharging;

	/**
	 * \if ENGLISH_LANG
	 * battery in-place status
	 * \else
	 * 电池在位状态
	 * \endif
	 */
	public int emExistState;

	/**
	 * \if ENGLISH_LANG
	 * battery power status
	 * \else
	 * 电池电量状态
	 * \endif
	 */
	public int	emState;
}

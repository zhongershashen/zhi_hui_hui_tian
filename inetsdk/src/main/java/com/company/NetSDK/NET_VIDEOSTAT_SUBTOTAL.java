package com.company.NetSDK;
import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * video statistical subtotal
 * \else
 * 视频统计小计信息
 * \endif
 */
public class NET_VIDEOSTAT_SUBTOTAL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * count since device operation
	 * \else
	 * 设备运行后人数统计总数
	 * \endif
	 */
	public int                 nTotal;

	/**
	 * \if ENGLISH_LANG
	 * count in the last hour
	 * \else
	 * 小时内的总人数
	 * \endif
	 */
	public int                 nHour;

	/**
	 * \if ENGLISH_LANG
	 * count for today
	 * \else
	 * 当天的总人数, 不可手动清除
	 * \endif
	 */
	public int                 nToday;

	/**
	 * \if ENGLISH_LANG
	 * count for today, on screen display
	 * \else
	 * 统计人数, 用于OSD显示, 可手动清除
	 * \endif
	 */
	public int                 nOSD;
}

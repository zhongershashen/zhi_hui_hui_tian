package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video statistical summary
 * \else
 * 视频统计摘要信息
 * \endif
 */
public class NET_VIDEOSTAT_SUMMARY implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                     nChannelID;

	/**
	 * \if ENGLISH_LANG
	 * Rule name
	 * \else
	 * 规则名称
	 * \endif
	 */
	public byte                    szRuleName[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * Time of this statistics
	 * \else
	 * 统计时间
	 * \endif
	 */
	public NET_TIME_EX             stuTime = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * Subtotal for the entered
	 * \else
	 * 进入小计
	 * \endif
	 */
	public NET_VIDEOSTAT_SUBTOTAL  stuEnteredSubtotal = new NET_VIDEOSTAT_SUBTOTAL();

	/**
	 * \if ENGLISH_LANG
	 * Subtotal for the exited
	 * \else
	 * 出去小计
	 * \endif
	 */
	public NET_VIDEOSTAT_SUBTOTAL  stuExitedSubtotal = new NET_VIDEOSTAT_SUBTOTAL();

	/**
	 * \if ENGLISH_LANG
	 * Total number of people in the area
	 * \else
	 * 区域内人数
	 * \endif
	 */
	public int					nInsidePeopleNum;

	/**
	 * \if ENGLISH_LANG
	 * Rule type {@link EM_RULE_TYPE}
	 * \else
	 * 规则类型 {@link EM_RULE_TYPE}
	 * \endif
	 */
	public int			      emRuleType;

	/**
	 * \if ENGLISH_LANG
	 * The count of peoples left
	 * \else
	 * 离开的人数个数
	 * \endif
	 */
	public int				  nRetExitManNum;

	/**
	 * \if ENGLISH_LANG
	 * The stay time of the peoples left
	 * \else
	 * 离开人员的滞留时间信息
	 * \endif
	 */
	public NET_EXITMAN_STAY_STAT	stuExitManStayInfo[] = new NET_EXITMAN_STAY_STAT[FinalVar.MAX_EXIT_MAN_NUM];

	public NET_VIDEOSTAT_SUMMARY() {
		for (int i = 0; i < stuExitManStayInfo.length; ++i) {
            stuExitManStayInfo[i] = new NET_EXITMAN_STAY_STAT();
		}
	}
}

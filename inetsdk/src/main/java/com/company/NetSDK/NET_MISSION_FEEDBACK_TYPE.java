package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Feedback type
 * \else
 * 反馈类型
 * \endif
 */
public class NET_MISSION_FEEDBACK_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * no feedback needed
     * \else
     * 不需要反馈
     * \endif
     */
    public static final int NET_MISSION_FEEDBACK_NO = 0;

    /**
     * \if ENGLISH_LANG
     * need feedback
     * \else
     * 需要对方反馈
     * \endif
     */
    public static final int NET_MISSION_FEEDBACK_YES = 1;
}


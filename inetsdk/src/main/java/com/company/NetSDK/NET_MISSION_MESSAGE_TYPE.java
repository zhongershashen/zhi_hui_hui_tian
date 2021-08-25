package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Message type (mobile)
 * \else
 * 消息类型(车载)
 * \endif
 */
public class NET_MISSION_MESSAGE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * text info
     * \else
     * 文本消息
     * \endif
     */
    public static final int NET_MISSION_MESSAGE_TEXT = 0;

    /**
     * \if ENGLISH_LANG
     * ad info
     * \else
     * 广告信息
     * \endif
     */
    public static final int NET_MISSION_MESSAGE_AD = 1;

    /**
     * \if ENGLISH_LANG
     * broadcast info
     * \else
     * 广播消息
     * \endif
     */
    public static final int NET_MISSION_MESSAGE_BROAD = 2;

    /**
     * \if ENGLISH_LANG
     * driver info
     * \else
     * 司机消息
     * \endif
     */
    public static final int NET_MISSION_MESSAGE_DRIVER = 3;

    /**
     * \if ENGLISH_LANG
     * dispatch command
     * \else
     * 调度指令
     * \endif
     */
    public static final int NET_MISSION_MESSAGE_DISPATCH = 4;

    /**
     * \if ENGLISH_LANG
     * transparent data
     * \else
     * 透明数据
     * \endif
     */
    public static final int NET_MISSION_MESSAGE_TRANSPARENT = 5;

    /**
     * \if ENGLISH_LANG
     * emergency
     * \else
     * 紧急事件
     * \endif
     */
    public static final int NET_MISSION_MESSAGE_URGENT = 6;

    /**
     * \if ENGLISH_LANG
     * not used
     * \else
     * 未使用
     * \endif
     */
    public static final int NET_MISSION_MESSAGE_MAX = 7;

}
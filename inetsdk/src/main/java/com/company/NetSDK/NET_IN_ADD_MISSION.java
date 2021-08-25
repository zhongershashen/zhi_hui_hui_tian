package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AddMission} input parameter
 * \else
 * {@link INetSDK#AddMission} 接口输入参数
 * \endif
 */
public class NET_IN_ADD_MISSION implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * task name
     * \else
     * 任务名称
     * \endif
     */
    public byte[]					szTitle = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * task ID
     * \else
     * 任务ID
     * \endif
     */
    public byte[]					szMissionID = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * replay content
     * \else
     * 回复内容
     * \endif
     */
    public byte[]         	   szComment = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * Account type, refer to {@link NET_MISSION_FEEDBACK_TYPE}
     * \else
     * 添加后反馈类型, 取值参考 {@link NET_MISSION_FEEDBACK_TYPE}
     * \endif
     */
    public int  emFeedBack;

    /**
     * \if ENGLISH_LANG
     * Account type, refer to {@link NET_MISSION_MESSAGE_TYPE}
     * \else
     * 消息类型, 取值参考 {@link NET_MISSION_MESSAGE_TYPE}
     * \endif
     */
    public int  emMessageType;

    /**
     * \if ENGLISH_LANG
     * false, szComment is valid, true, szCommentEx is valid
     * \else
     * false时，szComment有效；true时，szCommentEx有效
     * \endif
     */
    public boolean  bComment;

    /**
     * \if ENGLISH_LANG
     * extend replay content
     * \else
     * 扩展回复内容
     * \endif
     */
    public byte[]         	   szCommentEx = new byte[FinalVar.SDK_COMMON_STRING_2048];

    /**
     * \if ENGLISH_LANG
     * in which several channels are superimposed
     * \else
     * 在哪几个通道进行叠加
     * \endif
     */
    public int[]  nChannel = new int[FinalVar.MAX_CHANNEL_COUNT];

    /**
     * \if ENGLISH_LANG
     * nChannel length
     * \else
     * nChannel实际长度
     * \endif
     */
    public int  nCount;

    /**
     * \if ENGLISH_LANG
     * Overlay display duration, Unit:second; 0 indicates that it has been stacked until the next time
     * \else
     * 叠加显示时长，0表示一直叠加至下一次协议下发，其它数字表示显示时长，单位秒
     * \endif
     */
    public int  nDuration;

}

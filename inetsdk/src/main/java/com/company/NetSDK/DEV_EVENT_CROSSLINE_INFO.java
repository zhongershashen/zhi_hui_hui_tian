package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_CROSSLINEDETECTION}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_CROSSLINEDETECTION}(警戒线事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_CROSSLINE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ChannelId
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * event name
	 * \else
	 * 事件名称
	 * \endif
	 */
	public byte                szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
	public double              PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * the event happen time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
    public NET_TIME_EX         UTC = new NET_TIME_EX();
    
    /**
     * \if ENGLISH_LANG
     * event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                 nEventID;
    
    /**
     * \if ENGLISH_LANG
     * have being detected object
     * \else
     * 检测到的物体
     * \endif
     */
    public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();
    
    /**
     * \if ENGLISH_LANG
     * event file info
     * \else
     * 事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();
    
    /**
     * \if ENGLISH_LANG
     * rule detect line
     * \else
     * 规则检测线
     * \endif
     */
    public SDK_POINT            DetectLine[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_LINE_NUM];
    
    /**
     * \if ENGLISH_LANG
     * rule detect line's point number
     * \else
     * 规则检测线顶点数
     * \endif
     */
    public int                 nDetectLineNum;
    
    /**
     * \if ENGLISH_LANG
     * object moveing track
     * \else
     * 物体运动轨迹
     * \endif
     */
    public SDK_POINT            TrackLine[] = new SDK_POINT[FinalVar.SDK_MAX_TRACK_LINE_NUM];
    
    /**
     * \if ENGLISH_LANG
     * object moveing track's point number
     * \else
     * 物体运动轨迹顶点数
     * \endif
     */
    public int                 nTrackLineNum;
    
    /**
     * \if ENGLISH_LANG
     * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
     * \else
     * 事件动作，0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public byte                bEventAction;
    
    /**
     * \if ENGLISH_LANG
     * direction, 0-left to right, 1-right to left
     * \else
     * 表示入侵方向, 0-由左至右, 1-由右至左
     * \endif
     */
    public byte                bDirection;
    
    /**
     * \if ENGLISH_LANG
     * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
     * \else
     * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
     * \endif
     */
    public byte                byImageIndex;
    
    /**
     * \if ENGLISH_LANG
     * flag(by bit),see NET_RESERVED_COMMON
     * \else
     * 抓图标志(按位)，具体见NET_RESERVED_COMMON
     * \endif
     */
    public int               dwSnapFlagMask;
    
    /**
     * \if ENGLISH_LANG
     * the source device's index,-1 means data in invalid
     * \else
     * 事件源设备上的index,-1表示数据无效,-1表示数据无效
     * \endif
     */
    public int                 nSourceIndex;
    
    /**
     * \if ENGLISH_LANG
     * the source device's sign(exclusive),field said local device does not exist or is empty
     * \else
     * 事件源设备唯一标识,字段不存在或者为空表示本地设备
     * \endif
     */
    public byte                szSourceDevice[] = new byte[FinalVar.MAX_PATH];
    
    /**
     * \if ENGLISH_LANG
     * event trigger accumulated times
     * \else
     * 事件触发累计次数
     * \endif
     */
    public int                 nOccurrenceCount;

	/**
	 * \if ENGLISH_LANG
	 * intelli comm info
	 * \else
	 * 智能报警事件公共信息
	 * \endif
	 */
	public EVENT_INTELLI_COMM_INFO     stuIntelliCommInfo = new EVENT_INTELLI_COMM_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Extension info
	 * \else
	 * 事件扩展信息
	 * \endif
	 */
	public NET_EXTENSION_INFO     stuExtensionInfo = new NET_EXTENSION_INFO();

	public DEV_EVENT_CROSSLINE_INFO() {

		for (int i = 0; i < FinalVar.SDK_MAX_DETECT_LINE_NUM; i++) {
			DetectLine[i] = new SDK_POINT();
		}
		for (int i = 0; i < FinalVar.SDK_MAX_TRACK_LINE_NUM; i++) {
			TrackLine[i] = new SDK_POINT();
		}
	}
}

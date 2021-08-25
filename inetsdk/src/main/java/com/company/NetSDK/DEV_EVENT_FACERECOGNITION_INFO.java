package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_FACERECOGNITION}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_FACERECOGNITION} (人脸识别)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_FACERECOGNITION_INFO implements Serializable {
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
	 * event ID
	 * \else
	 * 事件ID
	 * \endif
	 */
    public int                 nEventID;
    
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
     * have being detected object
     * \else
     * 检测到的物体
     * \endif
     */
    public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();
    
    /**
     * \if ENGLISH_LANG
     * candidate number
     * \else
     * 当前人脸匹配到的候选对象数量
     * \endif
     */
    public int                 nCandidateNum;
    
    /**
     * \if ENGLISH_LANG
     * candidate info
     * \else
     * 当前人脸匹配到的候选对象信息
     * \endif
     */
    public CANDIDATE_INFO      stuCandidates[] = new CANDIDATE_INFO[FinalVar.SDK_MAX_CANDIDATE_NUM];
    
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
     * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
     * \else
     * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
     * \endif
     */
    public byte                byImageIndex;
    
    /**
     * \if ENGLISH_LANG
     * The existence panorama
     * \else
     * 全景图是否存在
     * \endif
     */
    public boolean              bGlobalScenePic;
    
    /**
     * \if ENGLISH_LANG
     * Panoramic Photos
     * \else
     * 全景图片信息
     * \endif
     */
    public SDK_PIC_INFO         stuGlobalScenePicInfo = new SDK_PIC_INFO();
    
    /**
     * \if ENGLISH_LANG
     * Snapshot current face aadevice address  
     * \else
     * 抓拍当前人脸的设备地址，如：滨康路37号
     * \endif
     */
    public byte                szSnapDevAddress[] = new byte[FinalVar.MAX_PATH];
    
    /**
     * \if ENGLISH_LANG
     * event trigger accumilated times 
     * \else
     * 事件触发累计次数
     * \endif
     */
    public int        			nOccurrenceCount;

	/**
	 * \if ENGLISH_LANG
	 * intelligent things info
	 * \else
	 * 智能事件公共信息
	 * \endif
	 */
	public EVENT_INTELLI_COMM_INFO     stuIntelliCommInfo = new EVENT_INTELLI_COMM_INFO();

	/**
	 * \if ENGLISH_LANG
	 * the data of face
	 * \else
	 *  人脸数据
	 * \endif
	 */
	public NET_FACE_DATA		stuFaceData = new NET_FACE_DATA();

	/**
	 * \if ENGLISH_LANG
	 * The unique identifier of the snap person to write to the database
	 * \else
	 * 抓拍人员写入数据库的唯一标识符
	 * \endif
	 */
	public byte[]				szUID = new byte[FinalVar.SDK_COMMON_STRING_32];

	/**
	 * \if ENGLISH_LANG
	 * Feature data information
	 * \else
	 * 特征值信息
	 * \endif
	 */
	public NET_FEATURE_VECTOR	stuFeatureVector = new NET_FEATURE_VECTOR();

	/**
	 * \if ENGLISH_LANG
	 * The version of the feature data algorithm
	 * \else
	 * 特征值算法版本
	 * \endif
	 */
	public byte[]				szFeatureVersion = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * he actual return number of stuCandidatesEx
	 * \else
	 * 当前人脸匹配到的候选对象数量实际返回值
	 * \endif
	 */
	public int					nRetCandidatesExNum;

	/**
	 * \if ENGLISH_LANG
	 * the expansion of candidate information
	 * \else
	 * 当前人脸匹配到的候选对象信息扩展
	 * \endif
	 */
	public CANDIDATE_INFOEX[]  stuCandidatesEx = new CANDIDATE_INFOEX[FinalVar.SDK_MAX_CANDIDATE_NUM];

	public DEV_EVENT_FACERECOGNITION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_MAX_CANDIDATE_NUM; i++) {
    		stuCandidates[i] = new CANDIDATE_INFO();
			stuCandidatesEx[i] = new CANDIDATE_INFOEX();
    	}
    }

	@Override
	public String toString() {
		return "DEV_EVENT_FACERECOGNITION_INFO{" +
				"nChannelID=" + nChannelID +
				", szName=" + Arrays.toString(szName) +
				", nEventID=" + nEventID +
				", UTC=" + UTC +
				", stuObject=" + stuObject +
				", nCandidateNum=" + nCandidateNum +
				", stuCandidates=" + Arrays.toString(stuCandidates) +
				", bEventAction=" + bEventAction +
				", byImageIndex=" + byImageIndex +
				", bGlobalScenePic=" + bGlobalScenePic +
				", stuGlobalScenePicInfo=" + stuGlobalScenePicInfo +
				", szSnapDevAddress=" + Arrays.toString(szSnapDevAddress) +
				", nOccurrenceCount=" + nOccurrenceCount +
				", stuIntelliCommInfo=" + stuIntelliCommInfo +
				", stuFaceData=" + stuFaceData +
				", szUID=" + Arrays.toString(szUID) +
				", stuFeatureVector=" + stuFeatureVector +
				", szFeatureVersion=" + Arrays.toString(szFeatureVersion) +
				", nRetCandidatesExNum=" + nRetCandidatesExNum +
				", stuCandidatesEx=" + Arrays.toString(stuCandidatesEx) +
				'}';
	}
}

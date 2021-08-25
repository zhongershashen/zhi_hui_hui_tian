package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Media file search criteria
 * \else
 * 端media文件查询条件
 * \endif
 */
public class EM_FILE_QUERY_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle information, corresponding to {@link MEDIA_QUERY_TRAFFICCAR_PARAM} and {@link MEDIAFILE_TRAFFICCAR_INFO}
	 * \else
	 * 交通车辆信息,对应{@link MEDIA_QUERY_TRAFFICCAR_PARAM} 和 {@link MEDIAFILE_TRAFFICCAR_INFO}
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_TRAFFICCAR = 0;							 
	/**
	 * \if ENGLISH_LANG
	 * ATM information
	 * \else
	 * ATM信息
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_ATM = 1;									 
	/**
	 * \if ENGLISH_LANG
	 * ATM transaction information 
	 * \else
	 * ATM交易信息 
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_ATMTXN = 2;								 
	/**
	 * \if ENGLISH_LANG
	 * Face info, corresponding to {@link MEDIAFILE_FACERECOGNITION_PARAM} and {@link MEDIAFILE_FACERECOGNITION_INFO}
	 * \else
	 * 端人脸信息 {@link MEDIAFILE_FACERECOGNITION_PARAM} 和  {@link MEDIAFILE_FACERECOGNITION_INFO}
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_FACE = 3;  								 
	/**
	 * \if ENGLISH_LANG
	 * File info, corresponding to {@link NET_IN_MEDIA_QUERY_FILE} and {@link NET_OUT_MEDIA_QUERY_FILE}
	 * \else
	 * 文件信息对应 {@link NET_IN_MEDIA_QUERY_FILE} 和 {@link NET_OUT_MEDIA_QUERY_FILE}
	 * \endif  
	 */
	public static final int     SDK_FILE_QUERY_FILE = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Traffic vehicle info, extension {@link SDK_FILE_QUERY_TRAFFICCAR}, support more fields,corresponding to {@link MEDIA_QUERY_TRAFFICCAR_PARAM_EX} and {@link MEDIAFILE_TRAFFICCAR_INFO_EX}
	 * \else
	 * 交通车辆信息, 扩展 {@link SDK_FILE_QUERY_TRAFFICCAR}, 支持更多的字段,对应 {@link MEDIA_QUERY_TRAFFICCAR_PARAM_EX} 和 {@link MEDIAFILE_TRAFFICCAR_INFO_EX}
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_TRAFFICCAR_EX = 5;

	/**
	 * \if ENGLISH_LANG
	 * Face recignition event info {@link MEDIAFILE_FACE_DETECTION_PARAM} and {@link MEDIAFILE_FACE_DETECTION_INFO}
	 * \else
	 * 人脸检测事件信息 {@link MEDIAFILE_FACE_DETECTION_PARAM} 和 {@link MEDIAFILE_FACE_DETECTION_INFO}
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_FACE_DETECTION = 6;

	/**
	 * \if ENGLISH_LANG
	 * ivs event info {@link MEDIAFILE_IVS_EVENT_PARAM} and {@link MEDIAFILE_IVS_EVENT_INFO}
	 * \else
	 * 智能事件信息 {@link MEDIAFILE_IVS_EVENT_PARAM} 和 {@link MEDIAFILE_IVS_EVENT_INFO}
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_IVS_EVENT = 7;

	/**
	 * \if ENGLISH_LANG
	 * File info(customization), corresponding to {@link NET_IN_MEDIA_QUERY_FILE} and {@link NET_OUT_MEDIA_QUERY_FILE}
	 * \else
	 * 文件信息扩展（定制） {@link NET_IN_MEDIA_QUERY_FILE} 和 {@link NET_OUT_MEDIA_QUERY_FILE}
	 * \endif
	 */
	public static final int SDK_FILE_QUERY_FILE_EX = 16;

}

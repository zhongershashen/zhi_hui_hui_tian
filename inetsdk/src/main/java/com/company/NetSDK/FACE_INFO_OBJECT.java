package com.company.NetSDK;
import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Face info object
 * \else
 * 目标人脸信息
 * \endif
 */
public class FACE_INFO_OBJECT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Image info
     * \else
     * 物体截图信息
     * \endif
     */
    public IMAGE_INFO           stuImageInfo = new IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * Sex
     * \else
     * 性别类型
     * \endif
     */
    public int                  emSex;

    /**
     * \if ENGLISH_LANG
     * Age
     * \else
     * 年龄
     * \endif
     */
    public int                  nAge;

    /**
     * \if ENGLISH_LANG
     * Whether or not wear glasses, refer to {@link EM_FACEDETECT_GLASSES_TYPE}
     * \else
     * 是否戴眼镜
     * \endif
     */
    public int                  emGlasses;

    /**
     * \if ENGLISH_LANG
     * Emotion, refer to {@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
     * \else
     * 人脸表情
     * \endif
     */
    public int                  emEmotion;

    /**
     * \if ENGLISH_LANG
     * Complexion, refer to {@link EM_COMPLEXION_TYPE}
     * \else
     * 肤色
     * \endif
     */
    public int                  emComplexion;

    /**
     * \if ENGLISH_LANG
     * Eye state, refer to {@link EM_EYE_STATE_TYPE}
     * \else
     * 眼睛状态
     * \endif
     */
    public int                  emEye;

    /**
     * \if ENGLISH_LANG
     * Mouth state, refer to {@link EM_MOUTH_STATE_TYPE}
     * \else
     * 嘴巴状态
     * \endif
     */
    public int                  emMouth;

    /**
     * \if ENGLISH_LANG
     * Whether or not wear mask, refer to {@link EM_MASK_STATE_TYPE}
     * \else
     * 是否带口罩
     * \endif
     */
    public int                  emMask;


    /**
     * \if ENGLISH_LANG
     * Whehter or not has beard, refer to {@link EM_BEARD_STATE_TYPE}
     * \else
     * 是否有胡子
     * \endif
     */
    public int                  emBeard;

    /**
     * \if ENGLISH_LANG
     * Attractive,0 means unidentification,valid range:1-100,The higer the value,the more attractive
     * \else
     * 魅力值,0表示未识别,识别时范围1-100,得分高魅力高
     * \endif
     */
    public int                  nAttractive;

    /**
     * \if ENGLISH_LANG
     *  euler angle of face in the capture picture, nPitch:pitch of the head, nYaw: yaw of the head, nRoll:roll of the head
     * range of the angle value is [-90,90], stuFaceCaptureAngle is invalid if the three angles are 999.
     * \else
     * 人脸在抓拍图片中的角度信息, nPitch:抬头低头的俯仰角, nYaw左右转头的偏航角, nRoll头在平面内左偏右偏的翻滚角
     * 角度值取值范围[-90,90], 三个角度值都为999表示此角度信息无效
     * \endif
     */
    public NET_EULER_ANGLE      stuFaceCaptureAngle = new NET_EULER_ANGLE();

    /**
     * \if ENGLISH_LANG
     * quality about capture picture
     * \else
     * 人脸抓拍质量分数
     * \endif
     */
    public int                 nFaceQuality;

    /**
     * \if ENGLISH_LANG
     * The score of face picture align.The range is 0~10000,-1 is invalid
     * \else
     * 人脸对齐得分分数,范围 0~10000,-1为无效值
     * \endif
     */
    public int                 nFaceAlignScore;

    /**
     * \if ENGLISH_LANG
     * The score of face picture clarity.The range is 0~10000,-1 is invalid
     * \else
     * 人脸清晰度分数,范围 0~10000,-1为无效值
     * \endif
     */
    public int                  nFaceClarity;
}





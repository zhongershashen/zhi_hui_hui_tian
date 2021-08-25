package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * feature type of detected human face
 * \else
 * 人脸检测对应人脸特征类型
 * \endif
 */
public class EM_FACEDETECT_GLASSES_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_FACEDETECT_GLASSES_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Wear glasses
     * \else
     * 戴眼镜
     * \endif
     */
    public static final int EM_FACEDETECT_WITH_GLASSES = 1;

    /**
     * \if ENGLISH_LANG
     * Without glasses
     * \else
     * 不戴眼镜
     * \endif
     */
    public static final int EM_FACEDETECT_WITHOUT_GLASSES = 2;

}
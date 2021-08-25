package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Temperature information of personnel in the area
 * \else
 * 区域内人员体温信息
 * \endif
 */
public class NET_MAN_TEMP_INFO  implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Object ID
     * \else
     * 物体ID
     * \endif
     */
    public int                 nObjectID;

    /**
     * \if ENGLISH_LANG
     * Personnel head shoulder information, 8192 coordinate system
     * \else
     * 人员头肩信息, 8192坐标系
     * \endif
     */
    public NET_RECT                 stRect = new NET_RECT();


    /**
     * \if ENGLISH_LANG
     * Maximum temperature
     * \else
     * 最高温度
     * \endif
     */
    public double						dbHighTemp;				// Maximum temperature

    /**
     * \if ENGLISH_LANG
     * Temperature unit (0 ° C 1 ° F 2 Kelvin)
     * \else
     * 温度单位(0摄氏度 1华氏度 2开尔文)
     * \endif
     */
    public int                 nTempUnit;

    /**
     * \if ENGLISH_LANG
     * Is it over temperature
     * \else
     * 是否超温
     * \endif
     */
    public boolean            bIsOverTemp;

    /**
     * \if ENGLISH_LANG
     *  Is it low temperature
     * \else
     * 是否低温
     * \endif
     */
    public boolean            bIsUnderTemp;

    /**
     * \if ENGLISH_LANG
     * The shift of small face image feature value in binary data block
     * \else
     * 人脸小图特征值在二进制数据块中的偏移
     * \endif
     */
    public int                 nOffset;

    /**
     * \if ENGLISH_LANG
     * Length of eigenvalue of small face image, unit: byte
     * \else
     * 人脸小图特征值长度, 单位:字节
     * \endif
     */
    public int                 nLength;

}

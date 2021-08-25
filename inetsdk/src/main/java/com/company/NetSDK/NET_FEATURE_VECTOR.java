package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Feature data Information
 * \else
 * 存储IVSS项目招行VIP需求,特征值信息
 * \endif
 */
public class NET_FEATURE_VECTOR implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Face feature data offset in data block(Unit:BYTE)
     * \else
     * 人脸小图特征值在二进制数据块中的偏移
     * \endif
     */
    public int				dwOffset;

    /**
     * \if ENGLISH_LANG
     * Face feature data length(Unit:BYTE)
     * \else
     * 人脸小图特征值长度，单位:字节
     * \endif
     */
    public int				dwLength;
}

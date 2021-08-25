package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output param, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_COAXIAL_CONTROL_IO_CAPS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_COAXIAL_CONTROL_IO_CAPS}
 * \endif
 */
public class NET_OUT_GET_COAXIAL_CONTROL_IO_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * whether support control light
     * \else
     * 是否支持白光灯
     * \endif
     */
    public boolean							bSupportControlLight;

    /**
     * \if ENGLISH_LANG
     * whether support control specker audio
     * \else
     * 是否支持speaker音频外放
     * \endif
     */
    public boolean							bSupportControlSpeaker;
}

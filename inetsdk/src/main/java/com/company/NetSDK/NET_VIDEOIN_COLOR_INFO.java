package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the color config of video input, interface {@link INetSDK#GetConfig} and {@link INetSDK#SetConfig}, command paramer {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_VIDEOIN_COLOR}
 * \else
 * 视频输入颜色配置,对应接口 {@link INetSDK#GetConfig} 和 {@link INetSDK#SetConfig},对应命令 {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_VIDEOIN_COLOR}
 * \endif
 */
public class NET_VIDEOIN_COLOR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * config type, you need set the value wether set or get config, refer to {@link NET_EM_CONFIG_TYPE}
     * \else
     * 配置类型，获取和设置时都要制定,参考 {@link NET_EM_CONFIG_TYPE}
     * \endif
     */
    public int	                emCfgType;

    /**
     * \if ENGLISH_LANG
     * Brightness 0-100
     * \else
     * 亮度0-100
     * \endif
     */
    public int					nBrightness;

    /**
     * \if ENGLISH_LANG
     * nContrast 0-100
     * \else
     * 对比度0-100
     * \endif
     */
    public int					nContrast;

    /**
     * \if ENGLISH_LANG
     * Saturation 0-100
     * \else
     * 饱和度0-100
     * \endif
     */
    public int					nSaturation;

    /**
     * \if ENGLISH_LANG
     * Gamma 0-100
     * \else
     * 伽马值0-100
     * \endif
     */
    public int					nGamma;
}

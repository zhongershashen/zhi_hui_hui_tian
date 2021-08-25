package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output param, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_LIGHTINGCONTROL_CAPS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_LIGHTINGCONTROL_CAPS}
 * \endif
 */
public class NET_OUT_LIGHTINGCONTROL_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Is supported light control
     * \else
     * 是否支持灯光控制
     * \endif
     */
    public boolean								bSupport;

    /**
     * \if ENGLISH_LANG
     * supported light config version,refer to EM_LC_CONFIG_VERSION
     * \else
     * 支持的灯光配置版本,对应 EM_LC_CONFIG_VERSION
     * \endif
     */
    public int								emConfigVersion;
}
package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * Get PTZ capability set information, the corresponding interface {@link INetSDK#QueryNewSystemInfo},,the corresponding command {@link FinalVar#CFG_CAP_CMD_PTZ}
 * \else
 * 获取云台能力集信息, 对应接口 {@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_CAP_CMD_PTZ}
 * \endif
 */
public class CFG_PTZ_PROTOCOL_CAPS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether or not support the wipers
     * \else
     * 是否支持雨刷
     * \endif
     */
    public boolean                    bWiper;

    /**
     * \if ENGLISH_LANG
     * Whether to support accessibility
     * \else
     * 是否支持辅助功能
     * \endif
     */
    public boolean                    bAux;                       // 是否支持辅助功能

    /**
     * \if ENGLISH_LANG
     * PTZ auxiliary function names list
     * \else
     * 云台辅助功能名称列表
     * \endif
     */
    public byte                       szAuxs[][] = new byte[FinalVar.CFG_COMMON_STRING_32][FinalVar.CFG_COMMON_STRING_32];

}

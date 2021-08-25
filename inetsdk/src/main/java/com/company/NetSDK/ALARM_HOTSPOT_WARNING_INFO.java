package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* hotspot warning, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_HOTSPOT_WARNING}
* \else
* 热成像热点异常报警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_HOTSPOT_WARNING}
* \endif
*/
public class ALARM_HOTSPOT_WARNING_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * 0:start 1:stop
	 * \else
	 * 0:开始 1:停止
	 * \endif
	 */
    public int                 nAction;                        
    
	 /**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 视频通道号
	 * \endif
	 */
    public int                 nChannelID;                     
    
	 /**
	 * \if ENGLISH_LANG
	 * hotspot point, 0~8192
	 * \else
	 * 热点的坐标,坐标值 0~8192
	 * \endif
	 */
    public SDK_POINT           stuCoordinate = new SDK_POINT();                   
    
	 /**
	 * \if ENGLISH_LANG
	 * hotspot value
	 * \else
	 * 热点温度值
	 * \endif
	 */
    public float               fHotSpotValue;                  
    
	 /**
	 * \if ENGLISH_LANG
	 * temperature unit, refer to {@link CFG_TEMPERATURE_UNIT}
	 * \else
	 * 温度单位(当前配置的温度单位), 取值参考 {@link CFG_TEMPERATURE_UNIT}
	 * \endif
	 */
    public int                 nTemperatureUnit;               
}

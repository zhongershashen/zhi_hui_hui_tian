package com.company.NetSDK;
import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * input parameter of {@link INetSDK#AdjustRelativeLensFocus}
 * \else
 * {@link INetSDK#AdjustRelativeLensFocus} 接口输入参数
 * \endif
 */
public class NET_IN_ADJUSTRELATIVELENSFOCUS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * video channel number
	 * \else
	 * 视频通道号
	 * \endif
	 */
	public int                            nChannel;

	/**
	 * \if ENGLISH_LANG
	 * command information
	 * \else
	 * 命令信息
	 * \endif
	 */
	public NET_CMD_INFO                    stuCmdInfo = new NET_CMD_INFO();
}

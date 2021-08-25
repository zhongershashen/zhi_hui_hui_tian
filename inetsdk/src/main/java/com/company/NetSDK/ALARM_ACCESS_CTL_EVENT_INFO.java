package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access Control Event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_ACCESS_CTL_EVENT}
 * \else
 * 门禁事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_ACCESS_CTL_EVENT}
 * \endif
 */
public class ALARM_ACCESS_CTL_EVENT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Door Channel No.
	 * \else
	 * 门通道号
	 * \endif
	 */
	public int                         nDoor;
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Name
	 * \else
	 * 门禁名称
	 * \endif
	 */
	public byte                        szDoorName[] = new byte[FinalVar.SDK_MAX_DOORNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * 报警事件发生的时间
	 * \endif
	 */
	public NET_TIME                    stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Event Type, refer to {@link NET_ACCESS_CTL_EVENT_TYPE}
	 * \else
	 * 门禁事件类型,取值参考 {@link NET_ACCESS_CTL_EVENT_TYPE}
	 * \endif
	 */
	public int                         emEventType;
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Event Type
	 * \else
	 * 刷卡结果，TRUE表示成功，FALSE表示失败
	 * \endif
	 */
	public boolean                     bStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * Card Type, refer to {@link NET_ACCESSCTLCARD_TYPE}
	 * \else
	 * 卡类型,取值参考 {@link NET_ACCESSCTLCARD_TYPE}
	 * \endif
	 */
	public int                         emCardType;
	
	/**
	 * \if ENGLISH_LANG
	 * Unlock Method. refer to {@link NET_ACCESS_DOOROPEN_METHOD}
	 * \else
	 * 开门方式,取值参考 {@link NET_ACCESS_DOOROPEN_METHOD}
	 * \endif
	 */
	public int                         emOpenMethod;
	
	/**
	 * \if ENGLISH_LANG
	 * Card No.
	 * \else
	 * 卡号
	 * \endif
	 */
	public byte                        szCardNo[] = new byte[FinalVar.SDK_MAX_CARDNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte                        szPwd[] = new byte[FinalVar.SDK_MAX_CARDPWD_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Reader ID
	 * \else
	 * 门读卡器ID
	 * \endif
	 */
	public byte                        szReaderID[] = new byte[FinalVar.SDK_COMMON_STRING_32];

	/**
	 * \if ENGLISH_LANG
	 * unlock user
	 * \else
	 * 开门用户
	 * \endif
	 */
	public byte                        szUserID[] = new byte[FinalVar.SDK_COMMON_STRING_64];

	/**
	 * \if ENGLISH_LANG
	 * snapshot picture storage address
	 * \else
	 * 抓拍照片存储地址
	 * \endif
	 */
	public byte                        szSnapURL[] = new byte[FinalVar.SDK_COMMON_STRING_256];

	/**
	 * \if ENGLISH_LANG
	 * Reason of unlock failure, only because it is valid when bStatus is FALSE
	 * \else
	 * 开门失败的原因,仅在bStatus为FALSE时有效
	 * \endif
	 */
	public int                         nErrorCode;

	/**
	 * \if ENGLISH_LANG
	 * punching record number
	 * \else
	 * 刷卡记录集中的记录编号
	 * \endif
	 */
	public int                         nPunchingRecNo;

	/**
	 * \if ENGLISH_LANG
	 * pic Numbers
	 * \else
	 * 抓图张数
	 * \endif
	 */
	public int                         nNumbers;

	/**
	 * \if ENGLISH_LANG
	 * Card Status {@link NET_ACCESSCTLCARD_STATE}
	 * \else
	 * 卡状态 {@link NET_ACCESSCTLCARD_STATE}
	 * \endif
	 */
	public int                         emStatus;

	/**
	 * \if ENGLISH_LANG
	 *  wireless deivce serial number
	 * \else
	 * 智能锁序列号
	 * \endif
	 */
	public byte                        szSN[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * attend state {@link NET_ATTENDANCESTATE}
	 * \else
	 * 考勤状态 {@link NET_ATTENDANCESTATE}
	 * \endif
	 */
	public int                         emAttendanceState;

	/**
	 * \if ENGLISH_LANG
	 *  QRcode
	 * \else
	 * 二维码
	 * \endif
	 */
	public byte                        szQRCode[] = new byte[512];

	/**
	 * \if ENGLISH_LANG
	 *  Floor of Call Lift
	 * \else
	 * 呼梯楼层号
	 * \endif
	 */
	public byte                        szCallLiftFloor[] = new byte[16];

}

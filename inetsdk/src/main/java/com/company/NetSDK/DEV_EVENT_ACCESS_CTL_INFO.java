package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * }DEV_ACCESS_CTL_IMAGE_INFO;
 * \else
 * 事件类型 EVENT_IVS_ACCESS_CTL(门禁事件)对应数据块描述信息
 * \endif
 */
public class DEV_EVENT_ACCESS_CTL_INFO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Door Channel Number
	 * \else
	 * 门通道号
	 * \endif
	 */
	public int                         nChannelID;

	/**
	 * \if ENGLISH_LANG
	 * Entrance Guard Name
	 * \else
	 * 事件名称
	 * \endif
	 */
	public byte                        szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Time stamp (Unit:ms)
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
	public double              		PTS;

	/**
	 * \if ENGLISH_LANG
	 * Event occurrence time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX         		UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * Event ID
	 * \else
	 * 事件ID
	 * \endif
	 */
	public int                 		nEventID;

	/**
	 * \if ENGLISH_LANG
	 * have being detected object
	 * \else
	 * 检测到的物体
	 * \endif
	 */
	public SDK_MSG_OBJECT           	stuObject = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * The corresponding file info of the event
	 * \else
	 * 事件对应文件信息
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO			stuFileInfo = new SDK_EVENT_FILE_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Entrance Guard Event Type {@link NET_ACCESS_CTL_EVENT_TYPE}
	 * \else
	 * 门禁事件类型 {@link NET_ACCESS_CTL_EVENT_TYPE}
	 * \endif
	 */
	public int   emEventType;

	/**
	 * \if ENGLISH_LANG
	 * Swing Card Result,True is Success,False is Fail
	 * \else
	 * 刷卡结果,TRUE表示成功,FALSE表示失败
	 * \endif
	 */
	public boolean                        bStatus;

	/**
	 * \if ENGLISH_LANG
	 * Card Type {@link NET_ACCESSCTLCARD_TYPE}
	 * \else
	 * 卡类型 {@link NET_ACCESSCTLCARD_TYPE}
	 * \endif
	 */
	public int      emCardType;

	/**
	 * \if ENGLISH_LANG
	 * Open The Door Method {@link NET_ACCESS_DOOROPEN_METHOD}
	 * \else
	 * 开门方式 {@link NET_ACCESS_DOOROPEN_METHOD}
	 * \endif
	 */
	public  int emOpenMethod;

	/**
	 * \if ENGLISH_LANG
	 * Card Number
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
	public byte                        szSnapURL[] = new byte[FinalVar.SDK_COMMON_STRING_128];

	/**
	 * \if ENGLISH_LANG
	 * Reason of unlock failure, only because it is valid when bStatus is FALSE
	 * 0x00 no error
	 * 0x10 unauthorized
	 * 0x11 card lost or cancelled
	 * 0x12 no door right
	 * 0x13 unlock mode error
	 * 0x14 valid period error
	 * 0x15 anti sneak into mode
	 * 0x16 forced alarm not unlocked
	 * 0x17 door NC status
	 * 0x18 AB lock status
	 * 0x19 patrol card
	 * 0x1A device is under intrusion alarm status
	 * 0x20 period error
	 * 0x21 unlock period error in holiday period
	 * 0x30 first card right check required
	 * 0x40 card correct, input password error
	 * 0x41 card correct, input password timed out
	 * 0x42 card correct, input fingerprint error
	 * 0x43 card correct, input fingerprint timed out
	 * 0x44 fingerprint correct, input password error
	 * 0x45 fingerprint correct, input password timed out
	 * 0x50 group unlock sequence error
	 * 0x51 test required for group unlock
	 * 0x60 test passed, control unauthorized
	 * 0x61 card correct, input face error
	 * 0x62 card correct, input face timed out
	 * 0x63 repeat enter
	 * 0x64 unauthorized, requiring back-end platform identification
	 * 0x65 high body temperature
	 * 0x66	no mask
	 * 0x67 get health code fail
	 * 0x68 No Entry because of yellow code
	 * 0x69 No Entry because of red code
	 * 0x6a health code is invalid
	 * 0x6b entry because of green code
	 * 0x70 get health code info
	 * \else
	 * 开门失败的原因,仅在bStatus为FALSE时有效
	 *     0x00 没有错误
	 *     0x10 未授权
	 *     0x11 卡挂失或注销
	 *     0x12 没有该门权限
	 *     0x13 开门模式错误
	 *     0x14 有效期错误
	 *     0x15 防反潜模式
	 *     0x16 胁迫报警未打开
	 *     0x17 门常闭状态
	 *     0x18 AB互锁状态
	 *     0x19 巡逻卡
	 *     0x1A 设备处于闯入报警状态
	 *     0x20 时间段错误
	 *     0x21 假期内开门时间段错误
	 *     0x30 需要先验证有首卡权限的卡片
	 *     0x40 卡片正确,输入密码错误
	 *     0x41 卡片正确,输入密码超时
	 *     0x42 卡片正确,输入指纹错误
	 *     0x43 卡片正确,输入指纹超时
	 *     0x44 指纹正确,输入密码错误
	 *     0x45 指纹正确,输入密码超时
	 *     0x50 组合开门顺序错误
	 *     0x51 组合开门需要继续验证
	 *     0x60 验证通过,控制台未授权
	 *     0x61 卡片正确,人脸错误
	 *     0x62 卡片正确,人脸超时
	 *     0x63 重复进入
	 *     0x64 未授权,需要后端平台识别
	 *     0x65 体温过高
	 *     0x66	未戴口罩
	 *     0x67 健康码获取失败
	 *     0x68 黄码禁止通行
	 *     0x69 红码禁止通行
	 *     0x6a 健康码无效
	 *     0x6b 绿码验证通过
	 *     0x70 获取健康码信息
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
	 * picture Numbers
	 * \else
	 * 抓图张数
	 * \endif
	 */
	public int							nNumbers;

	/**
	 * \if ENGLISH_LANG
	 * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
	 * \else
	 * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
	 * \endif
	 */
	public byte						byImageIndex;

	/**
	 * \if ENGLISH_LANG
	 * Snap flag(by bit)0 bit:"*",1 bit:"Timing",2 bit:"Manual",3 bit:"Marked",4 bit:"Event",5 bit:"Mosaic",6 bit:"Cutout"
	 * \else
	 * 抓图标志(按位),具体见 NET_RESERVED_COMMON
	 * \endif
	 */
	public int						dwSnapFlagMask;

	/**
	 * \if ENGLISH_LANG
	 * Attendance state {@link NET_ATTENDANCESTATE}
	 * \else
	 * 考勤状态 {@link NET_ATTENDANCESTATE}
	 * \endif
	 */
	public int         emAttendanceState;

	/**
	 * \if ENGLISH_LANG
	 * Class number(Kenya custom)
	 * \else
	 * 班级（考勤肯尼亚定制）
	 * \endif
	 */
	public byte						szClassNumber[] = new byte[FinalVar.MAX_CLASS_NUMBER_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Phone number(Kenya custom)
	 * \else
	 * 电话（考勤肯尼亚定制）
	 * \endif
	 */
	public byte						szPhoneNumber[] = new byte[FinalVar.MAX_PHONENUMBER_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Card name
	 * \else
	 * 卡命名
	 * \endif
	 */
	public byte						szCardName[] = new byte[FinalVar.SDK_MAX_CARDNAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Face recognition similarity,range is 0~100
	 * \else
	 * 人脸识别相似度,范围为0~100
	 * \endif
	 */
	public int                          uSimilarity;

	/**
	 * \if ENGLISH_LANG
	 * Image information
	 * \else
	 * 图片信息
	 * \endif
	 */
	public DEV_ACCESS_CTL_IMAGE_INFO	stuImageInfo[] = new DEV_ACCESS_CTL_IMAGE_INFO[6];

	/**
	 * \if ENGLISH_LANG
	 * Image information count
	 * \else
	 * 图片信息数量
	 * \endif
	 */
	public int							nImageInfoCount;

	/**
	 * \if ENGLISH_LANG
	 * Citizen ID
	 * \else
	 * 身份证号
	 * \endif
	 */
	public byte						szCitizenIDNo[] = new byte[20];

	/**
	 * \if ENGLISH_LANG
	 * Event group ID
	 * \else
	 * 事件组ID
	 * \endif
	 */
	public int						nGroupID;

	/**
	 * \if ENGLISH_LANG
	 * Companion card count
	 * \else
	 * 陪同者卡号个数
	 * \endif
	 */
	public int				            nCompanionCardCount;

	/**
	 * \if ENGLISH_LANG
	 * Companion card information
	 * \else
	 * 陪同者卡号信息
	 * \endif
	 */
	public byte				        szCompanionCards[][] = new byte[FinalVar.MAX_COMPANION_CARD_NUM][FinalVar.SDK_MAX_CARDINFO_LEN];

    /**
     * \if ENGLISH_LANG
     * custom worker info
     * \else
     * 定制人员信息
     * \endif
     */
    public DEV_ACCESS_CTL_CUSTOM_WORKER_INFO stuCustomWorkerInfo = new DEV_ACCESS_CTL_CUSTOM_WORKER_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Whether the information of human body temperature is valid
	 * \else
	 * 人员温度信息是否有效
	 * \endif
	 */
	public boolean						bManTemperature;

	/**
	 * \if ENGLISH_LANG
	 * Information of human body temperature, It is valid whne bManTemperature is TURE
	 * \else
	 * 人员温度信息, bManTemperature 为TRUE时有效
	 * \endif
	 */
	public NET_MAN_TEMPERATURE_INFO	                       stuManTemperatureInfo = new NET_MAN_TEMPERATURE_INFO();

    public DEV_EVENT_ACCESS_CTL_INFO() {
        for (int i = 0; i < stuImageInfo.length; ++i) {
            stuImageInfo[i] = new DEV_ACCESS_CTL_IMAGE_INFO();
        }
    }
}

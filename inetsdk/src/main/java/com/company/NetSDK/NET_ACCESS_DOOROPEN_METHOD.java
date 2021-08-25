package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Unlock Method(Access control event,entry/exit record, actual unlock method)
 * \else
 * 开门方式(门禁事件,门禁出入记录,实际的开门方式)
 * \endif
 */
public class NET_ACCESS_DOOROPEN_METHOD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Password Unlock
	 * \else
	 * 密码开锁
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_PWD_ONLY = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Swipe Unlock
	 * \else
	 * 刷卡开锁
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_CARD = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * SwipeCard and Unlock with Password
	 * \else
	 * 先刷卡后密码开锁
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_FIRST = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * InputPassword and Swipe Card to Unlock
	 * \else
	 * 先密码后刷卡开锁
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_PWD_FIRST = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Remotely Unlock，such as unlock VTO via VTH or platform
	 * \else
	 * 远程开锁，如通过室内机或者平台对门口机开锁
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_REMOTE = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Unlock via Button
	 * \else
	 * 开锁按钮进行开锁
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_BUTTON = 6;

	/**
	 * \if ENGLISH_LANG
	 * fingerprint lock
	 * \else
	 * 指纹开锁
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_FINGERPRINT = 7;

	/**
	 * \if ENGLISH_LANG
	 * password+swipe card+fingerprint combination unlock
	 * \else
	 * 密码+刷卡+指纹组合开锁
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_PWD_CARD_FINGERPRINT = 8;

	/**
	 * \if ENGLISH_LANG
	 * password+fingerprint combination unlock
	 * \else
	 * 密码+指纹组合开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_PWD_FINGERPRINT = 10;

	/**
	 * \if ENGLISH_LANG
	 * swipe card+fingerprint combination unlock
	 * \else
	 * 刷卡+指纹组合开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_FINGERPRINT = 11;

	/**
	 * \if ENGLISH_LANG
	 *  multi-people unlock
	 * \else
	 * 多人开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_PERSONS = 12;

	/**
	 * \if ENGLISH_LANG
	 * Key
	 * \else
	 * 钥匙开门
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_KEY = 13;

	/**
	 * \if ENGLISH_LANG
	 * Use force password to open the door
	 * \else
	 * 胁迫密码开门
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_COERCE_PWD = 14;

	/**
	 * \if ENGLISH_LANG
	 * Use QR Code
	 * \else
	 * 二维码开门
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_QRCODE = 15;

	/**
	 * \if ENGLISH_LANG
	 * face recogniton to open the door
	 * \else
	 * 人脸识别开门
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_FACE_RECOGNITION = 16;

	/**
	 * \if ENGLISH_LANG
	 * comparsion of face and ID card
	 * \else
	 * 人证对比
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_FACEIDCARD = 18;

	/**
	 * \if ENGLISH_LANG
	 * ID card  and compasion of face and ID card
	 * \else
	 * 身份证+ 人证比对
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_FACEIDCARD_AND_IDCARD = 19;

	/**
	 * \if ENGLISH_LANG
	 * Bluetooth
	 * \else
	 * 蓝牙开门
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_BLUETOOTH = 20;

	/**
	 * \if ENGLISH_LANG
	 * Custom password
	 * \else
	 * 个性化密码开门
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_CUSTOM_PASSWORD = 21;

	/**
	 * \if ENGLISH_LANG
	 * UserID and password
	 * \else
	 * UserID+密码
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_USERID_AND_PWD = 22;

	/**
	 * \if ENGLISH_LANG
	 * Face and password
	 * \else
	 * 人脸+密码开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_FACE_AND_PWD = 23;

	/**
	 * \if ENGLISH_LANG
	 * Fingerprint and password
	 * \else
	 * 指纹+密码开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_FINGERPRINT_AND_PWD = 24;

	/**
	 * \if ENGLISH_LANG
	 * FingerPrint and face
	 * \else
	 * 指纹+人脸开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_FINGERPRINT_AND_FACE = 25;

	/**
	 * \if ENGLISH_LANG
	 * Card and face
	 * \else
	 * 刷卡+人脸开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_AND_FACE = 26;

	/**
	 * \if ENGLISH_LANG
	 * Face or password
	 * \else
	 * 人脸或密码开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_FACE_OR_PWD = 27;

	/**
	 * \if ENGLISH_LANG
	 * Fingerprint or password
	 * \else
	 * 指纹或密码开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_FINGERPRINT_OR_PWD = 28;

	/**
	 * \if ENGLISH_LANG
	 * Fingerprint or face
	 * \else
	 * 指纹或人脸开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_FINGERPRINT_OR_FACE = 29;

	/**
	 * \if ENGLISH_LANG
	 * Card or face
	 * \else
	 * 刷卡或人脸开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_OR_FACE = 30;

	/**
	 * \if ENGLISH_LANG
	 * Card or fingerprint
	 * \else
	 * 刷卡或指纹开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_OR_FINGERPRINT = 31;

	/**
	 * \if ENGLISH_LANG
	 * Fingerprint and face and password
	 * \else
	 * 指纹+人脸+密码开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_FINGERPRINT_AND_FACE_AND_PWD   = 32;

	/**
	 * \if ENGLISH_LANG
	 * Card and face and password
	 * \else
	 * 刷卡+人脸+密码开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_AND_FACE_AND_PWD = 33;

	/**
	 * \if ENGLISH_LANG
	 * Card and fingerprint and password
	 * \else
	 * 刷卡+指纹+密码开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_AND_FINGERPRINT_AND_PWD = 34;

	/**
	 * \if ENGLISH_LANG
	 * Card and password and face
	 * \else
	 * 卡+指纹+人脸组合开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_AND_PWD_AND_FACE = 35;

	/**
	 * \if ENGLISH_LANG
	 * Fingerprint or face or password
	 * \else
	 * 指纹或人脸或密码
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_FINGERPRINT_OR_FACE_OR_PWD = 36;

	/**
	 * \if ENGLISH_LANG
	 * Card or face or password
	 * \else
	 * 卡或人脸或密码开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_OR_FACE_OR_PWD = 37;

	/**
	 * \if ENGLISH_LANG
	 * Card or fingerprint or face
	 * \else
	 * 卡或指纹或人脸开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_OR_FINGERPRINT_OR_FACE = 38;

	/**
	 * \if ENGLISH_LANG
	 * Card and fingerprint and face and password
	 * \else
	 * 卡+指纹+人脸+密码组合开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_AND_FINGERPRINT_AND_FACE_AND_PWD = 39;

	/**
	 * \if ENGLISH_LANG
	 * Card or fingerprint or face or password
	 * \else
	 * 卡或指纹或人脸或密码开锁
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_OR_FINGERPRINT_OR_FACE_OR_PWD     = 40;

	/**
	 * \if ENGLISH_LANG
	 * ID card  and compasion of face and ID card or card or face
	 * \else
	 * (身份证+人证比对)或 刷卡 或 人脸
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_FACEIPCARDANDIDCARD_OR_CARD_OR_FACE    = 41;

	/**
	 * \if ENGLISH_LANG
	 * ID card  and compasion of face or card or face
	 * \else
	 * 人证比对 或 刷卡(二维码) 或 人脸
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_FACEIDCARD_OR_CARD_OR_FACE = 42;

	/**
	 * \if ENGLISH_LANG
	 * DTMF unlock(include SIPINFO,RFC2833,INBAND)
	 * \else
	 * DTMF开锁(包括SIPINFO,RFC2833,INBAND)
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_DTMF = 43;

	/**
	 * \if ENGLISH_LANG
	 * remote QR code to open the door
	 * \else
	 * 远程二维码开门
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_REMOTE_QRCODE = 44;

	/**
	 * \if ENGLISH_LANG
	 * remote face to open the door
	 * \else
	 * 远程人脸开门
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_REMOTE_FACE = 45;

	/**
	 * \if ENGLISH_LANG
	 * Citizen picture(fingerprint)
	 * \else
	 * 人证比对开门(指纹)
	 * \endif
	 */
    public static final int NET_ACCESS_DOOROPEN_METHOD_CITIZEN_FINGERPRINT = 46;
}

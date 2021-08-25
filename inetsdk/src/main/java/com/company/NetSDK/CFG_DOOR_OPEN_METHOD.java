package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Open the door way
 * \else
 * 开门方式
 * \endif
 */

public class CFG_DOOR_OPEN_METHOD implements Serializable {
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
    public static final int CFG_DOOR_OPEN_METHOD_UNKNOWN = 0;
    /**
     * \if ENGLISH_LANG
     * Allowing only password lock
     * \else
     * 只允许密码开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_PWD_ONLY = 1;
    /**
     * \if ENGLISH_LANG
     * Only allow swipe to unlock
     * \else
     * 只允许刷卡开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARD = 2;
    /**
     * \if ENGLISH_LANG
     * Password or swipe to unlock
     * \else
     * 密码或刷卡开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_PWD_OR_CARD = 3;
    /**
     * \if ENGLISH_LANG
     * Firstly swipe then password to unlock
     * \else
     * 先刷卡后密码开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARD_FIRST = 4;

    /**
     * \if ENGLISH_LANG
     * Firstly passwords,then swipe to unlock
     * \else
     * 先密码后刷卡开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_PWD_FIRST = 5;
    /**
     * \if ENGLISH_LANG
     * Period of time to open the door
     * \else
     * 分时段开门
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_SECTION = 6;
    /**
     * \if ENGLISH_LANG
     * Only allow finger print to unlock
     * \else
     * 仅指纹开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FINGERPRINTONLY = 7;
    /**
     * \if ENGLISH_LANG
     * Allow passwords or card or finger print to unlock
     * \else
     * 密码或刷卡或指纹开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_PWD_OR_CARD_OR_FINGERPRINT = 8;

    /**
     * \if ENGLISH_LANG
     * Password and swip and finger print combined to unlock
     * \else
     * 密码+刷卡+指纹组合开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_PWD_AND_CARD_AND_FINGERPINT    = 9;
    /**
     * \if ENGLISH_LANG
     * Password and finger print combined to unlock
     * \else
     * 密码+指纹组合开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_PWD_AND_FINGERPRINT            = 10;
    /**
     * \if ENGLISH_LANG
     * Allow card and finger print to unlock
     * \else
     * 刷卡+指纹开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARD_AND_FINGERPRINT           = 11;
    /**
     * \if ENGLISH_LANG
     * Only allow multi persons together to unlock
     * \else
     * 多人开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_MULTI_PERSON                   = 12;
    /**
     * \if ENGLISH_LANG
     * comparsion of face and ID card
     * \else
     * 人证对比
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FACEIDCARD						= 13;
    /**
     * \if ENGLISH_LANG
     * ID card  and compasion of face and ID card
     * \else
     * 身份证+ 人证比对
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FACEIDCARD_AND_IDCARD			= 14;
    /**
     * \if ENGLISH_LANG
     * comparsion of face and ID card or card or finger print
     * \else
     *  人证比对或刷卡或指纹
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FACEIDCARD_OR_CARD_OR_FINGER	= 15;
    /**
     * \if ENGLISH_LANG
     * ID card  and compasion of face and ID card or card or finger print
     * \else
     * (身份证+认证比对)或刷卡或指纹
     * \endif
     */
    public static final int  CFG_DOOR_OPEN_METHOD_FACEIPCARDANDIDCARD_OR_CARD_OR_FINGER	= 16;
    /**
     * \if ENGLISH_LANG
     * UserID and password
     * \else
     *  UserID+密码
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_USERID_AND_PWD                 = 17;
    /**
     * \if ENGLISH_LANG
     * Allowing only face lock
     * \else
     * 只允许人脸开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FACE_ONLY                      = 18;
    /**
     * \if ENGLISH_LANG
     * Face and password
     * \else
     * 人脸+密码开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FACE_AND_PWD                   = 19;
    /**
     * \if ENGLISH_LANG
     * Fingerprint and password
     * \else
     * 指纹+密码开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FINGERPRINT_AND_PWD            = 20;
    /**
     * \if ENGLISH_LANG
     * FingerPrint and face
     * \else
     * 指纹+人脸开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FINGERPRINT_AND_FACE           = 21;
    /**
     * \if ENGLISH_LANG
     * Card and face
     * \else
     * 刷卡+人脸开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARD_AND_FACE                  = 22;
    /**
     * \if ENGLISH_LANG
     * Face and password
     * \else
     * 人脸或密码开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FACE_OR_PWD                    = 23;
    /**
     * \if ENGLISH_LANG
     * Fingerprint or password
     * \else
     * 指纹或密码开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FINGERPRINT_OR_PWD             = 24;
    /**
     * \if ENGLISH_LANG
     * Fingerprint or face
     * \else
     * 指纹或人脸开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FINGERPRINT_OR_FACE            = 25;
    /**
     * \if ENGLISH_LANG
     * Card or face
     * \else
     * 刷卡或人脸开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARD_OR_FACE                   = 26;
    /**
     * \if ENGLISH_LANG
     * Card or fingerprint
     * \else
     * 刷卡或指纹开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARD_OR_FINGERPRINT            = 27;
    /**
     * \if ENGLISH_LANG
     * Fingerprint and face and password
     * \else
     * 指纹+人脸+密码开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FINGERPRINT_AND_FACE_AND_PWD   = 28;
    /**
     * \if ENGLISH_LANG
     * Card and face and password
     * \else
     * 刷卡+人脸+密码开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARD_AND_FACE_AND_PWD          = 29;
    /**
     * \if ENGLISH_LANG
     * Card and fingerprint and password
     * \else
     * 刷卡+指纹+密码开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARD_AND_FINGERPRINT_AND_PWD   = 30;
    /**
     * \if ENGLISH_LANG
     * Card and password and face
     * \else
     *卡+密码+人脸组合开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARD_AND_PWD_AND_FACE          = 31;
    /**
     * \if ENGLISH_LANG
     * Fingerprint or face or password
     * \else
     * 指纹或人脸或密码
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FINGERPRINT_OR_FACE_OR_PWD     = 32;   //
    /**
     * \if ENGLISH_LANG
     * Card or face or password
     * \else
     * 卡或人脸或密码开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARD_OR_FACE_OR_PWD               = 33;
    /**
     * \if ENGLISH_LANG
     * Card or fingerprint or face
     * \else
     * 卡或指纹或人脸开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARD_OR_FINGERPRINT_OR_FACE    = 34;
    /**
     * \if ENGLISH_LANG
     * Card and fingerprint and face and password
     * \else
     * 卡+指纹+人脸+密码组合开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARD_AND_FINGERPRINT_AND_FACE_AND_PWD  = 35;
    /**
     * \if ENGLISH_LANG
     * Card or fingerprint or face or password
     * \else
     * 卡或指纹或人脸或密码开锁
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARD_OR_FINGERPRINT_OR_FACE_OR_PWD     = 36;
    /**
     * \if ENGLISH_LANG
     * ID card  and compasion of face and ID card or card or face
     * \else
     * (身份证+人证比对)或 刷卡 或 人脸
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FACEIPCARDANDIDCARD_OR_CARD_OR_FACE    = 37;
    /**
     * \if ENGLISH_LANG
     * ID card  and compasion of face or card or face
     * \else
     * 人证比对 或 刷卡(二维码) 或 人脸
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_FACEIDCARD_OR_CARD_OR_FACE        = 38;
    /**
     * \if ENGLISH_LANG
     * Card and password or fingerprint and password
     * \else
     * 卡+密码）或（指纹+密码）默认为2
     * \endif
     */
    public static final int CFG_DOOR_OPEN_METHOD_CARDANDPWD_OR_FINGERPRINTANDPWD   = 39;

}

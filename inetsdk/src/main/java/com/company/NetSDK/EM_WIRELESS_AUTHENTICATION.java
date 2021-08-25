package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * wireless authentication
 * \else
 * 无线设备认证方式
 * \endif
 */
public class EM_WIRELESS_AUTHENTICATION implements Serializable{
    private static final long serialVersionUID = 1649547293648260901L;


    /**
     * \if ENGLISH_LANG
     * UnKnown
     * \else
     * 未知
     * \endif
     */
    public  final   static  int     EM_WIRELESS_AUTHENTICATION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Open
     * \else
     *  打开
     * \endif
     */
    public  final   static  int     EM_WIRELESS_AUTHENTICATION_OPEN = 1;
    /**
     * \if ENGLISH_LANG
     * SHARED
     * \else
     * SHARDD
     * \endif
     */
    public  final   static  int     EM_WIRELESS_AUTHENTICATION_SHARED = 2;

    /**
     * \if ENGLISH_LANG
     *  WPA
     * \else
     *  WPA
     * \endif
     */
    public  final   static  int     EM_WIRELESS_AUTHENTICATION_WPA = 3;
    /**
     * \if ENGLISH_LANG
     *  WPA-PSK
     * \else
     *  WPA-PSK
     * \endif
     */
    public  final   static  int     EM_WIRELESS_AUTHENTICATION_WPAPSK = 4;

    /**
     * \if ENGLISH_LANG
     *  WPA2
     * \else
     *  WPA2
     * \endif
     */
    public  final   static  int     EM_WIRELESS_AUTHENTICATION_WPA2 = 5;

    /**
     * \if ENGLISH_LANG
     *  WPA2-PSK
     * \else
     *  WPA2-PSK
     * \endif
     */
    public  final   static  int     EM_WIRELESS_AUTHENTICATION_WPA2PSK = 6;

    /**
     * \if ENGLISH_LANG
     *  WPA-NONE
     * \else
     *  WPA-NONE
     * \endif
     */
    public  final   static  int     EM_WIRELESS_AUTHENTICATION_WPANONE = 7;

    /**
     * \if ENGLISH_LANG
     *  WPA-PSK|WPA2-PSK
     * \else
     *  WPA-PSK|WPA2-PSK
     * \endif
     */
    public  final   static  int     EM_WIRELESS_AUTHENTICATION_WPAPSK_WPA2PSK = 8;

    /**
     * \if ENGLISH_LANG
     *   WPA|WPA2
     * \else
     *   WPA|WPA2
     * \endif
     */
    public  final   static  int     EM_WIRELESS_AUTHENTICATION_WPA_WPA2 = 9;

    /**
     * \if ENGLISH_LANG
     *  WPA | WPA-PSK
     * \else
     *  WPA | WPA-PSK
     * \endif
     */
    public  final   static  int     EM_WIRELESS_AUTHENTICATION_WPA_WPAPSK = 10;

    /**
     * \if ENGLISH_LANG
     *  WPA2|WPA2-PSK
     * \else
     *  WPA2|WPA2-PSK
     * \endif
     */
    public  final   static  int     EM_WIRELESS_AUTHENTICATION_WPA2_WPA2PSK = 11;

    /**
     * \if ENGLISH_LANG
     *  WPA|WPA-PSK|WPA2|WPA2-PSK
     * \else
     *  WPA|WPA-PSK|WPA2|WPA2-PSK
     * \endif
     */
    public  final   static  int     EM_WIRELESS_AUTHENTICATION_WPA_WPAPSK_WPA2_WPA2PSK = 12;
}

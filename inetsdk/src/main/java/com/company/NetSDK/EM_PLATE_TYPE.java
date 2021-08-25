package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the tpye of the plate
 * \else
 * 号牌种类
 * \endif
 */
public class EM_PLATE_TYPE implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unkonwn
     * \else
     * 未知
     * \endif
     */
    public static final int EM_PLATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * big car (black words on yellow background)
     * \else
     * 大型汽车（黄底黑字）
     * \endif
     */
    public static final int EM_PLATE_BIGCAR = 1;

    /**
     * \if ENGLISH_LANG
     * small car (white words on blue background)
     * \else
     * 小型汽车（蓝底白字）
     * \endif
     */
    public static final int EM_PLATE_SMALLCAR = 2;

    /**
     * \if ENGLISH_LANG
     * embassy car (white words on black background, and the '使' is red)
     * \else
     * 使馆汽车（黑底白字、红'使'字）
     * \endif
     */
    public static final int EM_PLATE_EMBASSYCAR = 3;

    /**
     * \if ENGLISH_LANG
     * consulate car (white words on black background, and the '领' is red)
     * \else
     * 领馆汽车（黑底白字，红'领'字）
     * \endif
     */
    public static final int EM_PLATE_CONSULATECAR = 4;

    /**
     * \if ENGLISH_LANG
     * abroad car (white/red words on black background)
     * \else
     * 境外汽车（黑底白/红字）
     * \endif
     */
    public static final int EM_PLATE_ABROADCAR = 5;

    /**
     * \if ENGLISH_LANG
     * foreign car (white words on black background)
     * \else
     * 外籍汽车（黑底白字）
     * \endif
     */
    public static final int EM_PLATE_FOREIGNCAR = 6;

    /**
     * \if ENGLISH_LANG
     * police plate
     * \else
     * 警牌
     * \endif
     */
    public static final int EM_PLATE_POLICE = 7;

    /**
     * \if ENGLISH_LANG
     * armed police plate
     * \else
     * 武警牌
     * \endif
     */
    public static final int EM_PLATE_ARMEDPOLICE = 8;

    /**
     * \if ENGLISH_LANG
     * troops plate
     * \else
     * 部队号牌
     * \endif
     */
    public static final int EM_PLATE_TROOPS = 9;

    /**
     * \if ENGLISH_LANG
     * troops plate which is double layer
     * \else
     * 部队双层
     * \endif
     */
    public static final int EM_PLATE_TROOPSDOUBLE = 10;

    /**
     * \if ENGLISH_LANG
     * yellow tail plate which double layer
     * \else
     * 双层黄尾牌
     * \endif
     */
    public static final int EM_PLATE_YELLOWTAILDOUBLE = 11;

    /**
     * \if ENGLISH_LANG
     * coach car plate
     * \else
     * 教练车号牌
     * \endif
     */
    public static final int EM_PLATE_COACHCAR = 12;

    /**
     * \if ENGLISH_LANG
     * personality plate
     * \else
     * 个性号牌
     * \endif
     */
    public static final int EM_PLATE_PERSONALITY = 13;

    /**
     * \if ENGLISH_LANG
     * agricultural plate
     * \else
     * 农用牌
     * \endif
     */
    public static final int EM_PLATE_AGRICULTURAL = 14;

    /**
     * \if ENGLISH_LANG
     * motorcycle plate
     * \else
     * 摩托车号牌
     * \endif
     */
    public static final int EM_PLATE_MOTORCYCLE = 15;

    /**
     * \if ENGLISH_LANG
     * tractor plate
     * \else
     * 拖拉机号牌
     * \endif
     */
    public static final int  EM_PLATE_TRACTOR = 16;

    /**
     * \if ENGLISH_LANG
     * small car (white words on black background)
     * \else
     * 小型汽车(黑底白字)
     * \endif
     */
    public static final int EM_PLATE_SMALLCAR_BLACK = 17;

    /**
     * \if ENGLISH_LANG
     * red plate
     * \else
     * 红牌车
     * \endif
     */
    public static final int EM_PLATE_RED = 18;

    /**
     * \if ENGLISH_LANG
     * blue plate
     * \else
     * 青牌车
     * \endif
     */
    public static final int EM_PLATE_BLUE = 19;

    /**
     * \if ENGLISH_LANG
     * white plate
     * \else
     * 白牌车
     * \endif
     */
    public static final int EM_PLATE_WHITE = 20;

    /**
     * \if ENGLISH_LANG
     * pure electric and new enegry car
     * \else
     * 纯电动新能源小车
     * \endif
     */
    public static final int EM_PLATE_PURE_NEW_SMALLCAR = 21;

    /**
     * \if ENGLISH_LANG
     * hybrid and new enegry car
     * \else
     * 混合新能源小车
     * \endif
     */
    public static final int EM_PLATE_BLEND_NEW_SMALLCAR = 22;

    /**
     * \if ENGLISH_LANG
     * pure electric and new enegry cart
     * \else
     * 纯电动新能源大车
     * \endif
     */
    public static final int EM_PLATE_PURE_NEW_BIGCAR = 23;

    /**
     * \if ENGLISH_LANG
     * hybrid and new enegry cart
     * \else
     * 混合新能源大车
     * \endif
     */
    public static final int EM_PLATE_BLEND_NEW_BIGCAR = 24;
}

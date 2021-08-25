package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * citizen picture compare event,command: {@link FinalVar#EVENT_IVS_CITIZEN_PICTURE_COMPARE}
 * \else
 * 人证比对事件，用实时拍摄的人脸照片，和该人持有的身份证照片进行比对，并上报检测结果,事件类型 {@link FinalVar#EVENT_IVS_CITIZEN_PICTURE_COMPARE}
 * \endif
 */
public class DEV_EVENT_CITIZEN_PICTURE_COMPARE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * channel number,start with 0
     * \else
     * 通道号,从0开始
     * \endif
     */
    public int                 nChannelID;

    /**
     * \if ENGLISH_LANG
     * event action, 0-pulse, -1-unknown
     * \else
     * 事件动作, 0表示脉冲, -1表示未知
     * \endif
     */
    public int                 nEventAction;

    /**
     * \if ENGLISH_LANG
     * time stamp(unit:ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double              dbPTS;

    /**
     * \if ENGLISH_LANG
     * event name
     * \else
     * 事件名称
     * \endif
     */
    public byte[]                szName = new byte[FinalVar.SDK_EVENT_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * evnet time(UTC)
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX         stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * evnet id
     * \else
     * 事件ID
     * \endif
     */
    public int                 nEventID;

    /**
     * \if ENGLISH_LANG
     * compare result,true:success,false:failed
     * \else
     * 人证比对结果,相似度大于等于阈值认为比对成功,true表示成功,false表示失败
     * \endif
     */
    public boolean                bCompareResult;

    /**
     * \if ENGLISH_LANG
     * Similarity,unit:%,rang:[1,100]
     * \else
     * 两张图片的相似度,单位百分比,范围[1,100]
     * \endif
     */
    public byte                nSimilarity;

    /**
     * \if ENGLISH_LANG
     * Threshold,rang:[1,100]
     * \else
     * 检测阈值,范围[1,100]
     * \endif
     */
    public byte                nThreshold;

    /**
     * \if ENGLISH_LANG
     * sex， refer to {@link EM_CITIZENIDCARD_SEX_TYPE}
     * \else
     * 性别,参考 {@link EM_CITIZENIDCARD_SEX_TYPE}
     * \endif
     */
    public int                   emSex;

    /**
     * \if ENGLISH_LANG
     * Ethnicity
     * 0-invalid data，1-Han，2-Mongolian，3-Hui，4-Tibetan，-5-Uygur，6-Miao，7-Yi，8-Zhuang，9-Bouyei，10-Korean，11-Manchu，12-Dong，13-Yao，
     * 14-Bai，15-Tujia，16-Hani，17-Kazak，18-Dai，19-Li，20-Lisu，21-Va，22-She，23-Gaoshan，24-Lahu，25-Shui，26-Dongxiang，27-Naxi，28-Jingpo，
     * 29-Kirgiz，30-Tu，31-Daur，32-Mulam，33-Qoiang，34-Blang，35-Salar，36-Maonan，37-Gelo，38-Xibe，39-Achang，40-Pumi，41-Tajik，42-Nu，43-Ozbek，
     * 44-Russian，45-Ewenkl，46-Deang，47-Bonan，48-Yugur，49-Jing，50-Tatar，51-Drung，52-Oroqen，53-Hezhen，54-Moinba，55-Lhoba，56-Jino
     * \else
     * 民族
     * 0-无效数据，1-汉族，2-蒙古族，3-回族，4-藏族，-5-维吾尔族，6-苗族，7-彝族，8-壮族，9-布依族，10-朝鲜族，11-满族，12-侗族，
     * 13-瑶族，14-白族，15-土家族，16-哈尼族，17-哈萨克族，18-傣族，19-黎族，20-傈僳族，21-佤族，22-畲族，23-高山族，24-拉祜族，
     * 25-水族，26-东乡族，27-纳西族，28-景颇族，-29-柯尔克孜族，0-土族，31-达斡尔族，32-仫佬族，33-羌族，34-布朗族，35-撒拉族，
     * 36-毛南族，37-仡佬族，38-锡伯族，39-阿昌族，40-普米族，41-塔吉克族，42-怒族，43-乌孜别克族，44-俄罗斯族，45-鄂温克族，
     * 46-德昂族，47-保安族，48-裕固族，49-京族，50-塔塔尔族，51-独龙族，52-鄂伦春族，53-赫哲族，54-门巴族，55-珞巴族，56-基诺族
     * \endif
     */
    public int                 nEthnicity;

    /**
     * \if ENGLISH_LANG
     * citizen name
     * \else
     * 居民姓名
     * \endif
     */
    public byte[]                szCitizen = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * address
     * \else
     * 住址
     * \endif
     */
    public byte[]                szAddress = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * citizen number
     * \else
     * 身份证号
     * \endif
     */
    public byte[]                szNumber = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * Authority
     * \else
     * 签发机关
     * \endif
     */
    public byte[]                szAuthority = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * Birth(y-m-d)
     * \else
     * 出生日期(年月日)
     * \endif
     */
    public NET_TIME            stuBirth = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Validity start time(y-m-d)
     * \else
     * 有效期限起始日期(年月日)
     * \endif
     */
    public NET_TIME            stuValidityStart = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * When the value is TRUE, the stop date menas always valid, at this time, the stuValidityEnd is null.
     * \else
     * 该值为 TRUE, 截止日期 表示长期有效,此时 stuValidityEnd 值无意义
     * \endif
     */
    public boolean                bLongTimeValidFlag;

    /**
     * \if ENGLISH_LANG
     * Validity end time(y-m-d)
     * \else
     * 有效期限结束日期(年月日)
     * \endif
     */
    public NET_TIME            stuValidityEnd = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * image info，elememnt 0 indicate snap pic，elememnt 1 indicate citizen pic
     * \else
     * 图片信息，第一张为拍摄照片，第二张为身份证照片
     * \endif
     */
    public CITIZEN_PICTURE_COMPARE_IMAGE_INFO[] stuImageInfo = new CITIZEN_PICTURE_COMPARE_IMAGE_INFO[2];

    public DEV_EVENT_CITIZEN_PICTURE_COMPARE_INFO() {
        for(int i = 0; i < 2; i++) {
            stuImageInfo[i] = new CITIZEN_PICTURE_COMPARE_IMAGE_INFO();
        }
    }

    @Override
    public String toString() {
        return "DEV_EVENT_CITIZEN_PICTURE_COMPARE_INFO{" +
                "nChannelID=" + nChannelID +
                ", nEventAction=" + nEventAction +
                ", dbPTS=" + dbPTS +
                ", szName=" + Arrays.toString(szName) +
                ", stuUTC=" + stuUTC +
                ", nEventID=" + nEventID +
                ", bCompareResult=" + bCompareResult +
                ", nSimilarity=" + nSimilarity +
                ", nThreshold=" + nThreshold +
                ", emSex=" + emSex +
                ", nEthnicity=" + nEthnicity +
                ", szCitizen=" + Arrays.toString(szCitizen) +
                ", szAddress=" + Arrays.toString(szAddress) +
                ", szNumber=" + Arrays.toString(szNumber) +
                ", szAuthority=" + Arrays.toString(szAuthority) +
                ", stuBirth=" + stuBirth +
                ", stuValidityStart=" + stuValidityStart +
                ", bLongTimeValidFlag=" + bLongTimeValidFlag +
                ", stuValidityEnd=" + stuValidityEnd +
                ", stuImageInfo=" + Arrays.toString(stuImageInfo) +
                '}';
    }
}

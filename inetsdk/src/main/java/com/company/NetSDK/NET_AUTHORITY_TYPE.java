package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Permissions List, White List Only 
 * \else
 * 权限列表 , 白名单仅有
 * \endif
 */
public class NET_AUTHORITY_TYPE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Permission Types, refer to {@link EM_NET_AUTHORITY_TYPE}
	 * \else
	 * 权限类型,取值参考 {@link EM_NET_AUTHORITY_TYPE}
	 * \endif
	 */
	 public int                    emAuthorityType;                         
	 
	/**
	 * \if ENGLISH_LANG
	 * Permission Enabled
	 * \else
	 * 权限使能
	 * \endif
	 */
	 public boolean                bAuthorityEnable;                         
}

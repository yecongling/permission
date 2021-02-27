package com.ycl.soft.utils;

import org.apache.commons.codec.binary.Base64;

/**
 * RSA飞对称加密
 */
public class RSACoder {

    /**
     * 加密算法
     */
    public static final String KEY_ALGORITHM = "RSA";

    /**
     * 签名算法
     */
    public static final String SIGNATURE_ALGORITHM = "MD5withRSA";

    /**
     * 公钥
     */
    private static final String PUBLIC_KEY = "RSAPublicKey";
    /**
     * 私钥
     */
    private static final String PRIVATE_KEY = "RSAPrivateKey";

    public static byte[] decryptBASE64(String key) {
        return Base64.decodeBase64(key);
    }

    public static String encryptBASE64(byte[] bytes){
        return Base64.encodeBase64String(bytes);
    }
}

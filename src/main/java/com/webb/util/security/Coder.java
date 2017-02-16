package com.webb.util.security;

import java.security.MessageDigest;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * Hash，一般翻译做“散列”，也有直接音译为”哈希”的，就是把任意长度的输入（又叫做预映射，pre-image），通过散列算法，变换成固定长度的输出，
 * 该输出就是散列值。这种转换是一种压缩映射，也就是，散列值的空间通常远小于输入的空间，不同的输入可能会散列成相同的输出，而不可能从散列值来唯一的确定输入值。
 * 简单的说就是一种将任意长度的消息压缩到某一固定长度的消息摘要的函数。HASH主要用于信息安全领域中加密算法，他把一些不同长度的信息转化成杂乱的128位的编码里,
 * 叫做HASH值.也可以说，hash就是找到一种数据内容和数据存放地址之间的映射关系
 *
 * 1. BASE64：编码格式，而非加密算法; 定义：Base64内容传送编码被设计用来把任意序列的8位字节描述为一种不易被人直接识别的形式。
 * (BASE加密后产生的字节位数是8的倍数，如果不够位数以=符合填充)
 *
 * 2. MD5 (Message Digest algorithm 5，信息摘要算法)
 * (通常我们不直接用MD5加密，通常把MD5产生的字节数组交给BASE64再加密一把，得到相应的字符串)
 *
 * 3. SHA (Secure Hash Algorithm，安全散列算法)
 *
 * @author webb
 * @create 2017-02-15 18:05
 **/
public class Coder {

    public static final String KEY_SHA = "SHA";
    public static final String KEY_MD5 = "MD5";
    public static final String KEY_MAC = "HmacMD5";

    /**
     * BASE64加密
     */
    public static String encryptBASE64(byte[] key) {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

    /**
     * BASE64解密
     */
    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    /**
     * MD5加密
     */
    public static byte[] encryptMD5(byte[] data) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance(KEY_MD5);
        md5.update(data);
        return md5.digest();
    }

    /**
     * SHA加密
     */
    public static byte[] encryptSHA(byte[] data) throws Exception {
        MessageDigest sha = MessageDigest.getInstance(KEY_SHA);
        sha.update(data);
        return sha.digest();
    }
}

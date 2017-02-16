package com.webb.util;

import org.apache.commons.codec.binary.Base64;

import java.math.BigInteger;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Map;

/**
 * 一些简单的加解密算法
 *
 * @author 67345
 * @create 2017-02-15 14:34
 **/
public class EncodeUtils {


    public static String getMD5(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str.getBytes());
        return new BigInteger(1, messageDigest.digest()).toString(16);
    }

    public static byte[] rsaSign(byte[] data, String privateKey) throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, SignatureException {
        byte[] privateKeyBytes = Base64.decodeBase64(privateKey); // 解密由base64编码的私钥
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes); // 构造PKCS8EncodedKeySpec对象
        KeyFactory keyFactory = KeyFactory.getInstance("RSA"); // KEY_ALGORITHM指定的加密算法
        PrivateKey key = keyFactory.generatePrivate(pkcs8EncodedKeySpec); // 取私钥对象
        Signature signature = Signature.getInstance("SHA1withRSA"); // 用私钥对信息生成数字签名
        signature.initSign(key);
        signature.update(data);
        return signature.sign();
    }



    public static void main(String[] args) throws NoSuchAlgorithmException {

        System.out.println(getMD5("aaa"));

    }

}

package com.webb.util.security;

import org.junit.Before;
import org.junit.Test;
import sun.security.rsa.RSACore;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author 67345
 * @create 2017-02-16 10:11
 **/
public class RSACoderTest {
    private String publicKey;
    private String privateKey;

    @Before
    public void setUp() throws Exception {
        Map<String, Object> keyMap = RsaCoder.initKey();

        publicKey = RsaCoder.getPublicKey(keyMap);
        privateKey = RsaCoder.getPrivateKey(keyMap);
        System.out.println("公钥: \n\r" + publicKey);
        System.out.println("私钥: \n\r" + privateKey);
    }

    @Test
    public void test() throws Exception {
        System.out.println("公钥加密 -- 私钥解密");
        String inputStr = "abc";

        byte[] data = inputStr.getBytes();

        byte[] encodeData = RsaCoder.encryptByPublicKey(data, publicKey);

        byte[] decodeData = RsaCoder.decryptByPrivateKey(encodeData, privateKey);

        String outputStr = new String(decodeData);
        System.out.println("加密前：" + inputStr + "\n\r" + "解密后: " + outputStr);
        assertEquals(inputStr, outputStr);
    }

    @Test
    public void testSign() throws Exception {
        System.out.println("私钥加密 -- 公钥解密");
        String inputStr = "sign";

        byte[] data = inputStr.getBytes();

        byte[] encodedData = RsaCoder.encryptByPrivateKey(data, privateKey);

        byte[] decodeData = RsaCoder.decryptByPublicKey(encodedData, publicKey);

        String outputStr = new String(decodeData);
        System.out.println("加密前：" + inputStr + "\n\r" + "解密后：" + outputStr);

        assertEquals(inputStr, outputStr);

        System.out.println("私钥签名 -- 公钥验证签名");

        // 产生签名
        String sign = RsaCoder.sign(encodedData, privateKey);
        System.out.println("签名：" + sign);

        //验证签名
        boolean status = RsaCoder.verify(encodedData, publicKey, sign);
        System.out.println("状态：" + status);

        assertTrue(status);
    }

}

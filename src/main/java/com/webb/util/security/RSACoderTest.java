package com.webb.util.security;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @author 67345
 * @create 2017-02-16 10:11
 **/
public class RSACoderTest {
    private String publicKey;
    private String privateKey;

    @Before
    public void setUp() throws Exception {
        Map<String, Object> keyMap = RsaUtils.initKey();

        publicKey = RsaUtils.getPublicKey(keyMap);
        privateKey = RsaUtils.getPrivateKey(keyMap);
        System.out.println("公钥: \n\r" + publicKey);
        System.out.println("私钥: \n\r" + privateKey);
    }

    @Test
    public void test() throws Exception {
        System.out.println("公钥加密 -- 私钥解密");
        String inputStr = "abc";
        byte[] data = inputStr.getBytes();
        byte[] encodeData = RsaUtils.encryptByPublic(data, publicKey);
        byte[] decodeData = RsaUtils.decryptByPrivateKey(encodeData, publicKey);

        String outputStr = new String(decodeData);
        System.out.println("加密前：" + inputStr + "\n\r" + "解密后: " + outputStr);
        assertEquals(inputStr, outputStr);
    }

}

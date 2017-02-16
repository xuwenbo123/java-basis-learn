package com.webb.util.security;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * @author webb
 * @create 2017-02-16 10:52
 **/
public class CoderTest {

    @Test
    public void test() throws Exception {
        String inputStr = "简单加密";
        System.out.println("原文: " + inputStr);

        byte[] inputData = inputStr.getBytes();
        String code = Coder.encryptBASE64(inputData);

        System.out.println("BASE64加密后: " + code);

        byte[] output = Coder.decryptBASE64(code);

        String outputStr = new String(output);

        System.out.println("BASE64解密后：" + outputStr);

        assertEquals(inputStr, outputStr);

        assertArrayEquals(Coder.encryptMD5(inputData), Coder.encryptMD5(inputData));

        assertArrayEquals(Coder.encryptSHA(inputData), Coder.encryptSHA(inputData));

        BigInteger md5 = new BigInteger(Coder.encryptMD5(inputData));
        System.out.println("MD5: " + md5.toString(16));

        BigInteger sha = new BigInteger(Coder.encryptSHA(inputData));
        System.out.println("SHA: " + sha.toString(32));

    }

}

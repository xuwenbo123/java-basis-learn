package com.webb.basis.thread.core.chapter3.one.three;

/**
 * @author 67345
 * @create 2017-02-18 10:47
 **/
public class Test1 {
    public static void main(String[] args) {
        // 会抛出异常，因为没有对象监视器，也就是没有同步加锁
        try {
            String newString = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

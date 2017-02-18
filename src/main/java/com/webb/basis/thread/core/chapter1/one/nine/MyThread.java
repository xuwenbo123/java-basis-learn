package com.webb.basis.thread.core.chapter1.one.nine;

/**
 * @author 67345
 * @create 2017-02-16 22:01
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;

        for (int i = 0; i < 50000000; i++) {
            Thread.yield();
            count = count + (i + 1);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - beginTime) + "毫秒!");
    }
}

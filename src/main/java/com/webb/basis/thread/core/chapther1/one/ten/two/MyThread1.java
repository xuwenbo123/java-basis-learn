package com.webb.basis.thread.core.chapther1.one.ten.two;

import java.util.Random;

/**
 * @author 67345
 * @create 2017-02-16 22:11
 **/
public class MyThread1 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();

        long addResult = 0;

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult += i;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println(" thread 1 use time = " + (endTime - beginTime));
    }
}
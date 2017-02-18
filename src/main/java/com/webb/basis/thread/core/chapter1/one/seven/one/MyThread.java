package com.webb.basis.thread.core.chapter1.one.seven.one;

/**
 * @author 67345
 * @create 2017-02-16 17:56
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}

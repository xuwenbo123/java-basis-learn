package com.webb.basis.thread.core.chapter2.two.four;

/**
 * @author 67345
 * @create 2017-02-17 14:18
 **/
public class Task {

    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadName = " + Thread.currentThread().getName() + " i = " + (i + 1));
        }

        System.out.println("");

        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName = " + Thread.currentThread().getName() + " i = " + (i + 1));
            }
        }
    }
}

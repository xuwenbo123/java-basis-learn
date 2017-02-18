package com.webb.basis.thread.core.chapter2.two.six;

/**
 * @author 67345
 * @create 2017-02-17 14:32
 **/
public class Task {
    synchronized public void otherMethod() {
        System.out.println("-----------run---otherMethod------");
    }

    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName = " + Thread.currentThread().getName() + " i = " + (i + 1));
            }
        }
    }
}

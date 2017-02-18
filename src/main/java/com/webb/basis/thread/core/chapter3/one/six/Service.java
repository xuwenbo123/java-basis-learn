package com.webb.basis.thread.core.chapter3.one.six;

/**
 * @author 67345
 * @create 2017-02-18 11:24
 **/
public class Service {

    public void testMethod(Object lock) {

        try {
            synchronized (lock) {
                System.out.println("begin wait() ThreadName = " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait() ThreadName = " + Thread.currentThread().getName());
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

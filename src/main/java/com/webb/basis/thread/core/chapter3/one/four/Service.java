package com.webb.basis.thread.core.chapter3.one.four;

/**
 * @author 67345
 * @create 2017-02-18 11:09
 **/
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait()");
                lock.wait();
//                Thread.sleep(4000);
                System.out.println("end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin notify() ThreadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
                lock.notify();
                Thread.sleep(5000);
                System.out.println("end notify() ThreadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.webb.basis.thread.core.chapter2.one.four;

/**
 * @author 67345
 * @create 2017-02-17 11:20
 **/
public class MyObject {

    synchronized public void methodA() {

        try {
            System.out.println("begin methodA threadName = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodB() {
        try {
            System.out.println("begin methodA threadName = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("ebd");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

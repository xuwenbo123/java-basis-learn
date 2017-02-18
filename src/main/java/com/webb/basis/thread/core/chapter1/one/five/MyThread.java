package com.webb.basis.thread.core.chapter1.one.five;

/**
 * @author 67345
 * @create 2017-02-16 17:48
 **/
public class MyThread extends Thread {

    @Override
    public void run() {

        try {
            System.out.println("run threadName = " + this.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName = " + this.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

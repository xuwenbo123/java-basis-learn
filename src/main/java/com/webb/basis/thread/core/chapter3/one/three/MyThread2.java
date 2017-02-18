package com.webb.basis.thread.core.chapter3.one.three;

/**
 * @author 67345
 * @create 2017-02-18 10:53
 **/
public class MyThread2 extends Thread {

    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始 notify time = " + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束 notify time = " + System.currentTimeMillis());
        }
    }
}

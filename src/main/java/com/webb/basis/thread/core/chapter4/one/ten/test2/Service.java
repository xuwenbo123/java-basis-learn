package com.webb.basis.thread.core.chapter4.one.ten.test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 67345
 * @create 2017-02-19 9:23
 **/
public class Service {

    public ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1() {
        try {
            lock.lock();
            System.out.println("ThreadName = " + Thread.currentThread().getName() + "进入方法");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

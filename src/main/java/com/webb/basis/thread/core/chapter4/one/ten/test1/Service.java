package com.webb.basis.thread.core.chapter4.one.ten.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 67345
 * @create 2017-02-19 9:17
 **/
public class Service {

    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1() {
        lock.lock();
        // getHoldCount() 查询当前线程保持此锁定的个数，也就是调用lock的次数
        System.out.println("serviceMethod1 getHoldCount = " + lock.getHoldCount());
        serviceMethod2();
        lock.unlock();
    }

    public void serviceMethod2() {
        lock.lock();
        System.out.println("serviceMethod1 getHoldCount = " + lock.getHoldCount());
        lock.unlock();
    }

    public void serviceMethod3() {
        lock.lock();
        System.out.println(lock.getHoldCount());
        lock.unlock();
    }
}

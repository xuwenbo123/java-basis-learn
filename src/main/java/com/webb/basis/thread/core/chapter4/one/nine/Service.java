package com.webb.basis.thread.core.chapter4.one.nine;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 67345
 * @create 2017-02-18 16:57
 **/
public class Service {

    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        lock.lock();
        System.out.println("ThreadName = " + Thread.currentThread().getName() + "获得锁定");
        lock.unlock();
    }

}

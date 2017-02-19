package com.webb.basis.thread.core.chapter4.two.one;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author 67345
 * @create 2017-02-19 9:46
 **/
public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            lock.readLock().lock();
            System.out.println("获得读锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }
}

package com.webb.basis.thread.core.chapter4.one.ten.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 67345
 * @create 2017-02-19 9:28
 **/
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod() {
        lock.lock();
        System.out.println("有" + lock.getWaitQueueLength(condition) + "个线程正在等待condition");
        condition.signal();
        lock.unlock();
    }
}

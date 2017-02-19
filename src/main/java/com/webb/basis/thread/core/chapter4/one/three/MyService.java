package com.webb.basis.thread.core.chapter4.one.three;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 67345
 * @create 2017-02-18 16:03
 **/
public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            // 只使用condition.await()的话会报错，解决的办法是必须在condition.await()调用之前
            // 调用lock.lock()代码获得同步监视器

            lock.lock();
            System.out.println("A");
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("锁释放了");
        }
    }
}

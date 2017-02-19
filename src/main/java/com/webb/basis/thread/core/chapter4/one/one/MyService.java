package com.webb.basis.thread.core.chapter4.one.one;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 67345
 * @create 2017-02-18 15:51
 **/
public class MyService {

    private Lock lock = new ReentrantLock();

    public void testMethod() {
        lock.lock();

        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " " + (i + 1));
        }

        lock.unlock();
    }
}

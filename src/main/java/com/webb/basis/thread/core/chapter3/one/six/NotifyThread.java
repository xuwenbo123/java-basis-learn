package com.webb.basis.thread.core.chapter3.one.six;

/**
 * @author 67345
 * @create 2017-02-18 11:27
 **/
public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            lock.notify();
        }
    }
}

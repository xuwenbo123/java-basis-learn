package com.webb.basis.thread.core.chapter3.one.seven;

/**
 * @author 67345
 * @create 2017-02-18 11:26
 **/
public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}

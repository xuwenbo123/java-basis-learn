package com.webb.basis.thread.core.chapter3.one.four;

/**
 * @author 67345
 * @create 2017-02-18 11:10
 **/
public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}

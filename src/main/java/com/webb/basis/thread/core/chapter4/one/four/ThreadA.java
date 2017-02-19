package com.webb.basis.thread.core.chapter4.one.four;

/**
 * @author 67345
 * @create 2017-02-18 16:22
 **/
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}

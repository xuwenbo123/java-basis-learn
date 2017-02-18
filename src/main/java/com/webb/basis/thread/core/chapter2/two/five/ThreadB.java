package com.webb.basis.thread.core.chapter2.two.five;

/**
 * @author 67345
 * @create 2017-02-17 14:27
 **/
public class ThreadB extends Thread {

    private ObjectService service;

    public ThreadB(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethodB();
    }
}

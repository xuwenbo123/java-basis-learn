package com.webb.basis.thread.core.chapter2.two.two;

/**
 * @author 67345
 * @create 2017-02-17 13:51
 **/
public class ThreadA extends Thread {

    private ObjectService service;

    public ThreadA(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethod();
    }
}

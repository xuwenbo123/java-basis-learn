package com.webb.basis.thread.core.chapter2.three.seven;

/**
 * @author 67345
 * @create 2017-02-18 9:38
 **/
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}

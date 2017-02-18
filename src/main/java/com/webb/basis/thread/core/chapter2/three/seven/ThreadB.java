package com.webb.basis.thread.core.chapter2.three.seven;

/**
 * @author 67345
 * @create 2017-02-18 9:38
 **/
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }
}

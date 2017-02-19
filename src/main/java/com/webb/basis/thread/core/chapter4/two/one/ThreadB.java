package com.webb.basis.thread.core.chapter4.two.one;

/**
 * @author 67345
 * @create 2017-02-19 9:48
 **/
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}

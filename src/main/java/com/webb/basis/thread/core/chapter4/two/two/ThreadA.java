package com.webb.basis.thread.core.chapter4.two.two;

/**
 * @author 67345
 * @create 2017-02-19 9:48
 **/
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}

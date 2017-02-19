package com.webb.basis.thread.core.chapter4.one.five;

/**
 * @author 67345
 * @create 2017-02-18 16:30
 **/
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}

package com.webb.basis.thread.core.chapter4.one.two;

/**
 * @author 67345
 * @create 2017-02-18 15:57
 **/
public class ThreadBB extends Thread {

    private MyService service;

    public ThreadBB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}

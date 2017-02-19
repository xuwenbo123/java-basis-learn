package com.webb.basis.thread.core.chapter4.one.six;

/**
 * @author 67345
 * @create 2017-02-18 16:30
 **/
public class ThreadB extends Thread {

    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}

package com.webb.basis.thread.core.chapter4.one.one;

/**
 * @author 67345
 * @create 2017-02-18 15:52
 **/
public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}

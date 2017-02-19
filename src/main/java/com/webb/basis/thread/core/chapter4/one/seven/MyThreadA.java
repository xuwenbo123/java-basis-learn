package com.webb.basis.thread.core.chapter4.one.seven;

/**
 * @author 67345
 * @create 2017-02-18 16:39
 **/
public class MyThreadA extends Thread {

    private MyService service;

    public MyThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.set();
        }
    }
}
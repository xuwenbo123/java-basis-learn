package com.webb.basis.thread.core.chapter2.one.eight;

/**
 * @author 67345
 * @create 2017-02-17 11:56
 **/
public class MyThreadA extends Thread {

    private Sub sub;

    public MyThreadA(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}

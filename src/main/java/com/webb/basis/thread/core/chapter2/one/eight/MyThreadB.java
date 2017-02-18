package com.webb.basis.thread.core.chapter2.one.eight;

/**
 * @author 67345
 * @create 2017-02-17 11:57
 **/
public class MyThreadB extends Thread {

    private Sub sub;

    public MyThreadB(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}

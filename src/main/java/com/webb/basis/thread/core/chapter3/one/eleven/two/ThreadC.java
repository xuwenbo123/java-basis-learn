package com.webb.basis.thread.core.chapter3.one.eleven.two;

/**
 * @author 67345
 * @create 2017-02-18 15:00
 **/
public class ThreadC extends Thread {

    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.getValue();
        }
    }
}

package com.webb.basis.thread.core.chapter3.one.eleven.one;

/**
 * @author 67345
 * @create 2017-02-18 14:59
 **/
public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }

}

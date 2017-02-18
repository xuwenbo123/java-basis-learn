package com.webb.basis.thread.core.chapter2.one.four;

/**
 * @author 67345
 * @create 2017-02-17 11:22
 **/
public class ThreadB extends Thread {

    private MyObject object;

    public ThreadB(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.methodB();
    }
}

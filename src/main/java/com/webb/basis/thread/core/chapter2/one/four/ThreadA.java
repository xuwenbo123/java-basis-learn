package com.webb.basis.thread.core.chapter2.one.four;

/**
 * @author 67345
 * @create 2017-02-17 11:21
 **/
public class ThreadA extends Thread {

    private MyObject object;

    public ThreadA(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.methodA();
    }
}

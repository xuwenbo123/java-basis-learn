package com.webb.basis.thread.core.chapter2.one.one;

/**
 * @author 67345
 * @create 2017-02-17 11:06
 **/
public class ThreadB extends Thread {

    private HasSelfPrivateNum num;

    public ThreadB(HasSelfPrivateNum num) {
        this.num = num;
    }

    @Override
    public void run() {
        num.addI("b");
    }
}

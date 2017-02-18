package com.webb.basis.thread.core.chapter2.one.five;

/**
 * @author 67345
 * @create 2017-02-17 11:40
 **/
public class ThreadA extends Thread {

    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        publicVar.setValue("B", "BB");
    }
}

package com.webb.basis.thread.core.chapter2.two.seven;

/**
 * @author 67345
 * @create 2017-02-17 15:33
 **/
public class ThreadB2 extends Thread {
    private Service2 service2;

    public ThreadB2(Service2 service2) {
        this.service2 = service2;
    }

    @Override
    public void run() {
        service2.b();
    }
}

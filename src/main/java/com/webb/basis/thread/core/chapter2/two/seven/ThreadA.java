package com.webb.basis.thread.core.chapter2.two.seven;

/**
 * @author 67345
 * @create 2017-02-17 14:54
 **/
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("a", "aa");
    }
}

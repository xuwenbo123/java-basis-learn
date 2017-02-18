package com.webb.basis.thread.core.chapter2.two.seven;

/**
 * @author 67345
 * @create 2017-02-17 14:54
 **/
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("b", "bb");
    }
}

package com.webb.basis.thread.core.chapter2.one.six;

/**
 * @author 67345
 * @create 2017-02-17 11:48
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}

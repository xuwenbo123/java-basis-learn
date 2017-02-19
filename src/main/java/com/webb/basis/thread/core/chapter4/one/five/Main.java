package com.webb.basis.thread.core.chapter4.one.five;

/**
 * @author 67345
 * @create 2017-02-18 16:31
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();

        Thread.sleep(3000);
        service.signalAll();
    }
}

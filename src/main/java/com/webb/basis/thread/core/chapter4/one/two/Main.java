package com.webb.basis.thread.core.chapter4.one.two;

/**
 * @author 67345
 * @create 2017-02-18 15:58
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();

        ThreadAA threadAA = new ThreadAA(service);
        threadAA.setName("AA");
        threadAA.start();

        Thread.sleep(100);

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();

        ThreadBB threadBB = new ThreadBB(service);
        threadBB.setName("BB");
        threadBB.start();
    }
}

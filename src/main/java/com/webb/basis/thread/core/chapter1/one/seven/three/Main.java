package com.webb.basis.thread.core.chapter1.one.seven.three;

/**
 * @author 67345
 * @create 2017-02-16 21:03
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(10);
        thread.interrupt();

        System.out.println("end !");

    }
}

package com.webb.basis.thread.core.chapter3.three.four;

/**
 * @author 67345
 * @create 2017-02-18 10:11
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("在Main线程中取值=" + Tools.threadLocalExt.get());
            Thread.sleep(100);
        }

        Thread.sleep(5000);
        ThreadA threadA = new ThreadA();
        threadA.start();
    }
}

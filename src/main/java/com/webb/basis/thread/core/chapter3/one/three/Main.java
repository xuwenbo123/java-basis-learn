package com.webb.basis.thread.core.chapter3.one.three;

/**
 * @author 67345
 * @create 2017-02-18 10:54
 **/
public class Main {

    public static void main(String[] args) throws InterruptedException {

        /*Object lock = new Object();
        MyThread1 thread1 = new MyThread1(lock);
        thread1.start();

        Thread.sleep(3000);

        MyThread2 thread2 = new MyThread2(lock);
        thread2.start();*/

        Object lock = new Object();

        ThreadA threadA = new ThreadA(lock);
        threadA.start();

        Thread.sleep(50);

        ThreadB threadB = new ThreadB(lock);
        threadB.start();

    }
}

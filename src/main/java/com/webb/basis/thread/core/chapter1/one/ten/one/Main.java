package com.webb.basis.thread.core.chapter1.one.ten.one;

/**
 * 线程优先级的继承特性
 *
 * @author 67345
 * @create 2017-02-16 22:08
 **/
public class Main {

    public static void main(String[] args) {

        System.out.println("main thread begin priority = " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(6);

        System.out.println("main thread end priority = " + Thread.currentThread().getPriority());

        MyThread1 thread1 = new MyThread1();
        thread1.start();

    }
}

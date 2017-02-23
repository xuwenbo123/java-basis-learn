package com.webb.basis.thread.core.chapter6.two.test3;

/**
 * @author 67345
 * @create 2017-02-19 10:40
 **/
public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

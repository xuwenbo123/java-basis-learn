package com.webb.basis.thread.core.chapter2.two.four;

/**
 * 一半异步，一半同步
 *
 * @author 67345
 * @create 2017-02-17 14:21
 **/
public class Main {
    public static void main(String[] args) {
        Task task = new Task();

        MyThread1 thread1 = new MyThread1(task);
        thread1.start();

        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}

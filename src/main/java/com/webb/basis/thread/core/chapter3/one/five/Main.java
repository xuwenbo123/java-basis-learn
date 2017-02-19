package com.webb.basis.thread.core.chapter3.one.five;

/**
 * 当interrupt()方法遇到wait()方法
 *
 * one. 执行完同步代码块就会释放对象的锁
 * 2. 在执行同步代码块的过程中，遇到异常而导致线程终止，锁也会被释放
 * 3. 在执行同步代码块的过程中，执行了锁所属对象的wait()方法，这个线程会释放对象锁，
 *     而此线程对象会进入线程等待池中，等待被唤醒
 *
 *
 * @author 67345
 * @create 2017-02-18 11:21
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();

        Thread.sleep(5000);

        threadA.interrupt();
    }
}

package com.webb.basis.thread.core.chapter2.one.six;

/**
 * synchronized 锁 重入
 *
 * 可重入锁：自己可以再次获取自己的内部锁。
 *
 * @author 67345
 * @create 2017-02-17 11:48
 **/
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

package com.webb.basis.thread.core.chapter3.one.four;

/**
 * 方法wait()释放 与 notify()不释放
 *
 * @author 67345
 * @create 2017-02-18 11:11
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        ThreadA threadA = new ThreadA(lock);
        threadA.start();

        Thread.sleep(1000);

        ThreadB threadB = new ThreadB(lock);
        threadB.start();
    }
}

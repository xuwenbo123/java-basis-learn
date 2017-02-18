package com.webb.basis.thread.core.chapter3.one.seven;

/**
 * 唤醒所有线程 -- notifyAll()
 *
 * @author 67345
 * @create 2017-02-18 11:28
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        ThreadA threadA = new ThreadA(lock);
        threadA.start();

        ThreadB threadB = new ThreadB(lock);
        threadB.start();

        ThreadC threadC = new ThreadC(lock);
        threadC.start();

        Thread.sleep(1000);

        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();

    }
}

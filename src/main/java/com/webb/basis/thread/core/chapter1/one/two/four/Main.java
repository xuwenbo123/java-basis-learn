package com.webb.basis.thread.core.chapter1.one.two.four;

/**
 * 留意i--与System.out.println()的异常 ：虽然println()方法在内部是同步的，但i--的操作却是在进入println()之前发生的，
 * 所以会有发生非线程安全的概率，为了防止非线程安全问题，还是应继续使用同步方法
 *
 * @author 67345
 * @create 2017-02-16 14:33
 **/
public class Main {

    public static void main(String[] args) {

        MyThread run = new MyThread();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        Thread t5 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}

package com.webb.basis.thread.core.chapther1.one.two.three;

/**
 * @author 67345
 * @create 2017-02-16 14:21
 **/
public class Main {
    public static void main(String[] args) {
        /**
         * 不共享数据的线程
         */
        /*MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");

        a.start();
        b.start();
        c.start();*/

        /**
         * 共享数据的线程,使用synchronized保证线程安全
         */
        MyThread myThread = new MyThread();

        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}

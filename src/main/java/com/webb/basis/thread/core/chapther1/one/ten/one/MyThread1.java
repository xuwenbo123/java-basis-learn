package com.webb.basis.thread.core.chapther1.one.ten.one;

/**
 * @author 67345
 * @create 2017-02-16 22:06
 **/
public class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread1 run priority = " + this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}

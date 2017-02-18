package com.webb.basis.thread.core.chapter1.one.ten.one;

/**
 * @author 67345
 * @create 2017-02-16 22:07
 **/
public class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread2 run priority = " + this.getPriority());
    }
}

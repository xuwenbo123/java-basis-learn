package com.webb.basis.thread.core.chapter1.one.two.four;

public class MyThread implements Runnable {

    private int i = 5;

    @Override
    public void run() {
        System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
    }
}

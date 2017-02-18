package com.webb.basis.thread.core.chapter1.one.two.three;

public class MyThread extends Thread {

    private int count = 5;

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
        this.setName(name); // 设置线程名字
    }

    @Override
    synchronized public void run() {
        while (count > 0) {
            count--;
            System.out.println("由 " + Thread.currentThread().getName() + "计算,count=" + count);
        }
    }
}

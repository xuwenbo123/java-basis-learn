package com.webb.basis.thread.core.chapter2.three.three;

/**
 * 解决异步死循环 -- synchronized 和 volatile区别
 * @author 67345
 * @create 2017-02-17 16:20
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        RunThread thread = new RunThread();
        thread.start();
        Thread.sleep(1000);
        thread.setRunning(false);
        System.out.println("已经赋值为false了");
    }
}

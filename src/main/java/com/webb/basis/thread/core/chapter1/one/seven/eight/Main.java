package com.webb.basis.thread.core.chapter1.one.seven.eight;

/**
 * 使用 return 停止线程,建议使用抛异常的方法来实现现成的停止
 *
 * @author 67345
 * @create 2017-02-16 21:29
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

    }
}

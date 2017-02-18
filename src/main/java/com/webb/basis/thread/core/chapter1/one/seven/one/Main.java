package com.webb.basis.thread.core.chapter1.one.seven.one;

/**
 * interrupt() 停止不了的线程
 *
 * @author 67345
 * @create 2017-02-16 17:57
 **/
public class Main {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        thread.interrupt();
    }

}

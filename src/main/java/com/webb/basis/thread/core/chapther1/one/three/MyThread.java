package com.webb.basis.thread.core.chapther1.one.three;

/**
 * currentThread()方法
 *
 * @author 67345
 * @create 2017-02-16 14:39
 **/
public class MyThread implements Runnable {

    public MyThread() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }
}

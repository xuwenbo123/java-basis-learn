package com.webb.basis.thread.core.chapther1.one.five;

/**
 * sleep() 方法
 *
 * @author 67345
 * @create 2017-02-16 17:50
 **/
public class Main {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        System.out.println("begin = " + System.currentTimeMillis());

//        myThread.run();

        myThread.start();

        System.out.println("end = " + System.currentTimeMillis());

    }
}

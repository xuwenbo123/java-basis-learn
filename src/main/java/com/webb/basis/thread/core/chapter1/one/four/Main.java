package com.webb.basis.thread.core.chapter1.one.four;

/**
 * isAlive()方法
 *
 * @author 67345
 * @create 2017-02-16 14:48
 **/
public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        System.out.println("begin = " + myThread.isAlive());

        myThread.start();

        System.out.println("end = " + myThread.isAlive());

    }

}

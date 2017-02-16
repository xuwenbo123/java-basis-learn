package com.webb.basis.thread.core.chapther1.one.eight.two;

/**
 * @author 67345
 * @create 2017-02-16 21:40
 **/
public class SynchronizedObject {

    synchronized public void printString() {
        System.out.println("begin");

        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a 线程永远 suspend了!");
            Thread.currentThread().suspend();
        }

        System.out.println("end");
    }
}

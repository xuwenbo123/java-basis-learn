package com.webb.basis.thread.core.chapther1.one.three;

/**
 * @author 67345
 * @create 2017-02-16 14:43
 **/
public class CountOperate extends Thread {

    public CountOperate() {
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

        System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());

        System.out.println("this.getName() = " + this.getName());

        System.out.println("this.isAlive() = " + this.isAlive());

        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

        System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());

        System.out.println("this.getName() = " + this.getName());

        System.out.println("this.isAlive() = " + this.isAlive());

        System.out.println("run---end");
    }
}

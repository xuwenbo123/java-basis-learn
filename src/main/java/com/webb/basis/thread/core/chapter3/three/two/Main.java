package com.webb.basis.thread.core.chapter3.three.two;

/**
 * 验证线程变量的隔离性
 *
 * @author 67345
 * @create 2017-02-18 9:53
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {

        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();

        Thread.sleep(1000);

        threadB.start();


    }
}

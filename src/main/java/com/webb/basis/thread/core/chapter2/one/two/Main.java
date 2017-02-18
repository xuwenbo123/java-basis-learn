package com.webb.basis.thread.core.chapter2.one.two;

/**
 * 实例变量非线程安全 -- 如果多个线程共同访问1个对象中的实例变量，则有可能出现“非线程安全”问题
 * 如果两个线程同时操作业务对象中的实例变量，则有可能会出现非线程安全问题
 *
 * 只需要在方法前加关键字synchronized即可
 *
 * 在两个线程中访问同一个对象中的同步方法时一定是线程安全的。
 *
 *
 * @author 67345
 * @create 2017-02-17 11:02
 **/
public class Main {

    public static void main(String[] args) {
        HasSelfPrivateNum num = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(num);
        threadA.start();

        ThreadB threadB = new ThreadB(num);
        threadB.start();

    }
}

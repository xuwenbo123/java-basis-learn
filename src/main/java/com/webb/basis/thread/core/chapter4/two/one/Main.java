package com.webb.basis.thread.core.chapter4.two.one;

/**
 * 类 ReentrantReadWriteLock 的使用：读读共享
 *
 * @author 67345
 * @create 2017-02-19 9:48
 **/
public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");

        threadA.start();
        threadB.start();
    }
}

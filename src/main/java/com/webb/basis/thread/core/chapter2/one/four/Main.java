package com.webb.basis.thread.core.chapter2.one.four;

/**
 * synchronized方法与锁对象 --- 调用关键字 synchronized 声明的方法一定是排队进行的。
 * 另外需要牢牢记住共享这两个字，只有共享资源的读写访问才需要同步化，如果不是共享资源，那么根本就没有同步的必要
 *
 * 1) A 线程先持有object对象的Lock锁，B线程可以以异步的方式调用object对象中的非synchronized类型的方法
 * 2) A 线程先持有object对象的Lock锁，B线程如果在这时调用object对象中的synchronized类型的方法则需等待，也就是同步
 *
 * @author 67345
 * @create 2017-02-17 11:23
 **/
public class Main {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(object);
        threadA.setName("A");

        ThreadB threadB = new ThreadB(object);
        threadB.setName("B");

        threadA.start();
        threadB.start();

    }
}

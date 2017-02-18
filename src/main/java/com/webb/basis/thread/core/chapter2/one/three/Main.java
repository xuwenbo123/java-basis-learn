package com.webb.basis.thread.core.chapter2.one.three;

/**
 * 多个对象多个锁
 * twoObjectTwoLock
 *
 * 两个线程分别访问同一个类的两个不同实例的相同名称的同步方法，效果是以异步的方式运行的。
 *
 * 本示例由于创建了2个业务对象，在系统中产生出2个锁，所以运行结果是异步的
 *
 * @author 67345
 * @create 2017-02-17 11:02
 **/
public class Main {

    public static void main(String[] args) {
        HasSelfPrivateNum num1 = new HasSelfPrivateNum();
        HasSelfPrivateNum num2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(num1);
        threadA.start();

        ThreadB threadB = new ThreadB(num2);
        threadB.start();

    }
}

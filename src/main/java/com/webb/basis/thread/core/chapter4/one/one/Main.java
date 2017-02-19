package com.webb.basis.thread.core.chapter4.one.one;

/**
 * 使用ReentrantLock实现同步：测试1
 *
 * @author 67345
 * @create 2017-02-18 15:53
 **/
public class Main {
    public static void main(String[] args) {
        MyService service = new MyService();

        MyThread a1 = new MyThread(service);
        MyThread a2 = new MyThread(service);
        MyThread a3 = new MyThread(service);
        MyThread a4 = new MyThread(service);
        MyThread a5 = new MyThread(service);

        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}

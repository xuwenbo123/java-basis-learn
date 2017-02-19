package com.webb.basis.thread.core.chapter4.one.seven;

/**
 * 实现生产者/消费者模式 ： 一对一交替打印
 *
 * @author 67345
 * @create 2017-02-18 16:41
 **/
public class Main {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA threadA = new MyThreadA(service);
        threadA.start();

        MyThreadB threadB = new MyThreadB(service);
        threadB.start();
    }
}

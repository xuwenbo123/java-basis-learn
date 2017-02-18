package com.webb.basis.thread.core.chapter2.one.six;

/**
 * @author 67345
 * @create 2017-02-17 11:47
 **/
public class Service {
    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3");
    }
}

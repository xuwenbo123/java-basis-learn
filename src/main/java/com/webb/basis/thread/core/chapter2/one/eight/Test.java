package com.webb.basis.thread.core.chapter2.one.eight;

/**
 * 同步不能继承，所以还得在子类的方法中添加 synchronized 关键字
 * @author 67345
 * @create 2017-02-17 11:58
 **/
public class Test {

    public static void main(String[] args) {
        Sub subRef = new Sub();

        MyThreadA a = new MyThreadA(subRef);
        a.setName("A");
        a.start();

        MyThreadB b = new MyThreadB(subRef);
        b.setName("B");
        b.start();
    }
}

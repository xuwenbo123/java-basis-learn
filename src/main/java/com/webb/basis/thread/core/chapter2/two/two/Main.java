package com.webb.basis.thread.core.chapter2.two.two;

/**
 * synchronized 同步代码块的使用
 *
 * @author 67345
 * @create 2017-02-17 13:52
 **/
public class Main {
    public static void main(String[] args) {

        ObjectService service = new ObjectService();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("a");
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.setName("b");
        threadB.start();

    }
}

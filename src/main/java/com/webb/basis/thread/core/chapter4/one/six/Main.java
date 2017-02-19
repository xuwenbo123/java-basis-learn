package com.webb.basis.thread.core.chapter4.one.six;

/**
 * 使用多个Condition实现通知部分线程 -- 正确用法
 *
 * @author 67345
 * @create 2017-02-18 16:31
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();

        Thread.sleep(3000);
        service.signalAll_A();
    }
}

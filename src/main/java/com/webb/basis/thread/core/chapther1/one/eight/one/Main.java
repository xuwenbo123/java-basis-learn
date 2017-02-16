package com.webb.basis.thread.core.chapther1.one.eight.one;

/**
 * 暂停线程 suspend()：暂停线程 resume()：恢复线程
 *
 * @author 67345
 * @create 2017-02-16 21:32
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread = new MyThread();
        thread.start();

        // A 段
        thread.suspend();
        System.out.println("A = " + System.currentTimeMillis() + " i = " + thread.getI());
        Thread.sleep(5000);
        System.out.println("A = " + System.currentTimeMillis() + " i = " + thread.getI());

        // B 段
        thread.resume(); // 重新开始 ， 没有的线程不会继续跑，线程里面的数字也不会增加
        Thread.sleep(5000);

        // C 段
        thread.suspend();
        System.out.println("B = " + System.currentTimeMillis() + " i = " + thread.getI());
        Thread.sleep(5000);
        System.out.println("B = " + System.currentTimeMillis() + " i = " + thread.getI());

    }
}

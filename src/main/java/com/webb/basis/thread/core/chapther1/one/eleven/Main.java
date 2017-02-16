package com.webb.basis.thread.core.chapther1.one.eleven;

/**
 * @author 67345
 * @create 2017-02-16 22:25
 **/
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
//        thread.setDaemon(true);
        thread.start();
        Thread.sleep(5000);
        System.out.println("我离开thread对象再也不打印了，也就是停止了!");
    }
}

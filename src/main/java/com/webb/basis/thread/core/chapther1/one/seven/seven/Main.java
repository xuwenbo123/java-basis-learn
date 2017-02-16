package com.webb.basis.thread.core.chapther1.one.seven.seven;

/**
 * 释放锁的不良后果  强制stop会造成数据不一致
 *
 * @author 67345
 * @create 2017-02-16 21:25
 **/
public class Main {

    public static void main(String[] args) throws InterruptedException {
        SynchronizedObject object = new SynchronizedObject();
        MyThread thread = new MyThread(object);
        thread.start();
        Thread.sleep(500);
        thread.stop();
        System.out.println(object.getUsername() + " " + object.getPassword());
    }
}

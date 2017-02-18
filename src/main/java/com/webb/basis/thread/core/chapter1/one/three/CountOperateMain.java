package com.webb.basis.thread.core.chapter1.one.three;

/**
 * this 与 Thread.currentThread() 指向的不是同一个线程实例
 * @author 67345
 * @create 2017-02-16 14:45
 **/
public class CountOperateMain {

    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);

        System.out.println("main begin : " + thread.isAlive());

        thread.setName("A");
        thread.start();

        System.out.println("main end : " + thread.isAlive());
    }
}

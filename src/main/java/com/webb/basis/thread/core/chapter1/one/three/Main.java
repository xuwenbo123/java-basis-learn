package com.webb.basis.thread.core.chapter1.one.three;

/**
 * @author 67345
 * @create 2017-02-16 14:40
 **/
public class Main {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);

//        thread.start(); // 构造方法结果是 main，run方法结果是 Thread-0

        myThread.run(); // 两个结果都是 main


    }
}

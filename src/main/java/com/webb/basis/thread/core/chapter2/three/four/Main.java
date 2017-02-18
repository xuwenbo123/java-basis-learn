package com.webb.basis.thread.core.chapter2.three.four;

/**
 * @author 67345
 * @create 2017-02-17 17:18
 **/
public class Main {
    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];

        for (int i = 0; i < 100; i++) {
            myThreads[i] = new MyThread();
        }

        for (int i = 0; i < 100; i++) {
            myThreads[i].start();
        }

    }
}

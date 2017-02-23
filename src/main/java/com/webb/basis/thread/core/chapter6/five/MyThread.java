package com.webb.basis.thread.core.chapter6.five;

/**
 * @author 67345
 * @create 2017-02-19 10:58
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.getInstance().hashCode());
        }
    }
}

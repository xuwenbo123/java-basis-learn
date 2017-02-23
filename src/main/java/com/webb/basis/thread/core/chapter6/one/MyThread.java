package com.webb.basis.thread.core.chapter6.one;

/**
 * @author 67345
 * @create 2017-02-19 10:29
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}

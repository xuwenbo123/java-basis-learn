package com.webb.basis.thread.core.chapter6.two.test3;

/**
 * @author 67345
 * @create 2017-02-19 10:40
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}

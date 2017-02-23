package com.webb.basis.thread.core.chapter6.two.test2;

/**
 * @author 67345
 * @create 2017-02-19 10:32
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}

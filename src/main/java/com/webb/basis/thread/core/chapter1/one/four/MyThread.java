package com.webb.basis.thread.core.chapter1.one.four;

/**
 * @author 67345
 * @create 2017-02-16 14:47
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }

}

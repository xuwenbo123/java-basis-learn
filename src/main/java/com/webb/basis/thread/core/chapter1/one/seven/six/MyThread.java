package com.webb.basis.thread.core.chapter1.one.seven.six;

/**
 * @author 67345
 * @create 2017-02-16 21:18
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("进入到了catch()方法");
            e.printStackTrace();
        }
    }
}

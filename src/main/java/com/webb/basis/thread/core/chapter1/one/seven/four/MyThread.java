package com.webb.basis.thread.core.chapter1.one.seven.four;

/**
 * @author 67345
 * @create 2017-02-16 21:08
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止！进入catch;" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}

package com.webb.basis.thread.core.chapther1.one.seven.five;

/**
 * @author 67345
 * @create 2017-02-16 21:14
 **/
public class MyThread extends Thread {

    private int i = 0;

    @Override
    public void run() {
        while (true) {
            try {
                i++;
                System.out.println("i = " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

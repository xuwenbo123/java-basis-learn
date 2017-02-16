package com.webb.basis.thread.core.chapther1.one.seven.two;

/**
 * @author 67345
 * @create 2017-02-16 18:00
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("i= " + (i + 1));
        }
    }
}

package com.webb.basis.thread.core.chapter3.three.two;

import java.util.Date;

/**
 * @author 67345
 * @create 2017-02-18 9:51
 **/
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Tools.threadLocal.set(new Date());
                System.out.println("B " + Tools.threadLocal.get().getTime());
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

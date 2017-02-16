package com.webb.basis.thread.core.chapther1.one.eight.one;

/**
 * @author 67345
 * @create 2017-02-16 21:31
 **/
public class MyThread extends Thread {
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}

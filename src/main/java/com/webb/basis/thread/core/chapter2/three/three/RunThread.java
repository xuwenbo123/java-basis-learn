package com.webb.basis.thread.core.chapter2.three.three;

/**
 * @author 67345
 * @create 2017-02-17 16:18
 **/
public class RunThread extends Thread {

    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning == true) {

        }
        System.out.println("线程被停止了");
    }
}

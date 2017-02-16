package com.webb.basis.thread.core.chapther1.one.seven.five;

/**
 * 能停止的线程 -- 暴力停止 stop() 不推荐使用，已过时
 *
 * @author 67345
 * @create 2017-02-16 21:15
 **/
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(8000);
        thread.stop();
    }
}

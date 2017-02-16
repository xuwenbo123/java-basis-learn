package com.webb.basis.thread.core.chapther1.one.seven.seven;

/**
 * @author 67345
 * @create 2017-02-16 21:24
 **/
public class MyThread extends Thread {

    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}

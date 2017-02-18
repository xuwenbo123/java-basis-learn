package com.webb.basis.thread.core.chapter2.two.four;

/**
 * @author 67345
 * @create 2017-02-17 14:21
 **/
public class MyThread2 extends Thread {

    private Task task;

    public MyThread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}

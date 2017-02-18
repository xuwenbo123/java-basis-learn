package com.webb.basis.thread.core.chapter2.two.one;

/**
 * @author 67345
 * @create 2017-02-17 13:44
 **/
public class MyThread2 extends Thread {

    private Task task;

    public MyThread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}

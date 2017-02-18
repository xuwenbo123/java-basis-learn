package com.webb.basis.thread.core.chapter3.one.three;

/**
 * @author 67345
 * @create 2017-02-18 11:02
 **/
public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();

                    if (MyList.size() == 5) {
                        lock.notify();
                        System.out.println("已发出通知");
                    }

                    System.out.println("添加了" + (i + 1) + "个元素");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

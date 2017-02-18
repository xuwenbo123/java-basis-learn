package com.webb.basis.thread.core.chapter2.three.four;

/**
 * @author 67345
 * @create 2017-02-17 16:50
 **/
public class MyThread extends Thread {
    public static int count;

    // 注意一定要添加static关键字，这样synchronized与static锁的内容就是MyThread.class类了，也就达到了同步的效果了
    synchronized private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count = " + count);
    }

    @Override
    public void run() {
        addCount();
    }
}

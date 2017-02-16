package com.webb.basis.thread.core.chapther1.one.seven.three;

/**
 * 能停止的线程 -- 异常法
 *
 * @author 67345
 * @create 2017-02-16 18:21
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5000; i++) {
                if (this.interrupted()) {
                    System.out.println("已经是停止状态了！我要退出了");
                    throw new InterruptedException();
                }
                System.out.println("i = " + (i + 1));
            }
            System.out.println("我在for下面");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
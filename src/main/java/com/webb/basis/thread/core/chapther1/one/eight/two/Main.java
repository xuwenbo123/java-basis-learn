package com.webb.basis.thread.core.chapther1.one.eight.two;

/**
 * suspend 与 resume 方法的缺点 -- 独占
 * @author 67345
 * @create 2017-02-16 21:41
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*final SynchronizedObject object = new SynchronizedObject();

        Thread thread = new Thread() {
            @Override
            public void run() {
                object.printString();
            }
        };

        thread.setName("a");
        thread.start();
        Thread.sleep(1000);

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("thread2 启动了，但进不了printString()方法！只打印1个begin");
                System.out.println("因为printString()方法被a线程锁定并且永远suspend暂停了！");
                object.printString();
            }
        };

        thread2.start();*/

        /**
         * suspend_resume_LockStop
         */
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(1000);
        thread.suspend();
        System.out.println("Main end");
    }
}

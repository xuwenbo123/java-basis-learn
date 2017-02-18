package com.webb.basis.thread.core.chapter3.one.eight;

/**
 * 方法wait(long)的使用
 *
 * @author 67345
 * @create 2017-02-18 14:40
 **/
public class MyRunnable {

    private static Object lock = new Object();

    private static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("waite begin timer = " + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("waite end timer = " + System.currentTimeMillis());
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private static Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin timer = " + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify end timer = " + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(runnable);
        thread.start();

        Thread.sleep(3000);

        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }

}

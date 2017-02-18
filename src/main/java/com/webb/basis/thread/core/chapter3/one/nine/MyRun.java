package com.webb.basis.thread.core.chapter3.one.nine;

/**
 * 通知过早
 *
 * @author 67345
 * @create 2017-02-18 14:46
 **/
public class MyRun {

    private String lock = new String("");
    private boolean isFirstRunB = false;

    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    while (isFirstRunB == false) {
                        System.out.println("begin waite");
                        lock.wait();
                        System.out.println("end waite");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
                isFirstRunB = true;
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        MyRun run = new MyRun();
        Thread threadB = new Thread(run.runnableB);
        threadB.start();

        Thread.sleep(100);

        Thread thread = new Thread(run.runnableA);
        thread.start();
    }
}

package com.webb.basis.thread.core.chapter3.one.eleven.two;

/**
 * 假死
 *
 * @author 67345
 * @create 2017-02-18 15:00
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");

        P p = new P(lock);
        C c = new C(lock);

        ThreadP[] threadPs = new ThreadP[2];
        ThreadC[] threadCs = new ThreadC[2];

        for (int i = 0; i < 2; i++) {
            threadPs[i] = new ThreadP(p);
            threadPs[i].setName("生产者" + (i + 1));
            threadCs[i] = new ThreadC(c);
            threadCs[i].setName("消费者" + (i + 1));
            threadPs[i].start();
            threadCs[i].start();
        }

        Thread.sleep(5000);

        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);

        for (int i = 0; i < threadArray.length;i++) {
            System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());
        }
    }
}

package com.webb.basis.thread.core.chapter4.one.sixteen;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 67345
 * @create 2017-02-19 9:34
 **/
public class Main {

    private volatile static int nextPrintWho = 1;
    private static ReentrantLock lock = new ReentrantLock();
    private static final Condition conditionA = lock.newCondition();
    private static final Condition conditionB = lock.newCondition();
    private static final Condition conditionC = lock.newCondition();

    public static void main(String[] args) {
        Thread threadA = new Thread() {
            public void run() {
                try {
                    lock.lock();

                    while (nextPrintWho != 1) {
                        conditionA.await();
                    }

                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadA " + (i + 1));
                    }

                    nextPrintWho = 2;
                    conditionB.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread threadB = new Thread() {
            public void run() {
                try {
                    lock.lock();

                    while (nextPrintWho != 2) {
                        conditionA.await();
                    }

                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadB " + (i + 1));
                    }

                    nextPrintWho = 3;
                    conditionB.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread threadC = new Thread() {
            public void run() {
                try {
                    lock.lock();

                    while (nextPrintWho != 3) {
                        conditionA.await();
                    }

                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadC " + (i + 1));
                    }

                    nextPrintWho = 3;
                    conditionB.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread[] arrayA = new Thread[5];
        Thread[] arrayB = new Thread[5];
        Thread[] arrayC = new Thread[5];

        for (int i = 0; i < 5; i++) {
            arrayA[i] = new Thread(threadA);
            arrayB[i] = new Thread(threadB);
            arrayC[i] = new Thread(threadC);

            arrayA[i].start();
            arrayB[i].start();
            arrayC[i].start();
        }

    }
}
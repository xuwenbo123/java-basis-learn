package com.webb.basis.thread.core.chapter3.one.eleven.two;

/**
 * @author 67345
 * @create 2017-02-18 14:54
 **/
public class P {
    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {

            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    System.out.println("生产者" + Thread.currentThread().getName() + " WAITING了 ☆");
                    lock.wait();
                }
                System.out.println("生产者" + Thread.currentThread().getName() + " RUNNABLE了");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

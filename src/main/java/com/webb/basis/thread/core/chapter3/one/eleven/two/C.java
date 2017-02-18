package com.webb.basis.thread.core.chapter3.one.eleven.two;

/**
 * @author 67345
 * @create 2017-02-18 14:57
 **/
public class C {

    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {

            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    System.out.println("消费者" + Thread.currentThread().getName() + " WAITING了 ☆");
                    lock.wait();
                }
                System.out.println("生产者" + Thread.currentThread().getName() + " RUNNABLE了");
                ValueObject.value = "";
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

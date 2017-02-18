package com.webb.basis.thread.core.chapter3.one.eleven.one;

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
                    lock.wait();
                }
                System.out.println("get的值是" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

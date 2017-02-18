package com.webb.basis.thread.core.chapter2.one.eight;

/**
 * @author 67345
 * @create 2017-02-17 11:55
 **/
public class Sub extends Main {
    public void serviceMethod(){
        System.out.println("int sub 下一步 sleep begin threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("int sub 下一步 sleep end threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
    }
}

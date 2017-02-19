package com.webb.basis.thread.core.chapter4.one.nine;

/**
 * @author 67345
 * @create 2017-02-18 17:05
 **/
public class RunNotFair {
    public static void main(String[] args) {

        Service service = new Service(false);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("★线程" + Thread.currentThread().getName() + "运行了");
                service.serviceMethod();
            }
        };

        Thread[] threadArray = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }

        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }

    }
}

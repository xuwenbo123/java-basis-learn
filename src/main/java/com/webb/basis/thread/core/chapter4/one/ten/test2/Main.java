package com.webb.basis.thread.core.chapter4.one.ten.test2;

/**
 * @author 67345
 * @create 2017-02-19 9:24
 **/
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod1();
            }
        };

        Thread[] threadArray = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }

        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }

        Thread.sleep(2000);
        // getQueueLength() 返回正等待获取此锁定的线程估计数
        System.out.println("有线程数：" + service.lock.getQueueLength() + "在等待获取锁");
    }
}

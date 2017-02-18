package com.webb.basis.thread.core.chapter2.three.seven;

/**
 * @author 67345
 * @create 2017-02-18 9:39
 **/
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();

        Thread.sleep(1000);

        ThreadB threadB = new ThreadB(service);
        threadB.start();

        System.out.println("已经发起停止的命令");

    }
}

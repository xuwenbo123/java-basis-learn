package com.webb.basis.thread.core.chapter2.one.five;

/**
 * 脏读
 *
 * @author 67345
 * @create 2017-02-17 11:41
 **/
public class Main {

    public static void main(String[] args) throws InterruptedException {
        PublicVar publicVar = new PublicVar();
        ThreadA threadA = new ThreadA(publicVar);
        threadA.start();
        Thread.sleep(200);
        publicVar.getValue();
    }
}

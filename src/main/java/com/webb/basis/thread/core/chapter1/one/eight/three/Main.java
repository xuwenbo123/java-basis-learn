package com.webb.basis.thread.core.chapter1.one.eight.three;

/**
 * suspend 与 resume 方法的缺点 -- 不同步
 *
 * @author 67345
 * @create 2017-02-16 21:56
 **/
public class Main {

    public static void main(String[] args) throws InterruptedException {

        final MyObject object = new MyObject();

        Thread thread = new Thread() {
            public void run() {
                object.setValue("a", "aa");
            }
        };

        thread.setName("a");
        thread.start();
        Thread.sleep(500);

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                object.printUserNamePassword();
            }
        };

        thread2.start();

    }

}

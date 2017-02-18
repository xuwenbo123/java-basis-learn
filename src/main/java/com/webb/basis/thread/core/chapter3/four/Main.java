package com.webb.basis.thread.core.chapter3.four;

/**
 * InheritableThreadLocal 可以让子线程从父线程继承下来的值
 *
 * @author 67345
 * @create 2017-02-18 10:20
 **/
public class Main {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("  在Main线程中取值=" + Tools.threadLocalExt.get());
                Thread.sleep(100);
            }

            Thread.sleep(1000);

            ThreadA threadA = new ThreadA();
            threadA.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

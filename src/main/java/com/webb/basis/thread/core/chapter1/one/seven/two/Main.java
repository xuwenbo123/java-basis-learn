package com.webb.basis.thread.core.chapter1.one.seven.two;

/**
 * 判断线程是否是停止状态？？？
 *
 * @author 67345
 * @create 2017-02-16 18:01
 **/
public class Main {

    public static void main(String[] args) {
        /*MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();

        System.out.println("是否停止 1 ? = " + thread.interrupted()); // false
        System.out.println("是否停止 2 ? = " + thread.interrupted()); // false

        System.out.println("end!");*/

        /**
         * interrupted():测试当前线程是否已经是中断状态，执行后具有将状态标识置清除为false功能
          */
        Thread.currentThread().interrupt();

        System.out.println("是否停止 1 ? = " + Thread.interrupted()); // true
        System.out.println("是否停止 2 ? = " + Thread.interrupted()); // false

        System.out.println("end!");

        /**
         * isInterrupted()：测试线程Thread对象是否已经是中断状态，但不清除状态标识
         */
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();

        System.out.println("是否停止 1 ? = " + thread.isInterrupted()); // true
        System.out.println("是否停止 2 ? = " + thread.isInterrupted()); // true
        System.out.println("end!");

        /**
         * interrupted() 作用于当前线程，isInterrupted() 作用于调用该方法的线程对象所对应的线程。
         */
    }
}

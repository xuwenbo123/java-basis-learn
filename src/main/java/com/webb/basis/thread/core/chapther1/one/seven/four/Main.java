package com.webb.basis.thread.core.chapther1.one.seven.four;

/**
 * 在沉睡中停止 如果在sleep状态下停止某一线程，会进入线程，并且清除停止状态值
 *
 * @author 67345
 * @create 2017-02-16 21:10
 **/
public class Main {

    public static void main(String[] args) {
//        try {
            MyThread thread = new MyThread();
            thread.start();
//            Thread.sleep(200);
            thread.interrupt();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("end !");
    }
}

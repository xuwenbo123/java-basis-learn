package com.webb.basis.thread.core.chapter4.one.three;

/**
 * 使用Condition实现等待/通知错误用法与解决
 *
 * @author 67345
 * @create 2017-02-18 16:04
 **/
public class Main {
    public static void main(String[] args) {

        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();

    }
}

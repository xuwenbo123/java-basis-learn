package com.webb.basis.thread.core.chapter6.two.test1;

/**
 * 延迟加载 / 懒汉模式
 *
 * @author 67345
 * @create 2017-02-19 10:33
 **/
public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

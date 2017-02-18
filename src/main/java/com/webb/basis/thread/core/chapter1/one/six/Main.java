package com.webb.basis.thread.core.chapter1.one.six;

/**
 * getId() 方法
 *
 * @author 67345
 * @create 2017-02-16 17:52
 **/
public class Main {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println(thread.getName() + " " + thread.getId());
    }

}

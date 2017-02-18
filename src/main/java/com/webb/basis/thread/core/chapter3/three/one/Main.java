package com.webb.basis.thread.core.chapter3.three.one;

/**
 * ThreadLocal的使用 -- get() 与 null
 *
 * @author 67345
 * @create 2017-02-18 9:48
 **/
public class Main {

    public static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        if (threadLocal.get() == null) {
            System.out.println("从未放过值");
            threadLocal.set("value");
        }
        System.out.println(threadLocal.get());
        System.out.println(threadLocal.get());
    }

}

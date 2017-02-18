package com.webb.basis.thread.core.chapter3.three.three;

/**
 * 解决get() 返回Null的问题
 *
 * @author 67345
 * @create 2017-02-18 9:59
 **/
public class Main {
    public static ThreadLocalExt threadLocalExt = new ThreadLocalExt();

    public static void main(String[] args) {
        if (threadLocalExt.get() == null) {
            System.out.println("从未放过值");
            threadLocalExt.set("我的值");
        }
        System.out.println(threadLocalExt.get());
        System.out.println(threadLocalExt.get());
    }
}

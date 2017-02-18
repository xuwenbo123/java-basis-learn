package com.webb.basis.thread.core.chapter2.one.one;

/**
 * 方法内的变量为线程安全 -- “非线程安全”问题存在于“实例变量中”，如果是方法内部的私有变量，则不存在非线程安全问题，所得结果也就是线程安全的了
 *
 * @author 67345
 * @create 2017-02-17 11:02
 **/
public class Main {

    public static void main(String[] args) {
        HasSelfPrivateNum num = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(num);
        threadA.start();

        ThreadB threadB = new ThreadB(num);
        threadB.start();

    }
}

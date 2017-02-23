package com.webb.basis.thread.core.chapter6.one;

/**
 * @author 67345
 * @create 2017-02-19 10:26
 **/
public class MyObject {
    // 立即加载方式 == 饿汉模式
    private static MyObject object = new MyObject();

    public static MyObject getInstance() {
        // 此代码版本为立即加载，此版本代码的缺点是不能有其他实例变量
        // 因为getInstance()方法没有同步,所以有可能出现非线程安全问题
        return object;
    }
}

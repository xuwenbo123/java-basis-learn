package com.webb.basis.thread.core.chapter6.five;

/**
 * @author 67345
 * @create 2017-02-19 10:57
 **/
public class MyObject {

    private static MyObject instance = null;

    static {
        instance = new MyObject();
    }

    public static MyObject getInstance() {
        return instance;
    }
}

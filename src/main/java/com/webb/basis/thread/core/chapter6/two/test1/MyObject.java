package com.webb.basis.thread.core.chapter6.two.test1;

/**
 * @author 67345
 * @create 2017-02-19 10:31
 **/
public class MyObject {

    private static MyObject myObject;

    public static MyObject getInstance() {
        // 延迟加载
        if (myObject != null) {
        } else {
            myObject = new MyObject();
        }
        return myObject;
    }
}

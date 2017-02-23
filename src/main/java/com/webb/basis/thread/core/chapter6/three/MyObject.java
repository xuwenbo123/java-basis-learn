package com.webb.basis.thread.core.chapter6.three;

/**
 * @author 67345
 * @create 2017-02-19 10:47
 **/
public class MyObject {

    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }
}

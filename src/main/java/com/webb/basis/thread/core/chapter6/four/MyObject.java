package com.webb.basis.thread.core.chapter6.four;

import java.io.Serializable;

/**
 * @author 67345
 * @create 2017-02-19 10:47
 **/
public class MyObject implements Serializable {

    private static final long serialVersionUID = 888L;

    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

    protected Object readResolve() {
        System.out.println("调用readResolve方法");
        return MyObjectHandler.myObject;
    }
}

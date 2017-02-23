package com.webb.basis.thread.core.chapter6.two.test2;

/**
 * @author 67345
 * @create 2017-02-19 10:31
 **/
public class MyObject {

    private static MyObject myObject;

    public static MyObject getInstance() {
        try {
            if (myObject != null) {
            }
            else {
                // 模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}

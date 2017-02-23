package com.webb.basis.thread.core.chapter6.two.test3;

/**
 * @author 67345
 * @create 2017-02-19 10:37
 **/
public class MyObject {

    private volatile static MyObject myObject;

    // 使用双检测机制来解决问题，既保证了不需要同步代码的异步执行性，又保证了单例的效果

    public static MyObject getInstance() {
        try {
            if (myObject != null) {

            } else {
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}

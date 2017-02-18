package com.webb.basis.thread.core.chapter2.two.two;

/**
 * @author 67345
 * @create 2017-02-17 13:50
 **/
public class ObjectService {

    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("begin time = " + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end time = " + System.currentTimeMillis());
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

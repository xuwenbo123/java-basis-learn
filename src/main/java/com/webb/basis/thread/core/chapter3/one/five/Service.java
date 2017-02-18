package com.webb.basis.thread.core.chapter3.one.five;

/**
 * @author 67345
 * @create 2017-02-18 11:17
 **/
public class Service {

    public void testMethod(Object lock) {
        try {
            System.out.println("begin wait()");
            lock.wait();
            System.out.println("end wait()");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("出现异常了，因为呈wait状态的线程被interrupted了");
        }
    }
}

package com.webb.basis.thread.core.chapter2.two.seven;

/**
 * @author 67345
 * @create 2017-02-17 15:29
 **/
public class Service2 {

    private String anyString = new String();

    public void a() {
        try {
            synchronized (anyString) {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void b() {
        System.out.println("b begin");
        System.out.println("b end");
    }

}

package com.webb.basis.thread.core.chapter2.one.three;

/**
 * @author 67345
 * @create 2017-02-17 11:01
 **/
public class HasSelfPrivateNum {

    private int num = 0;

    synchronized public void addI(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }
            else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + " num = " + num);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

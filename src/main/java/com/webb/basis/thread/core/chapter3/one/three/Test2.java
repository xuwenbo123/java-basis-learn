package com.webb.basis.thread.core.chapter3.one.three;

/**
 * @author 67345
 * @create 2017-02-18 10:48
 **/
public class Test2 {
    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("syn上面");
            synchronized (lock) {
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait下的代码");
            }
            System.out.println("syn下面的代码");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

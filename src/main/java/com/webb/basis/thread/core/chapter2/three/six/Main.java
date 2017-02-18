package com.webb.basis.thread.core.chapter2.three.six;

/**
 * 使用原子类进行i++操作
 *
 * @author 67345
 * @create 2017-02-17 17:39
 **/
public class Main {

    public static void main(String[] args) {
        AddCountThread countThread = new AddCountThread();

        Thread t1 = new Thread(countThread);
        Thread t2 = new Thread(countThread);
        Thread t3 = new Thread(countThread);
        Thread t4 = new Thread(countThread);
        Thread t5 = new Thread(countThread);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

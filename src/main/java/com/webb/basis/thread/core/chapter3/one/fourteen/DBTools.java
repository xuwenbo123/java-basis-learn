package com.webb.basis.thread.core.chapter3.one.fourteen;

/**
 * @author 67345
 * @create 2017-02-18 15:25
 **/
public class DBTools {
    private volatile boolean prevIsA = false;

    public synchronized void backUpA() {
        try {

            while (prevIsA == true) {
                wait();
            }

            for (int i = 0; i < 5; i++) {
                System.out.println("★★★★★");
            }

            prevIsA = true;
            notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void backUpB() {
        try {

            while (prevIsA == false) {
                wait();
            }

            for (int i = 0; i < 5; i++) {
                System.out.println("☆☆☆☆☆");
            }

            prevIsA = false;
            notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

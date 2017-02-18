package com.webb.basis.thread.core.chapter3.one.one;

/**
 * @author 67345
 * @create 2017-02-18 10:38
 **/
public class ThreadB extends Thread {

    private MyList list;

    public ThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
            while (true) {
                if (list.size() == 5) {
                    System.out.println("==5了，线程b要退出了");
                }
            }

    }
}

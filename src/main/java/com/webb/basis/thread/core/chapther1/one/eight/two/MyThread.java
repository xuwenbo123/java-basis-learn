package com.webb.basis.thread.core.chapther1.one.eight.two;

/**
 * @author 67345
 * @create 2017-02-16 21:45
 **/
public class MyThread extends Thread {

    private long i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println(i); // 加了这行的话 控制台将不打印 main end,因为运行到println()方法内部
            // 时，同步锁未被释放
        }
    }
}

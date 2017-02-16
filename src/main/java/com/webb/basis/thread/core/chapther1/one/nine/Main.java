package com.webb.basis.thread.core.chapther1.one.nine;

/**
 * yield() ：放弃当前的CPU资源，将它让给其他的任务去占用CPU执行时间
 *
 * @author 67345
 * @create 2017-02-16 22:03
 **/
public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

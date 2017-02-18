package com.webb.basis.thread.core.chapter1.one.seven.six;

/**
 * 方法 stop() 与 java.lang.ThreadDeath 异常；方法stop()已经作废，因为如果强制让
 * 线程停止则有可能使一些请理性的工作得不到完成；另一个情况就是对锁定的对象进行了“解锁”，
 * 导致数据得不到同步处理，出现数据不一致的问题
 *
 * @author 67345
 * @create 2017-02-16 21:19
 **/
public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

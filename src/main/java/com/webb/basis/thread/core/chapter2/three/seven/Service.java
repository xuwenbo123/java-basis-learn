package com.webb.basis.thread.core.chapter2.three.seven;

/**
 * @author 67345
 * @create 2017-02-18 9:37
 **/
public class Service {
    private boolean isContinueRun = true;

    public void runMethod() {
        String anyString = new String();

        while (isContinueRun == true) {
            synchronized (anyString){
                // 不加synchronized的话，两个线程之间的变量不可见，所以无法停止
                // synchronized可以保证同一时刻，只有一个线程可以执行某一个方法或某一个代码块。他包含两个特性：互斥性和可见性。
                // synchronized不仅可以解决一个线程看到对象处于不一致的状态，还可以保证进入同步方法或者同步代码块的每个线程，都看到同一个锁保护之前所有的修改效果。
            }
        }
        System.out.println("停下来了");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}

package com.webb.basis.thread.core.chapter2.two.six;

/**验证同步 synchronized(this)代码块是锁定当前对象的
 *
 * @author 67345
 * @create 2017-02-17 14:35
 **/
public class Main {

    public static void main(String[] args) {
        Task task = new Task();

        MyThread1 thread1 = new MyThread1(task);
        thread1.start();

        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}

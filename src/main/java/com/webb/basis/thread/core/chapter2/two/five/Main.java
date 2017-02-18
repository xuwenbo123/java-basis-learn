package com.webb.basis.thread.core.chapter2.two.five;

/**
 * synchronized 代码块间的同步性 -- 当一个线程访问object的一个synchronized(this)同步代码块时，
 * 其他线程对同一个object中所有其他synchronized(this)同步代码块的访问将被阻塞，这说明synchronized使用的对象监视器是同一个
 *
 * @author 67345
 * @create 2017-02-17 14:28
 **/
public class Main {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("a");
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.setName("b");
        threadB.start();
    }
}

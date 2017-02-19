package com.webb.basis.thread.core.chapter2.two.seven;

/**
 * one. 锁非this对象具有一定的有点：如果一个类中有很多synchronized方法，这时虽然能实现同步，但会收到阻塞，所以影响运行效率；
 * 但如果使用同步代码块非this对象，则synchronized(非this)代码块中的程序与同步方法是异步的，不与其他锁this同步方法争抢this锁，则可dada提高运行效率
 *
 * 2. 使用synchronized(非this对象x)同步代码块格式进行同步操作时，对象监视器必须是同一个对象。如果不是同一个对象监视器，运行的结果就是异步调用了，就会交叉运行。
 *
 * 3. synchronized(非this对象x)同步代码块格式时，持有不同的对象监视器是异步的效果
 *
 * @author 67345
 * @create 2017-02-17 14:55
 **/
public class Main {
    public static void main(String[] args) {

        /*Service service = new Service();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();*/

        Service2 service2 = new Service2();

        ThreadA2 threadA = new ThreadA2(service2);
        threadA.setName("A");
        threadA.start();

        ThreadB2 threadB2 = new ThreadB2(service2);
        threadB2.setName("B");
        threadB2.start();

    }
}

package com.webb.basis.thread.core.chapter4.one.four;

/**
 * 正确使用Condition实现 等待/通知
 *
 *  one. Object类中的wait()相当于Condition类中的await()方法
 *  2. Object类中的wait(long timeout)方法相当于Condition类中的await(long time, TimeUnit unit)
 *  3. Object类中的notify() 相当于 Condition类中的signal()
 *  4. Object类中的notifyAll() 相当于 Condition类中的signalAll()
 *
 * @author 67345
 * @create 2017-02-18 16:22
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyService service = new MyService();

        ThreadA threadA = new ThreadA(service);
        threadA.start();

        Thread.sleep(3000);

        service.signal();

    }
}

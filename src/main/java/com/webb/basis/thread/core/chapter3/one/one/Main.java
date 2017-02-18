package com.webb.basis.thread.core.chapter3.one.one;

/**
 * 不使用等待/通知机制实现线程间通信。使用轮询
 *
 * @author 67345
 * @create 2017-02-18 10:40
 **/
public class Main {

    public static void main(String[] args) {
        MyList myList = new MyList();

        ThreadA threadA = new ThreadA(myList);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(myList);
        threadB.setName("B");
        threadB.start();
    }
}

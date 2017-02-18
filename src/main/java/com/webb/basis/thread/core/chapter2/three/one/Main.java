package com.webb.basis.thread.core.chapter2.three.one;

/**
 * 关键字volatile与死循环
 *
 * @author 67345
 * @create 2017-02-17 16:08
 **/
public class Main {

    public static void main(String[] args) {
        PrintString printString = new PrintString();

        printString.printStringMethod();

        System.out.println("我要停止它！ stopThread=" + Thread.currentThread().getName());

        printString.setContinuePrint(false);
    }
}

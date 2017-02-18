package com.webb.basis.thread.core.chapter2.three.two;

/**
 * 解决同步死循环 但当此代码运行的64bit的jvm上时，会出现死循环。解决的办法是使用volatile关键字
 * volatile : 强制从公共堆栈中取得变量的值，而不是从线程私有数据栈中取得变量的值
 *
 * @author 67345
 * @create 2017-02-17 16:12
 **/
public class Main {
    public static void main(String[] args) {
        PrintString printString = new PrintString();

        new Thread(printString).start();

        System.out.println("我要停止它。 stopThread=" + Thread.currentThread().getName());

        printString.setContinuePrint(false);
    }
}

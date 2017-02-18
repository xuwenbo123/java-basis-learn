package com.webb.basis.thread.core.chapter3.one.fourteen;

/**
 * @author 67345
 * @create 2017-02-18 15:28
 **/
public class Main {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();

        for (int i = 0; i < 20; i++) {
            BackUpB output = new BackUpB(dbTools);
            output.start();
            BackUpA input = new BackUpA(dbTools);
            input.start();
        }
    }
}

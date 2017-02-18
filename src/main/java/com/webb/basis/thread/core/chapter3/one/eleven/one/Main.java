package com.webb.basis.thread.core.chapter3.one.eleven.one;

/**
 * @author 67345
 * @create 2017-02-18 15:00
 **/
public class Main {
    public static void main(String[] args) {
        String lock = new String("");

        P p = new P(lock);
        C c = new C(lock);

        ThreadP threadP = new ThreadP(p);

        ThreadC threadC = new ThreadC(c);

        threadP.start();
        threadC.start();
    }
}

package com.webb.basis.thread.core.chapter2.three.six;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 67345
 * @create 2017-02-17 17:39
 **/
public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}

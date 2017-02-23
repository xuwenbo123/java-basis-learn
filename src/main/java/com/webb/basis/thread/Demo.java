package com.webb.basis.thread;

import java.lang.ref.WeakReference;

/**
 * @author 67345
 * @create 2017-02-20 15:20
 **/
public class Demo {

    /*ThreadLocal<Long> longLocal = new ThreadLocal<>();
    ThreadLocal<String> stringLocal = new ThreadLocal<>();

    public void set() {
        longLocal.set(Thread.currentThread().getId());
        stringLocal.set(Thread.currentThread().getName());
    }*/

    ThreadLocal<Long> longLocal = new ThreadLocal<Long>() {
        protected Long initialValue() {
            return Thread.currentThread().getId();
        }
    };

    ThreadLocal<String> stringLocal = new ThreadLocal<String>() {
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };

    public long getLong() {
        return longLocal.get();
    }

    public String getString() {
        return stringLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final Demo demo = new Demo();

//        demo.set();

        System.out.println(demo.getLong());
        System.out.println(demo.getString());

        Thread thread = new Thread() {
            @Override
            public void run() {
//                demo.set();
                System.out.println(demo.getLong());
                System.out.println(demo.getString());
            }
        };

        thread.start();
        thread.join();

        System.out.println(demo.getLong());
        System.out.println(demo.getString());

    }
}

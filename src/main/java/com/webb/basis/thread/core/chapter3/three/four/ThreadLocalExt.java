package com.webb.basis.thread.core.chapter3.three.four;

import java.util.Date;

/**
 * @author 67345
 * @create 2017-02-18 10:08
 **/
public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

}

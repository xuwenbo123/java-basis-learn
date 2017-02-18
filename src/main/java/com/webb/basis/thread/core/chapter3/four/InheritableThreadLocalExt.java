package com.webb.basis.thread.core.chapter3.four;

import java.util.Date;

/**
 * @author 67345
 * @create 2017-02-18 10:17
 **/
public class InheritableThreadLocalExt extends InheritableThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "我是子线程加的~";
    }

}

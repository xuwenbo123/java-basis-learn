package com.webb.basis.thread.core.chapter3.three.three;

/**
 * @author 67345
 * @create 2017-02-18 9:58
 **/
public class ThreadLocalExt extends ThreadLocal {

    @Override
    public Object initialValue() {
        return "我是默认值 第一次get不再为null";
    }
}

package com.webb.basis.thread.core.chapter3.one.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 67345
 * @create 2017-02-18 10:37
 **/
public class MyList {

    private List list = new ArrayList();

    public void add() {
        list.add("webb");
    }

    public int size() {
        return list.size();
    }
}

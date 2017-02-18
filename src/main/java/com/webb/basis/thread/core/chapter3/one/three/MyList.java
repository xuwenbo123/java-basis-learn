package com.webb.basis.thread.core.chapter3.one.three;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 67345
 * @create 2017-02-18 11:00
 **/
public class MyList {

    private static List list = new ArrayList();

    public static void add() {
        list.add("anyString");
    }

    public static int size() {
        return list.size();
    }
}

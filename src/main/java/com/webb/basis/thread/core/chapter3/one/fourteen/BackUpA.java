package com.webb.basis.thread.core.chapter3.one.fourteen;

/**
 * @author 67345
 * @create 2017-02-18 15:28
 **/
public class BackUpA extends Thread {

    private DBTools dbTools;

    public BackUpA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backUpA();
    }
}

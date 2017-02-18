
package com.webb.basis.thread.core.chapter3.one.fourteen;

/**
 * @author 67345
 * @create 2017-02-18 15:28
 **/
public class BackUpB extends Thread {

    private DBTools dbTools;

    public BackUpB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backUpB();
    }
}

package com.webb.basis.thread.core.chapter3.one.twelve;

import java.io.PipedOutputStream;

/**
 * @author 67345
 * @create 2017-02-18 15:18
 **/
public class ThreadWrite extends Thread {

    private WriteData writeData;
    private PipedOutputStream out;

    public ThreadWrite(WriteData writeData, PipedOutputStream out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }
}

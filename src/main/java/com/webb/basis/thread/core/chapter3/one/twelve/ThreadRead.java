package com.webb.basis.thread.core.chapter3.one.twelve;

import java.io.PipedInputStream;

/**
 * @author 67345
 * @create 2017-02-18 15:19
 **/
public class ThreadRead extends Thread {

    private ReadData readData;
    private PipedInputStream input;

    public ThreadRead(ReadData readData, PipedInputStream input) {
        this.readData = readData;
        this.input = input;
    }

    @Override
    public void run() {
        readData.readMethod(input);
    }
}

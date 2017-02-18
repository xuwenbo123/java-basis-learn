package com.webb.basis.thread.core.chapter3.one.twelve;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author 67345
 * @create 2017-02-18 15:20
 **/
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();

        PipedInputStream inputStream = new PipedInputStream();
        PipedOutputStream outputStream = new PipedOutputStream();

        outputStream.connect(inputStream);

        ThreadRead threadRead = new ThreadRead(readData, inputStream);
        threadRead.start();

        Thread.sleep(2000);

        ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
        threadWrite.start();

    }
}

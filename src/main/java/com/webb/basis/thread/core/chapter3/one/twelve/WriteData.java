package com.webb.basis.thread.core.chapter3.one.twelve;

import java.io.PipedOutputStream;

/**
 * @author 67345
 * @create 2017-02-18 15:14
 **/
public class WriteData {

    public void writeMethod(PipedOutputStream out) {
        try {
            System.out.println("write : ");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

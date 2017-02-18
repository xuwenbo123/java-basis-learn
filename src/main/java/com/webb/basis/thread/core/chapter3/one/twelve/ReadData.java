package com.webb.basis.thread.core.chapter3.one.twelve;

import java.io.PipedInputStream;

/**
 * @author 67345
 * @create 2017-02-18 15:16
 **/
public class ReadData {

    public void readMethod(PipedInputStream input) {
        try {
            System.out.println("read :");
            byte[] byteArray = new byte[20];
            int readLength = input.read(byteArray);

            while (readLength != -1){
                String newData = new String(byteArray, 0, readLength);
                System.out.println(newData);
                readLength = input.read(byteArray);
            }

            System.out.println();
            input.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

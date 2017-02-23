package com.webb.basis.thread.core.chapter6.four;

import java.io.*;

/**
 * 序列化与反序列化的单例模式的实现
 *
 * @author 67345
 * @create 2017-02-19 10:49
 **/
public class Main {
    public static void main(String[] args) throws Exception {
        MyObject myObject = MyObject.getInstance();
        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\test.txt"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(myObject);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println(myObject.hashCode());

        FileInputStream fileInputStream = new FileInputStream(new File("D:\\test.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        MyObject myObject1 = (MyObject) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println(myObject1.hashCode());
    }
}

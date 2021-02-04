package com.pengo.singleton.breake1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author pengo
 * @description: 序列化反序列化破坏单例模式
 * @date: 2021/2/4
 */
public class Test
{
  public static void main(String[] args) throws Exception
  {
//    write();
    read();
    read();
  }

  private static void read() throws Exception
  {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/a.txt"));
    Singleton singleton = (Singleton)ois.readObject();
    System.out.println(singleton);
  }

  private static void write() throws Exception
  {
    Singleton instance = Singleton.getInstance();
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/a.txt"));
    oos.writeObject(instance);
    oos.close();
  }
}

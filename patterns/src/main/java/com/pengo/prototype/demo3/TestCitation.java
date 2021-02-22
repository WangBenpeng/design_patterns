package com.pengo.prototype.demo3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author pengo
 * @description: 序列化实现深克隆
 * @date: 2021/2/22
 */
public class TestCitation
{
  public static void main(String[] args) throws Exception
  {
    Citation c1 = new Citation();
    Student s1 = new Student();
    s1.setName("john");
    c1.setStu(s1);

    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/a.txt"));
    oos.writeObject(c1);
    oos.close();

    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/a.txt"));
    Citation c2 = (Citation)ois.readObject();

    c2.getStu().setName("dane");

    c1.show();
    c2.show();
  }
}

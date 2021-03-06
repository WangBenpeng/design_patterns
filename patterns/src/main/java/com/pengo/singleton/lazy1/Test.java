package com.pengo.singleton.lazy1;

/**
 * @author pengo
 * @description: 懒汉式（线程不安全）
 * @date: 2021/2/4
 */
public class Test
{
  public static void main(String[] args)
  {
    SingletonLazy instance = SingletonLazy.getInstance();
    SingletonLazy instance2 = SingletonLazy.getInstance();
    System.out.println(instance == instance2);
  }
}

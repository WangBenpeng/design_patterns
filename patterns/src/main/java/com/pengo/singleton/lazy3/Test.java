package com.pengo.singleton.lazy3;

/**
 * @author pengo
 * @description:
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

package com.pengo.singleton.breake1;

import java.io.Serializable;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/4
 */
public class Singleton implements Serializable
{
  private Singleton(){}

  private static Singleton instance = new Singleton();

  public static Singleton getInstance()
  {
    return instance;
  }

  //解决序列化破坏单例模式
  private Object readResolve()
  {
    return instance;
  }
}

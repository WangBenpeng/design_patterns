package com.pengo.singleton.breake2;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/4
 */
public class Singleton
{
  private Singleton(){
    if(instance != null)
      throw new RuntimeException("can't create another class");
  }

  private static Singleton instance;

  static {
    instance = new Singleton();
  }

  public static Singleton getInstance()
  {
    return instance;
  }
}

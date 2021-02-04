package com.pengo.singleton.lazy1;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/4
 */
public class SingletonLazy
{
  private SingletonLazy(){};

  private static SingletonLazy instance;

  public static SingletonLazy getInstance()
  {
    if(instance == null)
    {
      instance = new SingletonLazy();
    }
    return instance;
  }
}

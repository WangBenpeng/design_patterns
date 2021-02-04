package com.pengo.singleton.lazy3;

/**
 * @author pengo
 * @description: 静态内部类
 * @date: 2021/2/4
 */
public class SingletonLazy
{
  private SingletonLazy(){}

  //静态内部类
  private static class SingletonHolder
  {
    private static final SingletonLazy INSTANCE =new SingletonLazy();
  }

  public static SingletonLazy getInstance()
  {
    return SingletonHolder.INSTANCE;
  }

}

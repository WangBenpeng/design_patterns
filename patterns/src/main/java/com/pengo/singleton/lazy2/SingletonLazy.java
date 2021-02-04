package com.pengo.singleton.lazy2;

/**
 * @author pengo
 * @description:
 *    懒汉式（线程安全，双重检查锁）
 *    DCL：Double Check Lock
 * @date: 2021/2/4
 */
public class SingletonLazy
{
  private SingletonLazy(){};

  private static volatile SingletonLazy instance;

  public static SingletonLazy getInstance()
  {
    //判断instance是否为空，提升多线程效率
    if(instance == null)
    {
      //如果有多个线程进入，锁住
      synchronized(SingletonLazy.class)
      {
        //一个线程进入，创建对象，第一个if就会把其他线程隔开，不会竞争锁了
        if(instance == null)
        {
          instance = new SingletonLazy();
        }
      }
    }
    return instance;
  }
}

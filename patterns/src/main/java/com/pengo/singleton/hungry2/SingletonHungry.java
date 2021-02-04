package com.pengo.singleton.hungry2;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/4
 */
public class SingletonHungry
{
  private SingletonHungry()
  {

  }

  private static SingletonHungry instance;

  static {
    instance = new SingletonHungry();
  }

  public static SingletonHungry getInstance()
  {
    return instance;
  }
}

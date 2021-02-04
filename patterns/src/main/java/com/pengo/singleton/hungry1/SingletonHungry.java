package com.pengo.singleton.hungry1;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/4
 */
public class SingletonHungry
{
  private static SingletonHungry instance = new SingletonHungry();

  private SingletonHungry()
  {
  }

  public static SingletonHungry getInstance()
  {
    return instance;
  }
}

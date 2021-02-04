package com.pengo.singleton.hungry3;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/4
 */
public class Test
{
  public static void main(String[] args)
  {
    SingletonHungry instance = SingletonHungry.INSTANCE;
    SingletonHungry instance2 = SingletonHungry.INSTANCE;

    System.out.println(instance == instance2);
  }
}

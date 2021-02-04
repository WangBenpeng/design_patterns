package com.pengo.singleton.hungry1;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/4
 */
public class TestClient
{
  public static void main(String[] args)
  {
    SingletonHungry instance = SingletonHungry.getInstance();
    SingletonHungry instance2 = SingletonHungry.getInstance();
    System.out.println(instance == instance2);
  }
}

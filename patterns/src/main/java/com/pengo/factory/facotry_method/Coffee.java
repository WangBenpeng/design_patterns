package com.pengo.factory.facotry_method;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/7
 */
public abstract class Coffee
{
  public abstract String getName();

  public void addMilk()
  {
    System.out.println("add milk");
  }

  public void addSugar()
  {
    System.out.println("add sugar");
  }
}

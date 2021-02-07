package com.pengo.factory.simple_factory;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/7
 */
public class SimpleFactoryCoffee
{
  public static Coffee createCoffee(String type)
  {
    if("american".equals(type))
    {
      return new AmericanCoffee();
    }else if("latte".equals(type))
    {
      return new LatteCoffee();
    } else
    {
      throw new RuntimeException("no ordered coffee");
    }
  }
}

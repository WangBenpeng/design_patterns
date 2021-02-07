package com.pengo.factory.facotry_method;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/7
 */
public class LatteCoffeeFactory implements CoffeeFactory
{
  @Override
  public Coffee createCoffee()
  {
    return new LatteCoffee();
  }
}

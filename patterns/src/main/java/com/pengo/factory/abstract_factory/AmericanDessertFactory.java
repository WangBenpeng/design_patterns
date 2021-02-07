package com.pengo.factory.abstract_factory;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/7
 */
public class AmericanDessertFactory implements DessertFactory
{
  public Coffee createCoffee()
  {
    return new AmericanCoffee();
  }

  public Dessert createDessert()
  {
    return new MatchMouse();
  }
}

package com.pengo.factory.abstract_factory;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/7
 */
public class ItalyDessertFactory implements DessertFactory
{
  public Coffee createCoffee()
  {
    return new LatteCoffee();
  }

  public Dessert createDessert()
  {
    return new Tiramisu();
  }
}

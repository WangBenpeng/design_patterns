package com.pengo.factory.abstract_factory;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/7
 */
public interface DessertFactory
{
  Coffee createCoffee();

  Dessert createDessert();
}

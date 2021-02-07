package com.pengo.factory.simple_factory;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/7
 */
public class CoffeeStore
{
  public Coffee orderCoffee(String type)
  {
    Coffee coffee = SimpleFactoryCoffee.createCoffee(type);

    coffee.addMilk();
    coffee.addSugar();

    return coffee;
  }
}

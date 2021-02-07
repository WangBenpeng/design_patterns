package com.pengo.factory.facotry_method;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/7
 */
public class CoffeeStore
{
  private CoffeeFactory factory;

  public void setFactory(CoffeeFactory factory)
  {
    this.factory = factory;
  }

  public Coffee orderCoffee()
  {
    Coffee coffee = factory.createCoffee();

    coffee.addMilk();
    coffee.addSugar();

    return coffee;
  }
}

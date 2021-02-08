package com.pengo.factory.config_factory;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/8
 */
public class TestClient
{
  public static void main(String[] args)
  {
    Coffee coffee = CoffeeFactory.createCoffee("latte");
    System.out.println(coffee.getName());
  }
}

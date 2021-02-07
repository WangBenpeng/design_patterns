package com.pengo.factory.simple_factory;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/7
 */
public class TestClient
{
  public static void main(String[] args)
  {
    CoffeeStore store = new CoffeeStore();
    Coffee coffee = store.orderCoffee("american");

    System.out.println(coffee.getName());
  }
}

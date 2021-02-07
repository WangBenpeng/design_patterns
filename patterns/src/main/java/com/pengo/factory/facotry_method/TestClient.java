package com.pengo.factory.facotry_method;

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
//    CoffeeFactory factory = new AmericanCoffeeFactory();
    CoffeeFactory factory = new LatteCoffeeFactory();

    store.setFactory(factory);
    Coffee coffee = store.orderCoffee();

    System.out.println(coffee.getName());
  }
}

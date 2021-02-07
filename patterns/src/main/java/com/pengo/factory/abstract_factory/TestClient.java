package com.pengo.factory.abstract_factory;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/7
 */
public class TestClient
{
  public static void main(String[] args)
  {
//    DessertFactory factory = new AmericanDessertFactory();
    DessertFactory factory = new ItalyDessertFactory();

    Coffee coffee = factory.createCoffee();
    Dessert dessert = factory.createDessert();

    System.out.println(coffee.getName());
    dessert.show();
  }
}

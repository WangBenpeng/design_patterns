package com.pengo.builder.demo1;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/22
 */
public class TestClient
{
  public static void main(String[] args)
  {
    Director director = new Director(new OfoBuilder());
    Bike construct = director.construct();

    System.out.println(construct.getFrame());
    System.out.println(construct.getSeat());
  }
}

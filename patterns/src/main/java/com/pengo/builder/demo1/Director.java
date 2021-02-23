package com.pengo.builder.demo1;

/**
 * @author pengo
 * @description: 装配者
 * @date: 2021/2/22
 */
public class Director
{
  private Builder builder;

  public Director(Builder builder)
  {
    this.builder = builder;
  }

  public Bike construct(){
    builder.buildFrame();
    builder.buildSeat();
    return builder.createBike();
  }
}

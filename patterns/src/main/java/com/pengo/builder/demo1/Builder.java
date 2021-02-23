package com.pengo.builder.demo1;

/**
 * @author pengo
 * @description: 建造者抽象类
 * @date: 2021/2/22
 */
public abstract class Builder
{
  protected Bike bike = new Bike();

  public abstract void buildFrame();

  public abstract void buildSeat();

  public abstract Bike createBike();
}

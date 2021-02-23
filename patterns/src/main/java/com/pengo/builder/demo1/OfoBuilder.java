package com.pengo.builder.demo1;

/**
 * @author pengo
 * @description: ofo构造者
 * @date: 2021/2/22
 */
public class OfoBuilder extends Builder
{
  @Override
  public void buildFrame()
  {
    bike.setFrame("Ofo frame");
  }

  @Override
  public void buildSeat()
  {
    bike.setSeat("Ofo seat");
  }

  @Override
  public Bike createBike()
  {
    return bike;
  }
}

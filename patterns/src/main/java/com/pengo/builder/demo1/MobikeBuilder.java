package com.pengo.builder.demo1;

/**
 * @author pengo
 * @description: 摩拜单车建造类
 * @date: 2021/2/22
 */
public class MobikeBuilder extends Builder
{
  @Override
  public void buildFrame()
  {
    bike.setFrame("mobike frame");
  }

  @Override
  public void buildSeat()
  {
    bike.setSeat("mobike seat");
  }

  @Override
  public Bike createBike()
  {
    return bike;
  }
}

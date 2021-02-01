package com.pengo.rectangle.after;

/**
 * @author pengo
 * @description: 正方形
 * @date: 2021/1/29
 */
public class Square implements Quadrilateral
{
  private double side;

  public void setSide(double side)
  {
    this.side = side;
  }

  @Override
  public double getLength()
  {
    return side;
  }

  @Override
  public double getWidth()
  {
    return side;
  }
}

package com.pengo.rectangle.after;

/**
 * @author pengo
 * @description: 长方形
 * @date: 2021/1/29
 */
public class Rectangle implements Quadrilateral
{
  private double length;
  private double width;

  public void setLength(double length)
  {
    this.length = length;
  }

  public void setWidth(double width)
  {
    this.width = width;
  }

  @Override
  public double getLength()
  {
    return length;
  }

  @Override
  public double getWidth()
  {
    return width;
  }
}

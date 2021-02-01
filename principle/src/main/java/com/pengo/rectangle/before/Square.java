package com.pengo.rectangle.before;

/**
 * @author pengo
 * @description: 正方形
 * @date: 2021/1/29
 */
public class Square extends Rectangle
{
  @Override
  public void setLength(double length)
  {
    super.setLength(length);
    super.setWidth(length);
  }

  @Override
  public void setWidth(double width)
  {
    super.setWidth(width);
    super.setLength(width);
  }
}

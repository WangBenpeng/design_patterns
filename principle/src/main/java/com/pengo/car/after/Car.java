package com.pengo.car.after;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/3
 */
public abstract class Car
{
  abstract void run();

  protected Color color;

  public Color getColor()
  {
    return color;
  }

  public void setColor(Color color)
  {
    this.color = color;
  }
}

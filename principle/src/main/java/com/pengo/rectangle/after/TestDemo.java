package com.pengo.rectangle.after;


/**
 * @author pengo
 * @description: 测试类
 * @date: 2021/1/29
 */
public class TestDemo
{
  public static void main(String[] args)
  {
    Rectangle rectangle = new Rectangle();
    rectangle.setLength(10);
    rectangle.setWidth(20);

    resize(rectangle);
    print(rectangle);
  }

  private static void resize(Rectangle rectangle)
  {
    while(rectangle.getLength() <= rectangle.getWidth())
      rectangle.setLength(rectangle.getLength() + 1);
  }

  private static void print(Quadrilateral quadrilateral)
  {
    System.out.println(quadrilateral.getLength() + " | " + quadrilateral.getWidth());
  }
}

package com.pengo.rectangle.before;

/**
 * @author pengo
 * @description: 测试类
 * @date: 2021/1/29
 */
public class RectangleDemo
{
  public static void main(String[] args)
  {
    Rectangle rectangle = new Rectangle();
    rectangle.setLength(10);
    rectangle.setWidth(20);
    Square square = new Square();
    square.setLength(10);

    resize(rectangle);
    print(rectangle);
    System.out.println("--------------");
    resize(square);
    print(square);
  }

  private static void resize(Rectangle rectangle)
  {
    while(rectangle.getLength() <= rectangle.getWidth())
      rectangle.setLength(rectangle.getLength() + 1);
  }

  private static void print(Rectangle rectangle)
  {
    System.out.println(rectangle.getLength() + " | " + rectangle.getWidth());
  }
}

package com.pengo.prototype.demo2;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/10
 */
public class TestCitation
{
  public static void main(String[] args) throws CloneNotSupportedException
  {
    Citation c1 = new Citation();
    Citation c2 = c1.clone();

    c1.setName("zhang san");
    c2.setName("li si");

    c1.show();
    c2.show();
  }
}

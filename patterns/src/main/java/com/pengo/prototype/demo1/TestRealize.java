package com.pengo.prototype.demo1;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/10
 */
public class TestRealize
{
  public static void main(String[] args) throws CloneNotSupportedException
  {
    RealizeType r1 = new RealizeType();

    RealizeType r2 = r1.clone();

    System.out.println("compare: " + (r1 == r2));
  }
}

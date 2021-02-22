package com.pengo.prototype.demo1;

/**
 * @author pengo
 * @description: 浅克隆
 * @date: 2021/2/10
 */
public class RealizeType implements Cloneable
{
  public RealizeType()
  {
    System.out.println("call constructor success");
  }

  @Override
  protected RealizeType clone() throws CloneNotSupportedException
  {
    System.out.println("clone success");
    return (RealizeType)super.clone();
  }
}

package com.pengo.prototype.demo2;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/10
 */
public class Citation implements Cloneable
{
  private String name;

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  @Override
  public Citation clone() throws CloneNotSupportedException
  {
    return (Citation)super.clone();
  }

  public void show()
  {
    System.out.println(name + " show the citation");
  }
}

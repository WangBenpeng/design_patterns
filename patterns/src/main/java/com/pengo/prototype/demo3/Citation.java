package com.pengo.prototype.demo3;

import java.io.Serializable;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/22
 */
public class Citation implements Cloneable, Serializable
{
  private Student stu;

  public Student getStu()
  {
    return stu;
  }

  public void setStu(Student stu)
  {
    this.stu = stu;
  }

  @Override
  protected Citation clone() throws CloneNotSupportedException
  {
    System.out.println("call clone successful");
    return (Citation)super.clone();
  }

  public void show()
  {
    System.out.println(stu.getName()+" show the citation");
  }
}

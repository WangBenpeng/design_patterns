package com.pengo.prototype.demo2;

/**
 * @author pengo
 * @description:  浅克隆
 * @date: 2021/2/10
 */
public class Citation implements Cloneable
{
//  private String name;
//
//  public String getName()
//  {
//    return name;
//  }
//
//  public void setName(String name)
//  {
//    this.name = name;
//  }
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
  public Citation clone() throws CloneNotSupportedException
  {
    return (Citation)super.clone();
  }

  public void show()
  {
    System.out.println(stu.getName() + " show the citation");
  }
}

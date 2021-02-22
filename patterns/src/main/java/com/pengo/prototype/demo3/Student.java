package com.pengo.prototype.demo3;

import java.io.Serializable;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/22
 */
public class Student implements Serializable
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
}

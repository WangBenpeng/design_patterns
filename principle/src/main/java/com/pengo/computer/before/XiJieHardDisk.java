package com.pengo.computer.before;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/1
 */
public class XiJieHardDisk
{
  public void save(String data)
  {
    System.out.println("存储数据：" + data);
  }

  public String get()
  {
    System.out.println("获取数据");
    return "数据";
  }
}

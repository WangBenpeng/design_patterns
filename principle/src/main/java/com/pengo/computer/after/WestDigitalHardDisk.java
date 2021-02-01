package com.pengo.computer.after;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/1
 */
public class WestDigitalHardDisk implements HardDisk
{
  @Override
  public void save(String data)
  {
    System.out.println("WestDigital save " + data);
  }

  @Override
  public String get()
  {
    System.out.println("get data from WestDigital");
    return "WestDigital";
  }
}

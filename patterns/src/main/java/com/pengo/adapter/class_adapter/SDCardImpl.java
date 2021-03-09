package com.pengo.adapter.class_adapter;

/**
 * @author pengo
 * @description:
 * @date: 2021/3/9
 */
public class SDCardImpl implements SDCard
{
  @Override
  public String readSD()
  {
    String msg = "reading msg from sd card";
    return msg;
  }

  @Override
  public void writeSD(String msg)
  {
    System.out.println("write msg to sd : " + msg);
  }
}

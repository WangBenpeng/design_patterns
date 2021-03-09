package com.pengo.adapter.class_adapter;

/**
 * @author pengo
 * @description:
 * @date: 2021/3/9
 */
public class SDAdapterTF extends TFCardImpl implements SDCard
{
  @Override
  public String readSD()
  {
    System.out.println("read msg from SDAdapterTF");
    return readTF();
  }

  @Override
  public void writeSD(String msg)
  {
    writeTF(msg);
  }
}

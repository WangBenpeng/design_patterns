package com.pengo.adapter.class_adapter;

/**
 * @author pengo
 * @description:
 * @date: 2021/3/9
 */
public class TFCardImpl implements TFCard
{
  @Override
  public String readTF()
  {
    String msg = "read msg from TFCard";
    return msg;
  }

  @Override
  public void writeTF(String msg)
  {
    System.out.println("write msg to TFCard : " + msg);
  }
}

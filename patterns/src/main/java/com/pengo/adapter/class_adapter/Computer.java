package com.pengo.adapter.class_adapter;

/**
 * @author pengo
 * @description:
 * @date: 2021/3/9
 */
public class Computer
{
  public String readSD(SDCard sdCard)
  {
    if(sdCard == null)
      throw new NullPointerException("sdCard cannot null");
    return sdCard.readSD();
  }
}

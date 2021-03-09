package com.pengo.adapter.class_adapter;

/**
 * @author pengo
 * @description: 适配器接口
 * @date: 2021/3/9
 */
public interface TFCard
{
  String readTF();

  void writeTF(String msg);
}

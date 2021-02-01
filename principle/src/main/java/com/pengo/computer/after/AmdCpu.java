package com.pengo.computer.after;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/1
 */
public class AmdCpu implements Cpu
{
  @Override
  public void run()
  {
    System.out.println("AMD cpu running");
  }
}

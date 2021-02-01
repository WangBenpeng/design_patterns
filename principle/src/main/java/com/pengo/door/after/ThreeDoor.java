package com.pengo.door.after;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/1
 */
public class ThreeDoor implements AntiTheft,Fireproof,Waterproof
{
  @Override
  public void antiTheft()
  {
    System.out.println("Three -> antiTheft");
  }

  @Override
  public void fireproof()
  {
    System.out.println("Three -> fireproof");
  }

  @Override
  public void waterproof()
  {
    System.out.println("Three -> waterproof");
  }
}

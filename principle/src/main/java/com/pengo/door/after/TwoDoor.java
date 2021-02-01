package com.pengo.door.after;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/1
 */
public class TwoDoor implements AntiTheft,Fireproof
{
  @Override
  public void antiTheft()
  {
    System.out.println("Two -> antiTheft");
  }

  @Override
  public void fireproof()
  {
    System.out.println("Two -> fireproof");
  }
}

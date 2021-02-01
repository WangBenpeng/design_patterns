package com.pengo.door.before;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/1
 */
public class PanpanDoor implements SafetryDoor
{
  @Override
  public void antiTheft()
  {
    System.out.println("panpan antiTheft");
  }

  @Override
  public void fireproof()
  {
    System.out.println("panpan Fireproof");
  }

  @Override
  public void waterproof()
  {
    System.out.println("panpan waterproof");
  }
}

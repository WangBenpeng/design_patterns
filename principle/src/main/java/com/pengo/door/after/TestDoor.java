package com.pengo.door.after;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/1
 */
public class TestDoor
{
  public static void main(String[] args)
  {
    ThreeDoor door1 = new ThreeDoor();
    door1.fireproof();
    door1.waterproof();
    door1.antiTheft();
    System.out.println("--------------");
    TwoDoor door2 = new TwoDoor();
    door2.antiTheft();
    door2.fireproof();
  }
}

package com.pengo.door.before;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/1
 */
public class TestClient
{
  public static void main(String[] args)
  {
    PanpanDoor door = new PanpanDoor();
    door.fireproof();
    door.waterproof();
    door.antiTheft();
  }
}

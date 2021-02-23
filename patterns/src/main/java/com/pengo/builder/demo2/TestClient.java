package com.pengo.builder.demo2;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/23
 */
public class TestClient
{
  public static void main(String[] args)
  {
    Phone phone = new Phone.Builder()
                  .cpu("intel")
                  .mainboard("asus")
                  .memory("kingston")
                  .screen("samsung")
                  .build();
    System.out.println(phone);
  }
}

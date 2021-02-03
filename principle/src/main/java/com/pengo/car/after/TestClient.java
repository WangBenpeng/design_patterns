package com.pengo.car.after;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/3
 */
public class TestClient
{
  public static void main(String[] args)
  {
    ElectricCar electricCar = new ElectricCar();
    White white = new White();
    electricCar.setColor(white);
    electricCar.getColor().colorKind();
    electricCar.run();

    HybridCar hybridCar = new HybridCar();
    hybridCar.setColor(white);
    hybridCar.getColor().colorKind();
    hybridCar.run();
  }
}

package com.pengo.car.before;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/3
 */
public class TestClient
{
  public static void main(String[] args)
  {
    WhitePetrolCar whitePetrolCar = new WhitePetrolCar();
    RedPetrolCar redPetrolCar = new RedPetrolCar();
    WhiteElectricCar whiteElectricCar = new WhiteElectricCar();
    RedElectricCar redElectricCar = new RedElectricCar();
    WhiteHybridCar whiteHybridCar = new WhiteHybridCar();
    whitePetrolCar.move();
    redPetrolCar.move();
    whiteElectricCar.move();
    redElectricCar.move();
    whiteHybridCar.move();
  }
}

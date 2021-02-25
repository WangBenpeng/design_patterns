package com.pengo.proxy.static_proxy;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/25
 */
public class ProxyPoint implements SellTickets
{
  private TrainStation trainStation = new TrainStation();

  @Override
  public void sell()
  {
    System.out.println("proxy point take some fee");
    trainStation.sell();
  }
}

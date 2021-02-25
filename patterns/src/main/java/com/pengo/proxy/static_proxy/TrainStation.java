package com.pengo.proxy.static_proxy;

/**
 * @author pengo
 * @description: 火车站卖票
 * @date: 2021/2/25
 */
public class TrainStation implements SellTickets
{
  @Override
  public void sell()
  {
    System.out.println("Train station sell tickets");
  }
}

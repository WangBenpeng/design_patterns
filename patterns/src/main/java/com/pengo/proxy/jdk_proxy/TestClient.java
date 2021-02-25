package com.pengo.proxy.jdk_proxy;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/25
 */
public class TestClient
{
  public static void main(String[] args)
  {
    ProxyFactory proxyFactory = new ProxyFactory();
    SellTickets proxyObject = proxyFactory.getProxyObject();
    proxyObject.sell();
  }
}

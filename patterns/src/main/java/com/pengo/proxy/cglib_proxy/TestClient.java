package com.pengo.proxy.cglib_proxy;

/**
 * @author pengo
 * @description:
 * @date: 2021/3/1
 */
public class TestClient
{
  public static void main(String[] args)
  {
    ProxyFactory proxyFactory = new ProxyFactory();
    TrainStation proxyObject = proxyFactory.getProxyObject();
    proxyObject.sell();
  }
}

package com.pengo.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author pengo
 * @description: jdk动态代理
 * @date: 2021/2/25
 */
public class ProxyFactory
{
  //目标对象
  private TrainStation station = new TrainStation();

  public SellTickets getProxyObject()
  {
    //返回代理对象
    /*
     *  ClassLoader loader ： 类加载器
        Class<?>[] interfaces ： 代理类实现的接口的字节码对象
        InvocationHandler h ： 代理对象的调用处理程序
     */
    SellTickets proxyObject = (SellTickets)Proxy.newProxyInstance(station.getClass().getClassLoader(), station.getClass().getInterfaces(), new InvocationHandler()
    {
      /**
       * @param proxy 代理对象，和proxyObject对象是同一个对象，在invoke方法中基本不用
       * @param method 对接口中的方法进行封装的method对象
       * @param args 调用方法的实际参数
       * @return 代理方法的返回值
       * @throws Throwable
       */
      @Override
      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
      {
        System.out.println("proxy station charges a fee(jdk)");
        Object invoke = method.invoke(station, args);
        return invoke;
      }
    });
    return proxyObject;
  }
}

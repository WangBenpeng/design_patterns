package com.pengo.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author pengo
 * @description: Cglib代理模式
 * @date: 2021/3/1
 */
public class ProxyFactory implements MethodInterceptor
{
  private TrainStation trainStation = new TrainStation();

  public TrainStation getProxyObject(){
    //创建对象，类似jdk里的proxy类
    Enhancer enhancer = new Enhancer();
    //设置父类的字节码对象
    enhancer.setSuperclass(TrainStation.class);
    //设置回调函数
    enhancer.setCallback(this);
    //创建代理对象
    TrainStation station = (TrainStation)enhancer.create();
    return station;
  }

  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable
  {
    System.out.println("proxy charges a fee (cglib)");
    Object obj = method.invoke(trainStation, objects);
    return obj;
  }
}

package com.pengo.singleton.breake2;

import java.lang.reflect.Constructor;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/4
 */
public class Test
{
  public static void main(String[] args) throws Exception
  {
    Class<Singleton> clazz = Singleton.class;
    Constructor<Singleton> cons = clazz.getDeclaredConstructor();
    cons.setAccessible(true);
    Singleton singleton = cons.newInstance();
    Singleton singleton2 = cons.newInstance();
    //输出false
    System.out.println(singleton == singleton2);
  }
}

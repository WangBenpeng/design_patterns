package com.pengo.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/8
 */
public class CoffeeFactory
{

  //创建容器
  private static Map<String, Coffee> map = new HashMap<>();

  //静态代码块实例化配置文件到容器中
  static {
    Properties properties = new Properties();
    InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
    try
    {
      properties.load(is);
      Set<Object> keys = properties.keySet();
      for(Object key : keys)
      {
        String className = properties.getProperty((String)key);
        Class clazz = Class.forName(className);
        Coffee coffee = (Coffee)clazz.getDeclaredConstructor().newInstance();
        map.put((String)key, coffee);
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }

  /**
   * 静态工厂，返回咖啡
   * @param name
   * @return
   */
  public static Coffee createCoffee(String name)
  {
    return map.get(name);
  }
}

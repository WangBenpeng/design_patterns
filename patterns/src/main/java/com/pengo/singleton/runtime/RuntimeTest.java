package com.pengo.singleton.runtime;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/4
 */
public class RuntimeTest
{
  public static void main(String[] args) throws IOException
  {
    Runtime runtime = Runtime.getRuntime();
    Process ifconfig = runtime.exec("ifconfig");
    InputStream is = ifconfig.getInputStream();
    byte[] bytes = new byte[1024 * 1024];
    int read = is.read(bytes);
    System.out.println(new String(bytes, 0, read));
  }
}

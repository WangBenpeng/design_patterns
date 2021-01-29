package com.pengo.sougou;

/**
 * @author pengo
 * @description: 测试方法
 * @date: 2021/1/29
 */
public class TestClient
{
  public static void main(String[] args)
  {
    SougouInput input = new SougouInput();
//    DefaultSkin skin = new DefaultSkin();
    GreenSkin skin = new GreenSkin();
    input.setSkin(skin);
    input.display();
  }

}

package com.pengo.sougou;

/**
 * @author pengo
 * @description: 搜狗输入法
 * @date: 2021/1/29
 */
public class SougouInput
{
  private AbstractSkin skin;

  public void setSkin(AbstractSkin skin)
  {
    this.skin = skin;
  }

  public void display()
  {
    skin.display();
    skin.testAbstract();
  }
}

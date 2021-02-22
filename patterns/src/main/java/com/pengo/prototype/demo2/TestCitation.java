package com.pengo.prototype.demo2;

/**
 * @author pengo
 * @description: 浅克隆
 * @date: 2021/2/10
 */
public class TestCitation
{
  public static void main(String[] args) throws Exception
  {
    test2();
  }

  private static void test2() throws Exception
  {
    Citation c1 = new Citation();
    Student s1 = new Student();
    s1.setName("zhangsan");
    c1.setStu(s1);

    Citation clone = c1.clone();
    clone.getStu().setName("lisi");

    c1.show();
    clone.show();
  }

  private static void test1() throws Exception
  {
//    Citation c1 = new Citation();
//    Citation c2 = c1.clone();
//
//    c1.setName("zhang san");
//    c2.setName("li si");
//
//    c1.show();
//    c2.show();
  }
}

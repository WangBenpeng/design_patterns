package com.pengo.star;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/3
 */
public class TestClient
{
  public static void main(String[] args)
  {
    Agent agent = new Agent();
    Star star = new Star("张三明星");
    Company company = new Company("李四公司");
    Fans fans = new Fans("王五粉丝");

    agent.setCompany(company);
    agent.setFans(fans);
    agent.setStar(star);

    agent.meeting();
    agent.business();

  }
}

package com.pengo.star;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/3
 */
public class Agent
{
  private Star star;
  private Fans fans;
  private Company company;

  public void setStar(Star star)
  {
    this.star = star;
  }

  public void setFans(Fans fans)
  {
    this.fans = fans;
  }

  public void setCompany(Company company)
  {
    this.company = company;
  }

  public void meeting()
  {
    System.out.println(star.getName() + " meeting with fans of " + fans.getName());
  }

  public void business()
  {
    System.out.println(star.getName() + " business with company of " + company.getName());
  }
}

package com.pengo.computer.before;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/1
 */
public class Computer
{
  private XiJieHardDisk disk;
  private IntelCpu cpu;
  private KingstonMemory memory;

  public XiJieHardDisk getDisk()
  {
    return disk;
  }

  public void setDisk(XiJieHardDisk disk)
  {
    this.disk = disk;
  }

  public IntelCpu getCpu()
  {
    return cpu;
  }

  public void setCpu(IntelCpu cpu)
  {
    this.cpu = cpu;
  }

  public KingstonMemory getMemory()
  {
    return memory;
  }

  public void setMemory(KingstonMemory memory)
  {
    this.memory = memory;
  }

  public void run()
  {
    System.out.println("电脑开始运行...");
    disk.get();
    cpu.run();
    memory.save();
  }
}

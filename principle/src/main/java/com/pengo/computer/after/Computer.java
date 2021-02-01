package com.pengo.computer.after;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/1
 */
public class Computer
{
  private HardDisk disk;
  private Cpu cpu;
  private Memory memory;

  public HardDisk getDisk()
  {
    return disk;
  }

  public void setDisk(HardDisk disk)
  {
    this.disk = disk;
  }

  public Cpu getCpu()
  {
    return cpu;
  }

  public void setCpu(Cpu cpu)
  {
    this.cpu = cpu;
  }

  public Memory getMemory()
  {
    return memory;
  }

  public void setMemory(Memory memory)
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

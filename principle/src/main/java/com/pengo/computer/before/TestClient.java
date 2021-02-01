package com.pengo.computer.before;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/1
 */
public class TestClient
{
  public static void main(String[] args)
  {
    Computer computer = new Computer();
    XiJieHardDisk disk = new XiJieHardDisk();
    IntelCpu cpu = new IntelCpu();
    KingstonMemory memory = new KingstonMemory();
    computer.setCpu(cpu);
    computer.setDisk(disk);
    computer.setMemory(memory);
    computer.run();
  }
}

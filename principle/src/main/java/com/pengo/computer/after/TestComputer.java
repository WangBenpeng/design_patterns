package com.pengo.computer.after;

/**
 * @author pengo
 * @description:
 * @date: 2021/2/1
 */
public class TestComputer
{
  public static void main(String[] args)
  {
    Computer computer = new Computer();
//    Memory memory = new KingstonMemory();
//    Cpu cpu = new IntelCpu();
//    HardDisk disk = new XiJieHardDisk();
    Memory memory = new Samsung();
    Cpu cpu = new AmdCpu();
    HardDisk disk = new WestDigitalHardDisk();
    computer.setCpu(cpu);
    computer.setDisk(disk);
    computer.setMemory(memory);
    computer.run();
  }
}

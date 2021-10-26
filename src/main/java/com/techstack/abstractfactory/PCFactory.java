package com.techstack.abstractfactory;

import com.techstack.beans.Computer;
import com.techstack.beans.PC;

public class PCFactory implements ComputerAbstractFactory{

    private String RAM;
    private String HDD;
    private String CPU;

    public PCFactory(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public Computer createComputer() {
        return new PC(this.RAM, this.HDD, this.CPU);
    }
}

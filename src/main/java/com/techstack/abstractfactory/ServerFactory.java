package com.techstack.abstractfactory;

import com.techstack.beans.Computer;
import com.techstack.beans.PC;
import com.techstack.beans.Server;
import com.techstack.factory.ComputerFactory;

public class ServerFactory implements ComputerAbstractFactory {

    private String RAM;
    private String HDD;
    private String CPU;

    public ServerFactory(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public Computer createComputer() {
        return new Server(this.RAM, this.HDD, this.CPU);
    }
}

package com.techstack.test;

import com.techstack.abstractfactory.ComputerFactory;
import com.techstack.abstractfactory.LaptopFactory;
import com.techstack.abstractfactory.PCFactory;
import com.techstack.beans.Computer;
import com.techstack.factory.ComputerType;

import java.util.Calendar;

public class ComputerClient {

    public static void main(String[] args) {

        /*Computer pc = ComputerFactory.createComputer(ComputerType.PC, "1GB", "256GB", "Intel Core 2 Duo");

        Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "32GB", "1TB", "Intel Core 2 Duo");

        Computer superComputer = ComputerFactory.createComputer(ComputerType.SUPER_COMPUTER, "64GB", "2TB", "Intel Core 2 Duo");*/

        Computer pc = ComputerFactory.createComputer(new PCFactory("1GB", "256GB", "Intel Core 2 Duo"));

        Computer server = ComputerFactory.createComputer(new PCFactory("32GB", "1TB", "Intel Core 2 Duo"));

        Computer laptop = ComputerFactory.createComputer(new LaptopFactory());
    }
}

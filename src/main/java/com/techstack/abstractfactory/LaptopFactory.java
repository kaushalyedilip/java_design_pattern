package com.techstack.abstractfactory;

import com.techstack.beans.Computer;
import com.techstack.beans.Laptop;

public class LaptopFactory implements ComputerAbstractFactory{

    @Override
    public Computer createComputer() {
        return new Laptop();
    }
}

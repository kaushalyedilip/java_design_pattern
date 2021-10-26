package com.techstack.abstractfactory;

import com.techstack.beans.Computer;

public class ComputerFactory {

    public static Computer createComputer(ComputerAbstractFactory computerAbstractFactory) {
        return computerAbstractFactory.createComputer();
    }
}

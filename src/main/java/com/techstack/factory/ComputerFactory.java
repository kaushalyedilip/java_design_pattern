package com.techstack.factory;

import com.techstack.beans.Computer;
import com.techstack.beans.PC;
import com.techstack.beans.Server;
import com.techstack.beans.SuperComputer;

public class ComputerFactory {

    public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {
        Computer computer = null;

        switch (type){
            case PC:
                computer = new PC(ram, hdd, cpu);
                break;
            case SERVER:
                computer = new Server(ram, hdd, cpu);
                break;
            case SUPER_COMPUTER:
                computer = new SuperComputer(ram, hdd,cpu);
        }
        return computer;
    }
}

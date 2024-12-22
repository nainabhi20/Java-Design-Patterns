package com.example.abstractfactory;

import com.example.abstractfactory.Factory.AsusManufacturer;
import com.example.abstractfactory.Factory.Manufacture;
import com.example.abstractfactory.Factory.MsiManufacturer;
import com.example.abstractfactory.Gpu.Gpu;
import com.example.abstractfactory.Monitor.Monitor;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int a = 1;
        Manufacture manufacture;
        if(a == 1) {
            manufacture = new MsiManufacturer();
        }else {
            manufacture = new AsusManufacturer();
        }
        Gpu gpu = manufacture.createGpu();
        Monitor monitor = manufacture.createMonitor();
        gpu.assemble();
        monitor.assemble();

    }
}

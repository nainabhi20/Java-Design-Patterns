package com.example.abstractfactory.Factory;

import com.example.abstractfactory.Gpu.Gpu;
import com.example.abstractfactory.Gpu.MsiGpu;
import com.example.abstractfactory.Monitor.MsiMonitor;

public class MsiManufacturer implements Manufacture {

    @Override
    public MsiGpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public MsiMonitor createMonitor() {
        // TODO Auto-generated method stub
        return new MsiMonitor();
    }
    
}

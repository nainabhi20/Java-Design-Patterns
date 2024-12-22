package com.example.abstractfactory.Factory;

import com.example.abstractfactory.Gpu.Gpu;
import com.example.abstractfactory.Monitor.Monitor;

public interface Manufacture {

    Gpu createGpu();
    Monitor createMonitor();

}
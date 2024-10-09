package com.i2c.tms.ratelimit;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

public class CpuLoadMonitor {
    private final CentralProcessor processor;
    private long[] prevTicks;

    public CpuLoadMonitor() {
        SystemInfo systemInfo = new SystemInfo();
        this.processor = systemInfo.getHardware().getProcessor();
        this.prevTicks = processor.getSystemCpuLoadTicks();
    }

    public double getCpuLoad() {
        long[] ticks = processor.getSystemCpuLoadTicks();
        double load = processor.getSystemCpuLoadBetweenTicks(prevTicks) * 100;
        prevTicks = ticks;
        return load;
    }
}
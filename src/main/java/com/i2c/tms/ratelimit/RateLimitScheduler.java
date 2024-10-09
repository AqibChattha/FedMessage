// RateLimitScheduler.java
package com.i2c.tms.ratelimit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RateLimitScheduler {
    private final CpuLoadMonitor cpuLoadMonitor;
    private final RateLimiterService rateLimiterService;

    public RateLimitScheduler(CpuLoadMonitor cpuLoadMonitor, RateLimiterService rateLimiterService) {
        this.cpuLoadMonitor = cpuLoadMonitor;
        this.rateLimiterService = rateLimiterService;
    }

    @Scheduled(fixedRate = 5000) // Check every 5 seconds
    public void updateRateLimit() {
        double cpuLoad = cpuLoadMonitor.getCpuLoad();
        rateLimiterService.adjustRateLimit(cpuLoad);
        System.out.println("CPU Load: " + cpuLoad + "%, Rate Limit: " + rateLimiterService.getRateLimit());
    }
}
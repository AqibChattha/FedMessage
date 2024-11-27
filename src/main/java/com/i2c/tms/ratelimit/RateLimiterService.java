// RateLimiterService.java
package com.i2c.tms.ratelimit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RateLimiterService {
    private int rateLimit = 10; // Default rate limit

    public int getRateLimit() {
        return rateLimit;
    }

    public void adjustRateLimit(double cpuLoad) {
        if (cpuLoad > 80) {
            rateLimit = 5; // Reduce rate limit if CPU load is high
        } else {
            rateLimit = 10; // Default rate limit
        }
        log.info("Rate limit adjusted to: {}", rateLimit);
    }
}
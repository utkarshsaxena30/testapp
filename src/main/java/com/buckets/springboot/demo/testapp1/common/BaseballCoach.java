package com.buckets.springboot.demo.testapp1.common;

import org.springframework.stereotype.Component;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice!";
    }
}

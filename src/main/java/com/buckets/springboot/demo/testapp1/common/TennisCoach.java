package com.buckets.springboot.demo.testapp1.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice serving for 30 minutes!";
    }
}

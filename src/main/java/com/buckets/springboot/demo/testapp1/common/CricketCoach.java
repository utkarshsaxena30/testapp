package com.buckets.springboot.demo.testapp1.common;

import com.buckets.springboot.demo.testapp1.rest.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }
}

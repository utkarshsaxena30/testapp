package com.buckets.springboot.demo.testapp1.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @PostConstruct()
    public void doStuffBeforeInit() {
        System.out.println("Doing stuff after init");
    }

    @PreDestroy()
    public void doStuffBeforeDestroy() {
        System.out.println("Doing stuff before destroy");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice serving for 30 minutes!";
    }
}

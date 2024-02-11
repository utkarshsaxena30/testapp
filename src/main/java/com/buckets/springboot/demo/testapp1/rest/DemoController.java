package com.buckets.springboot.demo.testapp1.rest;

import com.buckets.springboot.demo.testapp1.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Coach myCoach;
    @Autowired
    DemoController(@Qualifier("tennisCoach") Coach theCoach) {
        myCoach = theCoach;
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @GetMapping("/")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

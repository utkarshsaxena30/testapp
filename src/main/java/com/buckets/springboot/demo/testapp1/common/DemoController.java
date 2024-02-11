package com.buckets.springboot.demo.testapp1.common;

import com.buckets.springboot.demo.testapp1.rest.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Coach myCoach;
    @Autowired
    DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

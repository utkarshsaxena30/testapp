package com.buckets.springboot.demo.testapp1.rest;

import com.buckets.springboot.demo.testapp1.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Coach myCoach;
    private final Coach otherCoach;
    @Autowired
    DemoController(@Qualifier("tennisCoach") Coach theCoach, @Qualifier("tennisCoach") Coach theOtherCoach) {
        myCoach = theCoach;
        otherCoach = theOtherCoach;
    }

    @GetMapping("/")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Are instances same: " + (myCoach == otherCoach ? "true" : "false");
    }

}

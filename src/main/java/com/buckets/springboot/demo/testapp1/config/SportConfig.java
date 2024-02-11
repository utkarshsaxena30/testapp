package com.buckets.springboot.demo.testapp1.config;

import com.buckets.springboot.demo.testapp1.common.BaseballCoach;
import com.buckets.springboot.demo.testapp1.common.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("shohei")
    public Coach baseballCoach() {
        return new BaseballCoach();
    }
}

package com.university.library.subscriberservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SubscriberServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubscriberServiceApplication.class, args);
    }
}

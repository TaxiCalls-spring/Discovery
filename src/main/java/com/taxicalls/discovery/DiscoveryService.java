package com.taxicalls.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryService {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "discovery");
        SpringApplication.run(DiscoveryService.class, args);
    }
}
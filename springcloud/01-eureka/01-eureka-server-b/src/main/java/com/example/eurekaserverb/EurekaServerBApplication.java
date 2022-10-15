package com.example.eurekaserverb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启eureka的注册中心功能
public class EurekaServerBApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerBApplication.class, args);
    }

}

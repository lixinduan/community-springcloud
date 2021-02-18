package com.xin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class springcloud_eureka_9003 {
    public static void main(String[] args) {
        SpringApplication.run(springcloud_eureka_9003.class,args);
    }
}

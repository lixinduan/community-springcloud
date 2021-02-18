package com.xin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Springcloud_web_7001 {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud_web_7001.class,args);
    }
}

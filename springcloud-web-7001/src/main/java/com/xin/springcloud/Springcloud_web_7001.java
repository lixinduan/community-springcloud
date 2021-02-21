package com.xin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.xin.springcloud")
public class Springcloud_web_7001 {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud_web_7001.class,args);
    }
}

package com.xin.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xin.springcloud")
public class springservice_8001 {

    public static void main(String[] args) {
        SpringApplication.run(springservice_8001.class,args);
    }
}

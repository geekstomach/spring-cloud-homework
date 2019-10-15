package com.geekstomach.springcloudhomework.eurekafeignclientfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EurekaFeignClientFrontendApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignClientFrontendApplication.class, args);
    }
}

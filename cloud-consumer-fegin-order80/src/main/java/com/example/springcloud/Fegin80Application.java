package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author papi
 * @data 2020/4/25
 */
@SpringBootApplication
@EnableFeignClients
public class Fegin80Application {
    public static void main(String[] args) {
        SpringApplication.run(Fegin80Application.class,args);
    }
}

package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author papi
 * @data 2020/4/22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8004Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment8004Application.class,args);
    }
}

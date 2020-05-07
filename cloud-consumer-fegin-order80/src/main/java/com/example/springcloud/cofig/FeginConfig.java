package com.example.springcloud.cofig;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author papi
 * @data 2020/4/25
 */
@Configuration
public class FeginConfig {

    @Bean
    Logger.Level feginConfigLevel(){
        return Logger.Level.FULL;
    }

}

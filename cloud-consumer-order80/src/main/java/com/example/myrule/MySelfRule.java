package com.example.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author papi
 * @data 2020/4/24
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
    return new RandomRule();
    }
}

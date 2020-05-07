package com.example.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author papi
 * @data 2020/4/23
 */
@RestController
@Slf4j
public class PaymentConsulController {
    @Value("${server.port}")
    private  String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul(){
        return "spring consul result " + serverPort + "\t" +UUID.randomUUID().toString();
    }

}

package com.example.springcloud.service;

import com.example.springcloud.entities.CommonResult;
import com.example.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author papi
 * @data 2020/4/25
 */
@Component
@FeignClient(value = "cloud-payment-service")
public interface PaymentFeginService {

    //public int create(Payment payment);
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id);
}

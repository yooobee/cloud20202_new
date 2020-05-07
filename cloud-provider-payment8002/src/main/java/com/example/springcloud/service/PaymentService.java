package com.example.springcloud.service;

import com.example.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author papi
 * @data 2020/4/18
 */

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPayment(@Param("id") Long id);
}

package com.example.springcloud.dao;

import com.example.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author papi
 * @data 2020/4/18
 */
@Mapper
@Repository
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPayment(@Param("id") Long id);

}

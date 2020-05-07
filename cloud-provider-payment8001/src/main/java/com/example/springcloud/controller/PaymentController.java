package com.example.springcloud.controller;

import com.example.springcloud.entities.CommonResult;
import com.example.springcloud.entities.Payment;
import com.example.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author papi
 * @data 2020/4/18
 */
@RestController
@Slf4j
public class PaymentController {

    private static final String SERVERNAME = "cloud-payment-service";
    @Resource
    private PaymentService paymentService;
    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult creat(@RequestBody Payment payment){
        int restult = paymentService.create(payment);
        log.info("*****插入的结构：" + restult);
        if (restult > 0) {
            return new CommonResult(200,"插入数据库成功" + serverPort,  restult);
        }

         return new CommonResult(444,"插入数据库失败" + serverPort,null);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
         String str = "我跑跑都安排 阿斯顿发斯蒂芬艾弗森" ;
         String str2 = "我跑跑都安排发大水打法是否撒" ;
        Payment payment = paymentService.getPayment(id);
        Payment payment2 = paymentService.getPayment(id);
        System.out.println("str的值为：" + str + payment2 + payment );
        if (payment != null) {
            return new CommonResult(200,"查询成功" + serverPort ,  payment);
        }
        return new CommonResult(400,"查询成功" + serverPort ,  payment);//;new CommonResult(444,"查询失败" + id,null);
    }
    @GetMapping("/payment/discovery/")
    public Object discovery(){

        List<String> services = discoveryClient.getServices();
        for (String element : services){
            log.info("***** element :" + element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances(SERVERNAME);

        for (ServiceInstance instance : instances){
            log.info(instance.getHost()+"\t"+instance.getServiceId()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return  this.discoveryClient;
    }
    @GetMapping("/payment/lb")
    public String getPaymentLb(){
        return serverPort;
    }

}

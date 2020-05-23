package com.dk.payment.controller;

import com.dk.common.entity.CommonResult;
import com.dk.common.entity.CommonUtil;
import com.dk.common.entity.Payment;
import com.dk.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: TODO
 * @Author dk
 * @Date 2020/4/11 21:17
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/getAllPayment")
    public CommonResult<List<Payment>> getAllPayment(){
        log.info("port= " + port);
        seeDiscovery();
        return new CommonResult<List<Payment>>(200,"SUCCESS port="+port,paymentService.getAllPayment());
    }

    @PostMapping("/createPayment")
    public CommonResult<Integer> createPayment(String number){
        log.info("Payment    "+number);
        return new CommonResult<Integer>(200,CommonUtil.SUCCESS, paymentService.createPayment(number));
    }
    @PostMapping("/createPayment1")
    public CommonResult<Integer> createPayment1(@RequestBody Payment payment){
        log.info("Payment    "+payment.toString());
        return new CommonResult<Integer>(200,CommonUtil.SUCCESS, paymentService.createPayment1(payment));
    }

    //批量 mybatis插入
    @PostMapping("/bulkInsertPayment")
    public CommonResult bulkInsertPayment(@RequestBody List<Payment> list){
        log.info(list.toString());
        return new CommonResult(200, CommonUtil.SUCCESS,paymentService.bulkInsertPayment(list));
    }

    private void seeDiscovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("service = " + service);
        }

        List<ServiceInstance> payment = discoveryClient.getInstances("payment");
        for (ServiceInstance ser : payment) {
            log.info("ser.getServiceId()= "+ser.getServiceId()+" ,ser.getHost()="+ ser.getHost()+" ,ser.getInstanceId()="+ser.getInstanceId()
                    +" ,ser.getScheme()="+ser.getScheme() +" ,ser.getMetadata()="+ser.getMetadata()+" ,ser.getPort()="+
                    ser.getPort()+" ,ser.getUri()="+ser.getUri());
        }
    }

}

package com.dk.order.controller;

import com.dk.common.entity.CommonResult;
import com.dk.common.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description: 订单调用支付
 * @Author dk
 * @Date 2020/4/12 10:29
 **/
@RestController
@Slf4j
public class OrderController {

    private String URL="http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/getAllOrder")
    public CommonResult getAllOrder(){
        return restTemplate.getForObject(URL+"/payment/getAllPayment", CommonResult.class);
    }

    @GetMapping("/createOrder")
    public CommonResult createOrder(Payment payment){
        log.info("order    "+payment.toString());
        return restTemplate.postForObject(URL+"/payment/createPayment1",payment, CommonResult.class);
    }
}

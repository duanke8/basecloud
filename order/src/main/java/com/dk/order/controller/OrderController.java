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

//    private String URL="http://localhost:8001";
    private String URL="http://payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/getAllOrder")
    public CommonResult getAllOrder(){
        log.info(URL);
        return restTemplate.getForObject(URL+"/getAllPayment", CommonResult.class);
    }

    @GetMapping("/createOrder")
    public CommonResult createOrder(Payment payment){
        log.info(URL+" order    "+payment.toString());
        return restTemplate.postForObject(URL+"/createPayment1",payment, CommonResult.class);
    }
}

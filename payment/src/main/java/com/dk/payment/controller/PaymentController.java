package com.dk.payment.controller;

import com.dk.common.entity.CommonResult;
import com.dk.common.entity.CommonUtil;
import com.dk.common.entity.Payment;
import com.dk.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
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

    @GetMapping("/getAllPayment")
    public CommonResult<List<Payment>> getAllPayment(){
        log.info(port);
        return new CommonResult<List<Payment>>(200,"SUCCESS",paymentService.getAllPayment());
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

}

package com.dk.payment.service;

import com.dk.common.entity.Payment;

import java.util.List;

/**
 * @Description: TODO
 * @Author dk
 * @Date 2020/4/11 21:11
 **/
public interface PaymentService {
    List<Payment> getAllPayment();
    int createPayment(String number);
    int createPayment1(Payment payment);
    // 批量插入
    int bulkInsertPayment(List<Payment> list);
}

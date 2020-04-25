package com.dk.payment.service.impl;

import com.dk.common.entity.Payment;
import com.dk.payment.dao.PaymentDao;
import com.dk.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: TODO
 * @Author dk
 * @Date 2020/4/11 21:12
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public List<Payment> getAllPayment() {
        return paymentDao.getAllPayment();
    }

    @Override
    public int createPayment(String number) {
        return paymentDao.createPayment(number);
    }

    @Override
    public int createPayment1(Payment payment) {
        return paymentDao.createPayment1(payment);
    }

    @Override
    public int bulkInsertPayment(List<Payment> list) {
        return paymentDao.bulkInsertPayment(list);
    }
}

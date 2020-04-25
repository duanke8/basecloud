package com.dk.payment.dao;

import com.dk.common.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: TODO
 * @Author dk
 * @Date 2020/4/11 20:56
 **/
@Mapper
public interface PaymentDao {

    List<Payment> getAllPayment();

    int createPayment(@Param("number") String number);

    int createPayment1(Payment payment);

    int bulkInsertPayment(List<Payment> list);
}

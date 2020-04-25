package com.dk.payment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: TODO
 * @Author dk
 * @Date 2020/4/11 20:40
 **/
@SpringBootApplication
@Slf4j
public class PaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class);
        log.info("payment module  启动成功......................... ");
    }
}

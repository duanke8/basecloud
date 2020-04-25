package com.dk.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: TODO
 * @Author dk
 * @Date 2020/4/12 10:29
 **/
@SpringBootApplication
@Slf4j
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
        log.info("Order module  启动成功......................... ");
    }
}

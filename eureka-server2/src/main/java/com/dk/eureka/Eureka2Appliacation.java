package com.dk.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: TODO
 * @Author dk
 * @Date 2020/4/19 19:51
 **/
@Slf4j
@SpringBootApplication
@EnableEurekaServer
public class Eureka2Appliacation {
        public static void main(String[] args) {
                SpringApplication.run(Eureka2Appliacation.class);
                log.info("Eureka2Appliacation module  启动成功......................... ");
            }
}

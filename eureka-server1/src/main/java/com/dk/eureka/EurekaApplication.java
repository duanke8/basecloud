package com.dk.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: TODO
 * @Author dk
 * @Date 2020/4/12 19:44
 **/
@SpringBootApplication
@Slf4j
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
            SpringApplication.run(EurekaApplication.class,args);
            log.info("Eureka server module  启动成功......................... ");
        }

}

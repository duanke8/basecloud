package com.dk.payment.config;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.health.Status;
import com.netflix.appinfo.InstanceInfo.InstanceStatus;

import java.time.LocalDateTime;

@Component
@Slf4j
public class CustomHealthCheckHandler implements HealthCheckHandler {

    @Autowired
    CustomeHealthIndicator healthIndicator;

    @Override
    public InstanceInfo.InstanceStatus getStatus(InstanceInfo.InstanceStatus instanceStatus) {
        log.error(" 开始向注册中心发送心跳 ====================================");
        Status s = healthIndicator.health().getStatus();
        if(s.equals(Status.UP)) {
            System.out.println("服务状态为UP");
            return InstanceStatus.UP;
        } else {
            System.out.println("服务状态为DOWN");
            return InstanceStatus.DOWN;
        }

    }


}


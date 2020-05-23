package com.dk.payment.config;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class CustomeHealthIndicator implements HealthIndicator {

//    @Autowired
//    private RestTemplate template;

    @Override
    public Health health() {
        return new Health.Builder(Status.UP).build();

    }
}


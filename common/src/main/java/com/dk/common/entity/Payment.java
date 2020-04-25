package com.dk.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: TODO
 * @Author dk
 * @Date 2020/4/11 20:59
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Integer id;
    private String paymentNumber;
}

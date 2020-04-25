package com.dk.payment.test;

import com.alibaba.fastjson.JSON;
import com.dk.common.entity.Payment;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Description: TODO
 * @Author dk
 * @Date 2020/4/12 14:28
 **/
public class Test {
    public static void main(String[] args) {
        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(new Payment(null,"aaa"));
        payments.add(new Payment(null,"bbb"));
        HashMap<String, String> map = new HashMap<>();
        map.put("aa","a1");
        map.put("bb","b1");
        map.put("cc","c1");
        System.out.println(JSON.toJSONString(payments));
        System.out.println(JSON.toJSONString(map));
    }
}

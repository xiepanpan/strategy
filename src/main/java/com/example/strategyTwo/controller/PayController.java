package com.example.strategyTwo.controller;

import com.example.strategyTwo.service.AbstractPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 支付
 *
 * @author xiepanapn
 * @date 2018/11/14
 **/
@RestController
@RequestMapping("pay")
public class PayController {
    @Autowired
    private AbstractPayService payService;

    @GetMapping
    public void pay(@RequestParam String payType, @RequestParam String payFor) {
        payService.pay(payType, payFor);
    }
}

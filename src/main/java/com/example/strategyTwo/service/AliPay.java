package com.example.strategyTwo.service;

import com.example.strategyTwo.annotation.Pay;
import org.springframework.stereotype.Service;

/**
 * @author: xiepanpan
 * @Date: 2019/11/10
 * @Description:  支付宝支付
 */
@Service
@Pay("alipay")
public class AliPay implements PayStrategy {
    /**
     * 支付前准备支付参数
     *
     * @param payFor
     */
    @Override
    public boolean prePay(String payFor) {
        System.out.printf("-----------%s-----------\r\n", "欢迎使用支付宝");
        return true;
    }

    /**
     * 支付后处理支付回调结果
     *
     * @param payFor
     * @param isPaySuccess
     */
    @Override
    public void afterPay(String payFor, boolean isPaySuccess) {
        System.out.printf("-----------%s-----------\n", "支付宝支付成功 付款2000");
    }
}
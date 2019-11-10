package com.example.strategyOne.payport;

import com.example.strategyOne.PayState;

/**
 * @author: xiepanpan
 * @Date: 2019/11/10
 * @Description:  微信支付
 */
public class WechatPayment implements Payment{

    @Override
    public PayState pay(String userId, double amount) {
        System.out.println("欢迎使用微信支付");
        System.out.println("直接从微信红包扣款");

        return new PayState(200,"支付成功",amount);
    }
}
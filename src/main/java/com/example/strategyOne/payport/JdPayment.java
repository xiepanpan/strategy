package com.example.strategyOne.payport;

import com.example.strategyOne.PayState;

/**
 * @author: xiepanpan
 * @Date: 2019/11/9
 * @Description:  京东白条支付
 */
public class JdPayment implements Payment{

    @Override
    public PayState pay(String userId, double amount) {
        System.out.println("欢迎使用京东白条");
        System.out.println("查询账号余额，开始扣款");

        return new PayState(200,"支付成功",amount);
    }
}

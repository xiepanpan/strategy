package com.example.strategyOne.payport;

import com.example.strategyOne.PayState;

/**
 * @author: xiepanpan
 * @Date: 2019/11/9
 * @Description:  银联支付
 */
public class UnionPayment implements Payment{

    @Override
    public PayState pay(String userId, double amount) {
        System.out.println("欢迎使用银联卡支付");
        System.out.println("查询账号余额，开始扣款");

        return new PayState(200,"支付成功",amount);
    }
}

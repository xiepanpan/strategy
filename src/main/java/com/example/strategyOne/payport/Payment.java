package com.example.strategyOne.payport;

import com.example.strategyOne.PayState;

/**
 *  @author: xiepanpan
 *  @Date: 2019/11/9 23:29
 *  @Description:  支付方式
 */
public interface Payment {

    /**
     * 支付
     * @param userId
     * @param amount
     * @return
     */
    public PayState pay(String userId,double amount);
}

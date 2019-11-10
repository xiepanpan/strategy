package com.example.strategyOne;

import com.example.strategyOne.payport.PayType;
import com.example.strategyOne.payport.Payment;

/**
 * @author: xiepanpan
 * @Date: 2019/11/9
 * @Description:  订单类
 */
public class Order {

    /**
     * 用户id
     */
    private String userId;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 金钱数目
     */
    private double amount;

    public Order(String userId, String orderId, double amount) {
        this.userId = userId;
        this.orderId = orderId;
        this.amount = amount;
    }

    public PayState pay(PayType payType) {
        return payType.get().pay(this.userId,this.amount);

    }
}

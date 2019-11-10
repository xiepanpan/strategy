package com.example.strategyTwo.service;

/**
 * @author: xiepanpan
 * @Date: 2019/11/10
 * @Description:
 */
public abstract class AbstractPayService implements PayStrategy {
    protected String payType;

    /**
     * 支付
     *
     * @param payType
     * @param payFor
     */
    public void pay(String payType, String payFor) {
        this.payType = payType;
        boolean isPrepared = prePay(payFor);

        if (isPrepared) {
            System.out.println("------------支付请求已提交------------");
        } else {
            System.out.println("------------支付请求提交失败------------");
            return;
        }
        afterPay(payFor, true);
    }
}
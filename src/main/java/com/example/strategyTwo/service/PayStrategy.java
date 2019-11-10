package com.example.strategyTwo.service;

/**
 * 支付策略
 *
 * @author xiepanpan
 * @date 2018/11/14
 **/
public interface PayStrategy {

    /**
     * 支付前准备支付参数
     *
     * @param payFor
     * @return
     */
    boolean prePay(String payFor);

    /**
     * 支付后处理支付回调结果
     *
     * @param payFor
     * @param isPaySuccess
     */
    void afterPay(String payFor, boolean isPaySuccess);
}
